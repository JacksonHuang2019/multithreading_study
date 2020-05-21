package cn.ccic.day01;

/**
 * @quthor hzs
 * @create 05-21-2020
 * @time 16:18
 * @description 功能描述
 */
public class HowToCreateThread {

    static class  MyThread extends  Thread{
        @Override
        public void run() { System.out.println("Hello MyThread"); }
    }

    static class MyRun implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello MyRun");
        }

        public static void main(String[] args) {
            new MyThread().start();
            new Thread(new MyRun()).start();

            new Thread(() ->{
                System.out.println("Hello lambda");
            }).start();
        }
    }
}
