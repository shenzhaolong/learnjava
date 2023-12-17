package com.tencent.shen;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        /*
         * 基本数据类型
         * 整数：int 32 long 64 short 16 byte 8
         * 浮点数：float 32 double 64
         * 字符：char 16
         * 布尔 boolean 1
         * 字面量默认为int, double
         * 10000L, 1.5F
         */
        // 小驼峰：变量 方法
        // 大驼峰：类名
        System.out.println("input a number:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
        // byte short char运算时都直接转成int
        byte b1 = 20, b2 = 30;
        // byte b3 = b1 + b2; 报错需要强制类型转换
        // byte short int long float double遇到更高的类型会做隐式转换
        System.out.println('a' + 10); // 计算ascii
        System.out.println(123 + "123"); // 123123
        // Java支持++ -- += 三目运算符
        // switch在5之前只能是char int short byte,5之后枚举，8之后string
        String s1 = "sss";
        s1 += 'a';
        switch (s1) {
            case "zzz": // 只能是字面量
                System.out.println("get zzz");
                break;
            case "lll":
                System.out.println("get lll");
                break;
            default:
                System.out.println("get default");
        }
        // jdk12后新特性
        switch (s1) {
            case "sssa" -> {
                System.out.println("get sssz jdk12");   // 无需break
            }
            case "bbba" ->  System.out.println("get bbba jdk12");
            default -> {
                System.out.println("get default jdk12");
            }
        }
        // java支持do while循环
        do {

        } while(false);
        // 两种数组写法
        int[] array1 = new int[] {1, 2, 3};
        // int array1[];
        int[] array2 = {1, 2, 3};
        /*
        引用数据类型赋值null
        其他赋值0
        字符赋值 '/u0000'
        布尔赋值false
         */
        int[] array3 = new int[10];
        System.out.println(array3[0]);
        System.out.println(array3.length);
    }
}
