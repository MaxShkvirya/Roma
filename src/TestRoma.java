class A {
    private static int counter = 0;

    public static int getInstanceCount() {
        return counter;
    }

    public A() {
        counter++;
    }
}

public class TestRoma {
    public static void main(String arg[]) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(A.getInstanceCount()); //1
        System.out.println("1" + 2 + 3); // 1 2 3
        int i, j;
        i = 10;
        j = 20;
        while(++i < --j);
        System.out.println(i);
    }
}


