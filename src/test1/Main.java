package test1;

public class Main implements I {
    public static void main(String[] args) {
        int a = 5;
        test(++a);
    }

    static void test(int a) {
        a += EASY + a++;
        System.out.println(a);
    }
}
