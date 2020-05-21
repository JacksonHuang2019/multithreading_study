package cn.ccic;

import java.lang.ref.SoftReference;

/**
 * @quthor hzs
 * @create 05-18-2020
 * @time 22:04
 * @description 功能描述
 */
public class T02 {
    public static void main(String[] args) {

        SoftReference<byte[]> m = new SoftReference<>(new byte[1024 * 1024 * 10]);
        System.out.println(m.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(m.get());
        byte[] b = new byte[1024 * 1024 * 15];
        System.out.println(m.get());
    }
}
