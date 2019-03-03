package dvumernuymassiv;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        int[][] x = new int[2][5];
//        int[][] y = new int[2][5];
//
//        System.out.println(x[1][3]);
//        System.arraycopy(x, 0, y, 0, x.length);
//        x[1][3] = 55;
//        System.out.println(y[1][3]);
        //System.out.println(x[1][3]);
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {10, 20, 30, 40, 50};
        System.arraycopy(x, 1, y, 1, 3);
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(x).length());

        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(y).length());


    }
}