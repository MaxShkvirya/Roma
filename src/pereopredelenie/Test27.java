package pereopredelenie;

import static java.lang.System.out;

public class Test27 {
    private String s;

    private Test27(String s) {
        this.s = s;
    }

    private String getS() {
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Test26))
            return false;
        Test27 test27 = (Test27) obj;
        return (s.equals(test27.getS()));
    }
    @Override
    public int hashCode(){
        int code = 11;
        int k = 7;
       // code = k*code + x;   // это для int x;
        code = k*code + s.hashCode();
        return code;
    }

    public static void main(String[] args) {
        Test27 b1 = new Test27("one");
        Test27 b2 = new Test27("one");
        out.println(b1.equals(b2));

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}

