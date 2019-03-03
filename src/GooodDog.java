class GoodDog {
    private int size;


    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav gav!");
        } else if (size > 14) {
            System.out.println("Vuf vuf!");
        } else {
            System.out.println("Tyaf tyaf");
        }
    }
}

class GoodTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("First dog:" + one.getSize());
        System.out.println("Two dog:" + two.getSize());
        one.bark();
        two.bark();
    }

}



