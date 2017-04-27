package ash.java.demo;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

class ReduceDemo implements Demoable {

    private List<Bike> bikes = Arrays.asList(
            new Bike("Ducati", 996),
            new Bike("Honda", 599),
            new Bike("Vespa", 200)
    );

    @Override
    public void runDemo() {
        findBiggest();
        accumulateBikes();
    }

    private void findBiggest() {
        bikes.stream()
                .reduce((bike, bike2) -> bike.displacement > bike2.displacement ? bike : bike2)
                .ifPresent(bike ->
                    out.println(bike.make + " \n" + bike.displacement)
                );
    }

    private void accumulateBikes() {
        Bike result = bikes.stream()
                .reduce(new Bike("", 0), (bike, bike2) -> {
                    bike.make += bike2.make + " ";
                    bike.displacement += bike2.displacement;
                    return bike;
                });

        out.println(result.make + " " + result.displacement);
    }

    class Bike {
        String make;
        int displacement;

        Bike(String make, int displacement) {
            this.make = make;
            this.displacement = displacement;
        }
    }
}
