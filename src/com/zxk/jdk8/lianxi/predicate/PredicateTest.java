package com.zxk.jdk8.lianxi.predicate;

import java.util.function.Predicate;

/**
 * 对给定的输入参数执行操作，返回一个boolean类型的结果（布尔值函数）
 * Created by admin on 2019/1/30.
 */
public class PredicateTest {

    public static void main(String[] args) {

//        Boolean flag = testPredicate(0, item -> item != 0);


//        Boolean flag = testPredicate("bb", item -> { return item != null;});

//        Predicate pp = null;
//        Predicate qq = null;
//        Predicate pp1 = item -> true;
//        Predicate pp2 = item -> true;
//        Predicate pp3 = item -> true;
//        Predicate pp4 = item -> true;
//
//        pp = pp1.and(pp2);
//        qq = pp3.and(pp4);
//        Predicate rr = pp.and(qq);



        //判断为空的要放到最后一个
        Boolean flag = testPredicateAdd("bb", item -> { return item != null;}, item -> { return item.equals("bb");}, item -> { return item.startsWith("b");});
        System.out.println(flag);


    }

    public static <T> Boolean testPredicate(T num, Predicate<T> predicate){
        return predicate.test(num);
    }

    public static <T> Boolean testPredicateAdd(T num, Predicate<T>... predicate){
        if(predicate.length > 1){
            int length = predicate.length;
            Predicate pp = item -> true;
            for(int i = 0; i < length; i++){
//                Predicate p = predicate[i];
//                int j = i+1;
//                Predicate p1 = predicate[j];
//                pp = p.and(p1);
//                if(length - j == 1){
//                    break;
//                }

//                if(pp == null){
//                    pp = predicate[i];
//                }else{

                    pp = pp.and(predicate[i]);
//                }
            }


            return pp.test(num);
        }else{

            return predicate[0].test(num);

//            return null;
        }
    }
}
