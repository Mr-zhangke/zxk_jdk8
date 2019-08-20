package com.zxk.jdk8.lianxi.consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * 提供一个T类型的输入参数，不返回执行结果Consumer<T>
 * Created by zxk on 2019/1/29.
 */
public class ConsumerTest {



    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("hello");
        System.out.println(s.toString());
        Consumer<StringBuilder> consumer = s1 -> s1.append("work!");
        consumer.accept(s);
        System.out.println(s.toString());


        Consumer<StringBuilder> consumer1 = (str) -> str.append(" Bob!");
        consumer.andThen(consumer1).accept(s);
        System.out.println(s.toString());
    }


}
