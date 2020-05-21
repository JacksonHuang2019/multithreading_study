package cn.ccic;

import org.openjdk.jol.info.ClassLayout;

import java.io.IOException;

/**
 * @quthor hzs
 * @create 05-13-2020
 * @time 11:28
 * @description 功能描述
 */
public class T01 {
    public static void main(String[] args) {

        M m = new M();
//        o.hashCode();
//        System.out.println(ClassLayout.parseInstance(m).toPrintable());
////        synchronized (m){
////
////            System.out.println(ClassLayout.parseInstance(m).toPrintable());
////
////        }

        m = null;
        System.gc();
    }

}
