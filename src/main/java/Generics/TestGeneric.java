package Generics;

public class TestGeneric<T> {

    private T test;

    public TestGeneric() {

    }

    public TestGeneric(T test) {
        this.test = test;
    }

    public T getTest() {
        return test;
    }

    public void setTest(T test) {
        this.test = test;
    }
}


class specific {
    public static void main(String[] args) {
        TestGeneric<String> tg = new TestGeneric<>("bonjour");
        System.out.println(tg.getTest());


        TestGeneric<String> tg1 = new TestGeneric<>("au revoir");
        System.out.println(tg1.getTest());

        TestGeneric<Integer> tg2 = new TestGeneric<>(5);
        System.out.println(tg2.getTest());

        tg1.setTest("bonjour");
        System.out.println(tg1.getTest());
    }
}
