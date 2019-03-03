public class Test22 {
    public static void main(String[] args) {
        int i, j;
        i = 10;
        j = 20;
        while (++i < --j) ; //  В языке Java синтаксически допустимы пустые операторы.
        System.out.println(i);
    }
}
