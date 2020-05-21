package cn.ccic;

import java.lang.ref.WeakReference;

/**
 * @quthor hzs
 * @create 05-18-2020
 * @time 22:29
 * @description 弱引用  一次性
 */
public class T03  {
    public static void main(String[] args) {
        WeakReference<M> m = new WeakReference<>(new M());
        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());
    }
}
