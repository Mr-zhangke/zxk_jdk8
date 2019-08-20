package com.zxk.jdk8.lianxi.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * 接收一个参数并返回结果的函数
 * Created by admin on 2019/1/30.
 */
public class FunctionTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("bb");
        list.add("c");

//        List<String> list1 = testToList(list, item-> item == null ? "":item);
//        System.out.println(list1);

        Boolean flag = testIsExist(list, item -> item.equals("b") ? true : false);
        System.out.println(flag);
        if(flag){
            System.out.println("aaa");
        }
    }

    /**
     * 测试
     * @param list
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> List<R> testToList(List<T> list, Function<T, R> function){

        if (list != null && !list.isEmpty()){
            List returnList = new ArrayList();
            list.forEach(item -> {
                R r = function.apply(item);
                returnList.add(r);
            });
            return returnList;
        }

        return null;
    }

    /**
     * 测试定义的匿名函数是否存在
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T,R> R testIsExist(List<T> list, Function<T, R> function){
        if (list != null && !list.isEmpty()){
            List<R> flagList = new ArrayList<>();
            list.forEach(item -> {
                R r = function.apply(item);
                flagList.add(r);
            });

            for (R flag : flagList){
                if((Boolean) flag)
                    return flag;
            }

            return flagList.get(0);

        }
        return null;

    }

}
