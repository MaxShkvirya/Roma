package staticprioritets;

class Test25 extends ATest25 {
    public String s;

    static {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    public Test25(String str) {
        super();        // нет смысла писать super(); так как компилятор по умолчанию и так зайдёт в коструктор ATest25(потому что Test25 extends ATest25)
        this.s = str;
        System.out.println("3");
    }

    public final static void main(String[] args) {
        System.out.println("4");
        Test25 test25 = new Test25("Test");
        //     test25.s="Test";
        System.out.println("5");
    }
}
// 6, 1, 4, 7, 8, 2, 3, 5
