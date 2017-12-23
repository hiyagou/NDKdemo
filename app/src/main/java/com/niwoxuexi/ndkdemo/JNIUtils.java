package com.niwoxuexi.ndkdemo;

/**
 * Created by zhuxiaocheng on 2017/8/30.
 */

public class JNIUtils {

    // 加载native-lib
    static {
        System.loadLibrary("native-lib");
    }

    //java调C中的方法都需要用native声明且方法名必须和c的方法名一样
    public native String stringFromJNI();

}
