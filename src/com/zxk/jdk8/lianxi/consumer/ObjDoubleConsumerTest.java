package com.zxk.jdk8.lianxi.consumer;

import java.util.function.ObjDoubleConsumer;

/**
 * Created by admin on 2019/1/30.
 */
public class ObjDoubleConsumerTest  {

    public static void main(String[] args) {
        ObjDoubleConsumer<String> objDoubleConsumer = (s, a) -> System.out.println(s+a);
        objDoubleConsumer.accept("金额", 6.6);
    }
}
