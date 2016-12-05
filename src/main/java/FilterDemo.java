import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FilterDemo implements Demoable {

    private List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    private FilterDemo() {}

    static FilterDemo create() {
        return new FilterDemo();
    }

    public void runDemo() {
        oldFilter();
        System.out.println();
        newFilter();
        System.out.println();
    }

    private void oldFilter() {
        List<String> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(!(s.equals("b") || s.equals("d"))) {
                newList.add(s);
            }
        }

        for(String s : newList) {
            System.out.print(s);
        }
    }

    private void newFilter() {
        list.stream()
                .filter(s -> !(s.equals("b") || s.equals("d")))
                .forEach(System.out::print);
    }
}
