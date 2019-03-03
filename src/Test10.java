public class Test10 {
    public static void main(String[] args) {
        Integer i = new Integer("10");
        if (i.toString().intern() == i.toString().intern()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
        System.out.println(i.toString().intern());
        System.out.println(i.toString());
    }
}
