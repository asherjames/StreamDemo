package ash.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

class MapDemo implements Demoable {

    private List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    @Override
    public void runDemo() {
        oldMap();
        out.println();
        newMap();
        out.println();
    }

    private void oldMap() {
        List<String> listCopy = new ArrayList<>(list);

        for(int i = 0; i < listCopy.size(); i++) {
            String a = listCopy.remove(i);
            a += "!";
            listCopy.add(i, a);
            out.print(listCopy.get(i));
        }
    }

    private void newMap() {
        list.stream()
                .map(s -> s + "!")
                .forEach(out::print);
    }
}
