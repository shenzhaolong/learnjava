package com.tencent.u2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class U2 {
    public static void main(String[] args) throws ParseException {
        /*
        7之前
        Date是JDK里的JavaBean类，精确到毫秒
        空参表示当前时间
        有参表示指定时间
         */
        Date date1 = new Date();
        System.out.println(date1.getTime());

        Date date2 = new Date(System.currentTimeMillis());
        System.out.println(date2);

        /*
        SimpleDataFormat可以对Data和字符串之间做处理
        parse(string) format(Date) yyyy-MM-dd HH:mm:ss
         */
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yy年MM月dd日");
        System.out.println(simpleDateFormat1.format(date1));
        String str1 = "2023-11-11 11:11:11";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date3 = simpleDateFormat2.parse(str1);
        System.out.println(simpleDateFormat2.format(date3));
    }
}
