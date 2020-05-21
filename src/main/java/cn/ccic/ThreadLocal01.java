package cn.ccic;

/**
 * @quthor hzs
 * @create 05-19-2020
 * @time 16:36
 * @description 功能描述
 */
public class ThreadLocal01 {
    public static void main(String[] args) {

        ThreadLocal<M> tl = new ThreadLocal<>();
        tl.set(new M());

        tl.remove();
    }
}
