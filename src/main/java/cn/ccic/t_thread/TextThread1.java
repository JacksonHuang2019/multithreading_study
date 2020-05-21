package cn.ccic.t_thread;

/**
 * @quthor hzs
 * @create 05-21-2020
 * @time 15:53
 * @description 功能描述
 */
public class TextThread1 {
    public static void main(String[] args) {

        TextRunnable1 r1 = new TextRunnable1();

        Thread t = new Thread(r1);
        t.start();

        for (int i =0;i<100;i++) {
            System.out.println("main Thread: " + i);
        }
    }

}
