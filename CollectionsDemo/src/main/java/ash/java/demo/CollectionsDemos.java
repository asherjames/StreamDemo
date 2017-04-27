package ash.java.demo;

import java.util.stream.Stream;

public class CollectionsDemos {

    public static void main(String[] args) {
        Stream.of(new CollectionOperations()).forEach(Demoable::runDemo);
    }
}
