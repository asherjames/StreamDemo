package ash.java.demo;

import java.util.stream.IntStream;

import static java.lang.System.*;

class IntStreamDemo implements Demoable {

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
