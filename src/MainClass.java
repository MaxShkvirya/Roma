public class MainClass {
    public static void main(String args[]) {
        int k = 2;
        int m = 10;

        // System.out.println("k = " + k);
        //   System.out.println("m = " + m);
        int s = 1 >> k++ + ++m - --k - m-- << 1; // 2
        System.out.println("s = " + s);
        //System.out.println(3 + 11 - 1 - 10 = 3 -1 = 2 );    1 >> 2 << 1     0001 / 00 0001 / 00 0010 => 2!
    }
}

