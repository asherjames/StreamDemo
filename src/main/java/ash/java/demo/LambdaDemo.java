package ash.java.demo;

import static java.lang.System.*;

public class LambdaDemo implements Demoable {

    private LambdaDemo() {}

    static LambdaDemo create() {
        return new LambdaDemo();
    }

    @Override
    public void runDemo() {
        useLambdas();
    }

    private void useLambdas() {
        Adder addTwo = a -> a + 2;
        Adder addThree = a -> a + 3;
        Adder addFour = a -> a + 4;

        doAdd(addTwo);
        doAdd(addThree);
        doAdd(addFour);
    }

    private void doAdd(Adder a) {
        for(int i = 0; i < 5; i++) {
            int j = a.add(i);
            out.println(j);
        }
    }
}

@FunctionalInterface
interface Adder {
    int add(int a);
}
