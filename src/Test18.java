public class Test18 {
        private double x = 2;
        public static void multX(Test18 a, double n){
            a.setX(a.getX()*n);
        }
        public double getX() {return x;}
        public void setX(double xn) {x = xn;}
        public static void trippleValue(double x){
            x*=3;
        }
        public static Test18 resetX(Test18 a){
            a = new Test18();
            return a;
        }
        public static void main(String[] args) {
         //   trippleValue(x);
            Test18 anA = new Test18();
         //   multX(anA,x);
            resetX(anA);
         //   x=0;
            System.out.print(anA.getX());
        }
    }
