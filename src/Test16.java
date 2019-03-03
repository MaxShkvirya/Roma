public class Test16 {
    public static void main(String s[]) {
           System.out.println(true ? false : true == true ? false : true);//сначала ==, потом второй тернарный(условный) оператор,только потом последним выполняется первый!
                                                                            // тернарный(условный) оператор. Ниже скобками показад приоритет
        // System.out.println(true ? false : ((true == true) ? false : true));
       //+ System.out.println(true ? false : true);
       //+-System.out.println(true ? false : true ? false : true); // сначала 2е выражение, потом первое

      //+  System.out.println(false ? false : true);
        String str = "";
    }
}

