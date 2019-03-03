/*Конструктор Boolean(String) создаёт объект со значением true, если в него передана строка "true" (в любом регистре).
 В противном случае будет создан объект со значением false.
Поэтому объекты будут иметь следующие значения:
bo1 – true
bo2 – false
bo3 – true
bo4 – false
При сравнении объектов с одинаковым значением (bo1 и bo3, bo2 и bo4) метод equals() возвращает значение true.
 */
public class Test21 {
//    static Boolean bo1 = new Boolean("true");
//    static Boolean bo2 = new Boolean(false);
    static String bo1 = new String("true");
    static String bo2 = new String("false");

    public static void main(String[] args) { // true true
//        Boolean bo3 = new Boolean(bo1); // в новый обект копируется содержимое ссылки bo1
//        Boolean bo4 = new Boolean("bo2"); //в новый обект копируется содержимое ссылки bo2
        String bo3 = new String(String.valueOf(bo1)); // true true
        String bo4 = new String(String.valueOf(bo2));
        System.out.println(bo1.equals(bo3));
        System.out.println(bo2.equals(bo4));
        System.out.println(bo1==bo3);
    }
}
