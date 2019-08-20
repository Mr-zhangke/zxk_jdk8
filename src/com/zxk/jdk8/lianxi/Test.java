package com.zxk.jdk8.lianxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by admin on 2019/2/14.
 */
public class Test {

    public static void main(String[] args) {

        List<String> astrictMapperlist = new ArrayList<>();

//        List<String> astrictlist = astrictMapperlist.stream().map(e->e.getDictId()).collect(Collectors.toList());


//        System.out.println(astrictlist);

        List<String> list1 = new ArrayList<>();
        list1.add("3");
        List<String> list2 = new ArrayList<>();
        list2.add("3");


        list1.removeAll(list2);

        System.out.println("hjh"+list1);

        String[] strings = new String[list1.size()];

        String [] aa = list1.toArray(strings);
        System.out.println(aa);
        System.out.println(aa.length);
        System.out.println(aa.toString());
        System.out.println(list1.toString().substring(1,list1.toString().length()-1));
        String[] bb = list1.toString().substring(1,list1.toString().length()-1).split(",");
        System.out.println("bb"+bb.length);

        List<String> list3 = new ArrayList<>();
        list3.add("6");

        list1 = list3;
        System.out.println(list1);


        String[] arr = {};
        int lent = arr.length;
        System.out.println("哈哈"+arr.length);
        System.out.println(String.valueOf(lent));

        test1();
    }

    public static void test1(){
        String snNos = "33,11";
        String[] snNo = {"33"};

        String[] dataSnNos = snNos.split(",");
        List<String> dataSnNoList = Arrays.asList(dataSnNos);
        List<String> snNoList = Arrays.asList(snNo);
        List<String> aa = new ArrayList<>(dataSnNoList);
        List<String> bb = new ArrayList<>(snNoList);
//        dataSnNoList.removeAll(snNoList);
        aa.removeAll(bb);
        System.out.println("家"+aa);
        if(!dataSnNoList.isEmpty()){
            String str = aa.toString();
            String data = str.substring(1,str.length()-1);
            System.out.println(data);
        }
        dataSnNoList.forEach(System.out :: println);
    }

}
