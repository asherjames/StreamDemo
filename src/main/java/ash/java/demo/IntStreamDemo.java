package ash.java.demo;

import java.util.stream.IntStream;

import static java.lang.System.*;

public class IntStreamDemo implements Demoable {

    private IntStreamDemo() {}

    static IntStreamDemo create() {
        return new IntStreamDemo();
    }

    @Override
    public void runDemo() {
        simpleIntStream();
    }

    private void simpleIntStream() {
        IntStream.range(1,5)
                .forEach(i -> {
                    i += 1;
                    out.print(i + " ");
                });
    }
}
