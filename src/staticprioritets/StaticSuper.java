package staticprioritets;

class StaticSuper {
    static {
        System.out.println("Родительский статический блок ");
    }

//    {
//        System.out.println("1");
//    }

    StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}

