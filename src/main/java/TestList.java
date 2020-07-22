import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestList {
    public static void main(String[] args) {
        System.out.println(Stream.of("bonjour", "aurevoir").collect(Collectors.toList()));
    }
}
