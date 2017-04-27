package ash.java.demo;

import static java.lang.System.*;

class LambdaDemo implements Demoable {

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

    private void doAdd(Adder adder) {
        for(int i = 0; i < 5; i++) {
            int j = adder.add(i);
            out.println(j);
        }
    }
}

@FunctionalInterface
interface Adder {
    int add(int a);
}
