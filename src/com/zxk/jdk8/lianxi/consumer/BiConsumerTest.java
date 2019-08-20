package com.zxk.jdk8.lianxi.consumer;

import java.util.function.BiConsumer;

/**
 * 提供两个自定义类型的输入参数，不返回执行结果
 * Created by admin on 2019/1/30.
 */
public class BiConsumerTest {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        BiConsumer<String, StringBuilder> biConsumer = ( a,  b) ->{
//          b.append(a);
//        };
//
//        biConsumer.accept("hello", sb);
//
//        System.out.println(sb.toString());	// Hello Jack!

        sb = append("hello", sb, (a, b)-> b.append(a));
        System.out.println(sb.toString());

    }

    public static StringBuilder append(String a, StringBuilder sb, BiConsumer<String, StringBuilder> biConsumer){

        biConsumer.accept(a, sb);

        return sb;
    }

}
