import java.util.Random;

public class TestRandom {

    public static void main(String[] args) {
        getRandomNumberOneToFifty();
        System.out.println("");
        getRandomOneToTen();

    }

    public static void getRandomNumberOneToFifty() {
        new Random().ints(5, 1, 50).forEach(System.out::println);
    }

    public static void getRandomOneToTen() {
        new Random().ints(2, 1, 10).forEach(System.out::println);
    }
}
