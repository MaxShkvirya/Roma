public class Test4 {
    public static void main(String[] args) {
        Test4 test4=new Test4();
        test4.divide(0,3);
    }
    public void divide(int a, int b) {
        try {
            int c = a / b;
        } catch (Exception e) {
            System.out.print("Exception ");
        } finally {
            System.out.println("Finally");
        }
    }
}
