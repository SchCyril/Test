import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestJava9 {

    public static void main(String[] args) {

        List<String> listString = List.of("lundi", "mardi", "mercredi", "jeudi", "vendredi", "samedi", "dimanche");

        System.out.println(listString);

        Map<Integer, String> mapString = Map.of(
                1, "lundi",
                2, "mardi",
                3, "mercredi",
                4, "jeudi",
                5, "vendredi",
                6, "samedi",
                7, "dimanche"
        );

        System.out.println(mapString);

        System.out.println(listString.stream()
                .takeWhile(d -> !d.equals("mercredi")).collect(Collectors.toList()));

        System.out.println(listString.stream()
                .dropWhile(d -> !d.equals("mercredi")).collect(Collectors.toList()));

        System.out.println(Stream.ofNullable(null));
    }
}
