public class Test13 {
      static String[][] String = {{"String"}}; // ошибка поскольку тип java.lang.String неприводим к типу String
                                                // класс String создать можно, но к типу String привести его нельзя поскольку слово String задикларировано
//        static {
//        System.out.println(String.class);         // 2
//    }

    public static void main(String[] args) {      // 3
        System.out.println(String.class);         // 4
    }


}
