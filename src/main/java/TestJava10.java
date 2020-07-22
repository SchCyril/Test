import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestJava10 {

    public static void main(String[] args) {
        var list = List.of("lundi", "mardi", "mercredi");
        System.out.println(list);

        var arrayList = new ArrayList<>(List.of("lundi", "mardi", "mercredi"));

        var unmodifiable = Collections.unmodifiableList(arrayList);
        arrayList.set(2, "jeudi");
        System.out.println(unmodifiable.get(2));

        var copy = List.copyOf(arrayList);
        arrayList.set(2, "jeudi");
        System.out.println(copy.get(2));

        System.out.println(Arrays.asList("lundi", "mardi", "mercredi"));

        String yes = "jkrpzsjp";
        if (yes.isBlank()) {
            System.out.println("bonjour");
        } else {
            System.out.println("au revoir");
        }

        String testblank = " ";
        if (testblank.isBlank()) {
            System.out.println("bonjour");
        } else {
            System.out.println("au revoir");
        }
    }
}
