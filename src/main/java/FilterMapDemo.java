import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterMapDemo implements Demoable {
    private List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    private FilterMapDemo() {}

    static FilterMapDemo create() {
        return new FilterMapDemo();
    }

    public void runDemo() {
        oldMapFilter();
        System.out.println();
        newMapFilter();
        System.out.println();
    }

    private void oldMapFilter() {
        List<String> listCopy = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(!(s.equals("b") || s.equals("d"))) {
                s += "!";
                listCopy.add(s);
            }
        }

        for(String s : listCopy) {
            System.out.print(s);
        }
    }

    private void newMapFilter() {
        list.stream()
                .filter(s -> !(s.equals("b") || s.equals("d")))
                .map(s -> s += "!")
                .forEach(System.out::print);
    }
}
