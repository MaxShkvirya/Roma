    public class Test20 {
        static { i = 5; }   // выполнена команда i=5, а затем i=6.
        static int i = 6;

        public static void main(String[] args) {
            System.out.println(i);
        }
}
