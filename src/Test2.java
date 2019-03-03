//
// последовательность печати
public class Test2 {
    {
        System.out.println("Block");
    }

    Test2() {
        System.out.println("Z");
    }

    int x = getX();

    static {
        System.out.println("Static block");
    }

    public int getX() {
        System.out.println("X variable");
        return 5;
    }

    static int y = getY();

    public static int getY() {
        System.out.println("Y variable");
        return 6;
    }


    public static void main(String[] args) {
        Test2 m = new Test2();
    }
}

