import java.util.*;

public class ArrayListMagnet {
    public static void printAl(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three"); // (3,"three") и (4,"four")
        printAl(a); // 1

        a.remove(2);    // удаляется ссылка индекса 2 и строка: "two" - стерается и идет смещение и замещение
        if (a.contains("three")) {  // при присоединении присваивается следующий индекс((3,"three") и (4,"four")), но так как удален 2й индекс
            a.add("four");          // происходит перемещение и замещение=> ((2,"three") и (3,"four"))
        }
        printAl(a);     // 2

        if (a.indexOf("four") != 4) {   // при удалении индекса: 2 - индекс 4 не равен слову: "four", так как он пустой, после смещения и замещения => присваивается слово: "4.2"
            a.add(4, "4.2");            // при НЕ удалении индекса: 2 - индекс 4 равен именно слову:"four" после присоединения к "three"
        }                               // и автоматическиго присвоения индекса 4 ==> не напечатает
        printAl(a);     // 3


        if (a.contains("two")) {        // если содержит: "two" - то присоединяет всегда вконце
            a.add("2.2");
        }
        printAl(a);     // 4

        //System.out.println(a.get(4));

    }
}

