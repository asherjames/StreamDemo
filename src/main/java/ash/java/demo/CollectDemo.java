package ash.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.*;

class CollectDemo implements Demoable {

    private List<Car> cars = Arrays.asList(
            new Car("Alfa", 4),
            new Car("BMW", 6),
            new Car("Ferrari", 8),
            new Car("Porsche", 6)
    );

    private CollectDemo() {
    }

    static CollectDemo create() {
        return new CollectDemo();
    }

    @Override
    public void runDemo() {
        findAverageCylinders();
        makeCylinderMap();
    }

    private void findAverageCylinders() {
        Double averageCylinders = cars.stream()
                .collect(Collectors.averagingInt(c -> c.cylinders));

        out.println(averageCylinders);
    }

    private void makeCylinderMap() {
        Map<Integer, String> map = cars.stream()
                .collect(Collectors.toMap(
                        c -> c.cylinders,
                        c -> c.make,
                        (car1, car2) -> car1 + ", " + car2
                ));

        out.println(map);
    }

    class Car {
        String make;
        int cylinders;

        Car(String make, int cylinders) {
            this.make = make;
            this.cylinders = cylinders;
        }
    }
}