package cn.ccic.t_thread;

/**
 * @quthor hzs
 * @create 05-21-2020
 * @time 15:57
 * @description 功能描述
 */
public class TextRunnable1  implements  Runnable{

    @Override
    public void run() {

        for (int i =0 ;i< 100;i++) {
            System.out.println("Runnable1:" + i);
        }

    }
}
