package testing;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        double c = (double) (a/b);
        String str = String.format("%1.4f", c);
        System.out.println(str);
    }
}
