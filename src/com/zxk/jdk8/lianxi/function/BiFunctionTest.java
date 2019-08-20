package com.zxk.jdk8.lianxi.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * 接受两个参数并返回结果的函数
 * Created by admin on 2019/1/30.
 */
public class BiFunctionTest {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("d");
        list2.add("e");

//        list1.retainAll(list2);

        List<String> list = retainAll(list1, list2, (List t, List u) -> {
            if(t.retainAll(u)){
                return t;
            }else{
                return null;
            }
        });

        System.out.println(list);
        String.join(",", list);
    }

    public static   List retainAll(List<String> list1, List<String> list2, BiFunction<List,List,List> biFunction){
        if(list1 != null && list2 != null){
            List list = biFunction.apply(list1, list2);
            return list;
        }

        return null;
    }
}
