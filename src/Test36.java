import javax.xml.bind.SchemaOutputResolver;
import java.util.Date;

public class Test36 {
    Integer i;
    int j;

    public static void main(String[] args) {
        //  System.out.println(String.format("%f",42.25));

        Test36 t = new Test36();
        t.go();

        Date today = new Date();
        System.out.println(String.format("%tA, %<tB %<td", today)); //неделя, месяц, день
        System.out.println(String.format("%tA, %tB %td", today, today, today));

    }

    public void go() {
        // j = i; // пытыется примитиву int рисвоить переменную(null), которая не является ни примитивом ни строкой.
        System.out.println(j);
        System.out.println(i);
    }

}
