package continueabc;

public class B {
    public static void main(String[] args) {
        big_loop:
        for (int i = 0; i < 3 ; i++) {
            try {
                for (int j = 0; j < 3 ; j++) {
                    if (i == j) continue;       // продолжает выпонение, без учёта finally
                    else if (i > j) continue big_loop;  // продолжает выпонение выходя из for, но вниз через finally
                    System.out.print("A");
                }
            } finally {
                System.out.print("B"); // обязательно заходит
            }
            System.out.print("C");
        }
    }
}
