package ash.java.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.lang.System.*;

class FlatMapDemo implements Demoable {

    private List<Outer> outers = new ArrayList<>();

    @Override
    public void runDemo() {
        populateList();
        flatten();
    }

    private void populateList() {
        IntStream
                .range(1, 5)
                .forEach(i -> outers.add(new Outer("Outer " + i)));

        outers.forEach(outer ->
            IntStream
                    .range(1, 4)
                    .forEach(i -> outer.inners.add(new Inner("Inner " + i + " ")))
        );
    }

    private void flatten() {
        outers.stream()
                .flatMap(outer -> outer.inners.stream())
                .forEach(inner -> out.print(inner.innerName));
    }

    class Inner {
        String innerName;

        Inner(String name) {
            innerName = name;
        }
    }

    class Outer {
        String outerName;

        List<Inner> inners = new ArrayList<>();

        Outer(String name) {
            outerName = name;
        }
    }
}
