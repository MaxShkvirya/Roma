package thread;

/*
 * Пояснение: При запуске потока методом start()
 * вызывается метод run() этого потока. Поскольку метод start()
 * переопределен, а явного вызова метода run() не было, то ничего больше выполняться не будет.
 */
class MyThread extends Thread {
    public void run() {
        System.out.print("Running ");
    }
    public void start() {
        System.out.print("Starting ");
    }
}
