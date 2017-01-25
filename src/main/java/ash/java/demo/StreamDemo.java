package ash.java.demo;

import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream.of(
                MapDemo.create(),
                FilterDemo.create(),
                FilterMapDemo.create(),
                IntStreamDemo.create(),
                LambdaDemo.create(),
                CollectDemo.create(),
                FlatMapDemo.create(),
                ReduceDemo.create()
        ).forEach(Demoable::runDemo);
    }
}
