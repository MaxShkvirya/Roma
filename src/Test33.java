import java.util.Arrays;

abstract class Test33 {
//    int then;
//    int goto;
//    int if;
//    int else;


    private static int getHalf(int i) {
        return i / 2;
    }

    public static void main(String[] str) {
        // Test33 test33=new Test33(); ощибка
//        int half = getHalf(0);
//        System.out.println("Result is:" + half);


        int[] ar = {1, 2, 3, 4, 5};
        System.arraycopy(ar, 0, ar, 2, 2);//берем массив ar с 0-го элемента и копируем его в ar новый(виртуальный)и накладываем на него
                                        // со старого ar,начиная со 2-го индекса, 2 элемента(накладка на копию).

        //System.arraycopy(ar, 0, ar, 0, 5); // (Object src, int  srcPos, Object dest, int destPos)
        System.out.println(Arrays.toString(ar));
        // output: [1, 2, 1, 2, 5]
    }

//    void modifyTotal(Object ... args) {}
////    void doAnyth(int i, Object...args) {}
////    void confirm(Object...args, int i) {}
////    void setRate(int... i, float... f) {}
////    void doSmth(Object ...args) {}








}
