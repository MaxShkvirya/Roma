package superistatic;
/*Пояснение: Нельзя использовать ключевое слово super в static методах.
  */
class Test6 {
    private static void test1() {
        System.out.println("A.test1");
    }

    static void test2() {
        test1();
    }
}

