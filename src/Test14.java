public class Test14 {


    public static void main(String[] args) {
//        Test14 test14 = new Test14();
//        test14.s;
//        test14.s1;
//        test14.s2;
//        test14.s3;
        String str="";

        String s;               // компилятор даже не видит
        String s1 = "";         //попадает в пул строк и ссылается уже на то же что уже создано на
        String s2 = " ";
        String s3 = "Maks";
        System.out.println(s1==str);
        System.out.println(s1.equals(str));

       // System.out.println(s==s3);
    }
}
