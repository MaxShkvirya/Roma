public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = " бутылок (бутылки)";

        while (beerNum > 0) {
            System.out.println(" Возьми одну. ");
            System.out.println(" Пусти по кругу. ");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                word = " бутылка";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на столе");
            } else {
                System.out.println(" нет бутылок пива на столе!");
            }
        }
    }
}
