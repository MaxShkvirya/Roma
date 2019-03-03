public class Test11 {


    public static void main(String[] args) {

        String a = "a";// new Str       попадает в пул(POOL или бассейн)строковых объектов, который находится в куче.

        String b = new String("b"); // создается объект в куче

        System.out.println(b == a);//false hashcode

        System.out.println(b.equals(a));//false

        b = a;

        System.out.println(b == a);//true

        System.out.println(b.equals(a));//true

        String c = "c";
        //String d = new String("c");
        String d = new String("c").intern(); //перемещает объект строки в пул(POOL или бассейн)строковых объектов, который находится в куче.
        System.out.println(c==d);
        System.out.println(c.equals(d));



    }

}
