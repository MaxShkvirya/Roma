package superistatic;

class Test7 extends Test6 {
    void test1() {
        System.out.println("B.test1");
    }
    static void test2() {
 //       super.test2();
    }
    public static void main(String[] args) {
        Test6 a = new Test7(); a.test2();
    }
}
