import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MapDemo implements Demoable {

    private List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    private MapDemo() {}

    static MapDemo create() {
        return new MapDemo();
    }

    public void runDemo() {
        oldMap();
        System.out.println();
        newMap();
        System.out.println();
    }

    private void oldMap() {
        List<String> listCopy = new ArrayList<>(list);

        for(int i = 0; i < listCopy.size(); i++) {
            String a = listCopy.remove(i);
            a += "!";
            listCopy.add(i, a);
            System.out.print(listCopy.get(i));
        }
    }

    private void newMap() {
        list.stream()
                .map(s -> s + "!")
                .forEach(System.out::print);
    }
}
