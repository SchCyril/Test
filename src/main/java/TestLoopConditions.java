public class TestLoopConditions {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            int reste = i % 2;
            if (reste == 0) {
                System.out.println(i + " = pair");
            } else {
                System.out.println(i + " = impair");
            }
        }

        int integers = 0;
        do {
            System.out.println(integers);
            integers++;
        } while (integers < 10);
    }

}
