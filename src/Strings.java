public class Strings {
    public static void main(String[] args) {
        String s1 = new String("Bicycle");
        String s2 = new String("bicycle");
        String s3 = new String("bicycle");
//        System.out.println(s1.equals(s2) == s2.equals(s1));//true.сравнивается содержимое 2 раза,А ПОТОМ сравниваются результаты !!!
//        System.out.println(s1.equals(s2)); // false сравнивается содержимое
//        System.out.println(s1 == s2); // false сравниваются ссылки на строки

        System.out.println(s2.equals(s3));

    }
}
