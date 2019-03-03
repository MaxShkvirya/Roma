package staticprioritets;

public class Test23 {
    {
        System.out.println("1");
    }

    Test23() {
        System.out.println("2");
    }

    static {
        System.out.println("3");
    }

    {
        System.out.println("4");
    }

    public static void main(String[] args) {    // 3 1 4 2
        new Test23();
    }
}
