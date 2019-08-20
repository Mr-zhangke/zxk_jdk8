package com.zxk.jdk8.lianxi.consumer;

import java.util.function.DoubleConsumer;

/**
 * Created by admin on 2019/1/30.
 */
public class DoubleConsumerTest {

    public static void main(String[] args) {
//        DoubleConsumer doubleConsumer = System.out :: println;

        DoubleConsumer doubleConsumer = d -> System.out.println(d);
        doubleConsumer.accept(5.5);
    }
}
