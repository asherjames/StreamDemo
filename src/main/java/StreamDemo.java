import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        Stream.of(
                MapDemo.create(),
                FilterDemo.create(),
                FilterMapDemo.create()
        ).forEach(Demoable::runDemo);
    }
}
