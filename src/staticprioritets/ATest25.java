package staticprioritets;

class ATest25 {

    static {
        System.out.println("6");
    }

    {
        System.out.println("7");
    }

    public ATest25() {

        System.out.println("8");
    }
}


// 6, 1, 4, 7, 8, 2, 3, 5
