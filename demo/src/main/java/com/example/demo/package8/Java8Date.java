package com.example.demo.package8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description java 8 时间工具类
 * @date 2019-10-21 14:32
 */
public class Java8Date {

    public static void main(String[] args) {
        theDate();
    }

    private static void theDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime ：" + dateTime);

        LocalDate localDate1 = dateTime.toLocalDate();
        System.out.println("date ：" + localDate1);

        Month month = dateTime.getMonth();
        System.out.println("month ：" + month);
        /*int monthValue = dateTime.getMonthValue();
        System.out.println("month ：" + monthValue);*/
        int dayOfMonth = dateTime.getDayOfMonth();
        System.out.println("dayOfMonth ：" + dayOfMonth);

        String dateText = "20200201140255";
        LocalDate parse = LocalDate.parse(dateText, DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("parse :" + parse);
        System.out.println("parse1 :" + parse.format(DateTimeFormatter.ISO_DATE));

    }

}
