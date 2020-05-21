package cn.ccic;

/**
 * @quthor hzs
 * @create 05-18-2020
 * @time 21:40
 * @description 功能描述
 */
public class M {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
