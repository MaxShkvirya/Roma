package pereopredelenie;
import static java.lang.System.out;

public class Test26 {
    public static void main(String[] args) {
        Test251 b1 = new Test251("one");
        Test251 b2 = new Test251("one");
        //      Test251 b3 = b1;
        //    out.println(b1 == b2);
        //     out.println(b1 == b3);
        //     out.println(b2 == b3);
        out.println(b1.equals(b2));     // false. Сделать переопределение equals(1-ссылки,2-отнощение к этому классу,3-содержание) и
                                        // не забыв переопределить HashCode тогда будет true
//        out.println(b1.equals(b3));
//        out.println(b3.equals(b2));
    }
}