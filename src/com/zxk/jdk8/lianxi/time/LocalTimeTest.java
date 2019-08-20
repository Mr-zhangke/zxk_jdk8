package com.zxk.jdk8.lianxi.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by admin on 2019/2/20.
 */
public class LocalTimeTest {

    public static void main(String[] args) {
        LocalTimeTest localTimeTest = new LocalTimeTest();
        try {
            localTimeTest.testLocalDateTime();
        }catch (Exception e){

        }

    }

    public void testLocalDateTime() throws  Exception{
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("当前时间"+currentTime);
        System.out.println(currentTime.toString());

        LocalDate localDate = currentTime.toLocalDate();
        System.out.println(localDate);

        LocalTime localTime = currentTime.toLocalTime();
        System.out.println(localTime);

        Month month = currentTime.getMonth();
        System.out.println(month);
        System.out.println(month.getValue());

        int day = currentTime.getDayOfMonth();
        System.out.println(day);

        int seconds = currentTime.getSecond();
        System.out.println(seconds);

        LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
        System.out.println("date2: " + date2);
        // 12 december 2014
        LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);
        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);
        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);

    }
}
