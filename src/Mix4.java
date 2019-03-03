public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int coutn = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while (x < 20) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;   // counter(0-19) is always 0 + 1!
            coutn = coutn + 1;
            coutn = coutn + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(coutn + " " + m4a[1].counter);
    }

    public int maybeNew(int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1; }
        return 0;
    }
}
