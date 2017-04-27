package ash.java.demo;

import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream.of(
                new MapDemo(),
                new FilterDemo(),
                new FilterMapDemo(),
                new IntStreamDemo(),
                new LambdaDemo(),
                new CollectDemo(),
                new FlatMapDemo(),
                new ReduceDemo()
        ).forEach(Demoable::runDemo);
    }
}
