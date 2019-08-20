package com.zxk.jdk8.lianxi.stream;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by admin on 2019/2/19.
 */
public class StreamTest {

    public static void main(String[] args) {
        // 计算空字符串
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        System.out.println(strings);
        long count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println(count);

        long count3 = strings.stream().filter(s -> s.length() == 3).count();
        System.out.println(count3);

        List<String> list1 = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(list1);
        list1.forEach(System.out :: println);

        String s1 = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
        System.out.println(s1);

        List<String> s2 = strings.stream().map(s -> s+"a1").distinct().collect(Collectors.toList());
        System.out.println(s2);

        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
        IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());


        //10个随机数
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out :: println);



    }
}
