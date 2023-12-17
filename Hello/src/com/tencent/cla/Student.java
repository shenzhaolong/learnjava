package com.tencent.cla;

import java.util.Scanner;
// 最基础的包，不需要import也能用
import java.lang.System;
import java.util.StringJoiner;
import java.util.ArrayList;

public class Student {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    // 构造方法只能用一个修饰符来修饰
    public Student() {
        this.age = 10;
    }

    // 当自己定义了有参构造方法，虚拟机不会自动生成无参构造方法
    public Student(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        System.out.println(s1);
        /*
        java为字符直接赋值的变量有个特殊空间：StringTable,JDK7开始在堆，以前在栈
        字符串常量池是一个表，相同的串指向同一个空间
        String a = "123";
        字符串比较两种方法：equals和equalsIgnoreCase后者忽略大小写
         */
        String s2 = "abc";
        String s3 = "ABc";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        /*
        StringBuilder做易于修改的String对象
         */
        StringBuilder stringBuilder1 = new StringBuilder("abc");
        stringBuilder1.append("def");
        System.out.println(stringBuilder1);
        /*
        StringJoiner快速拼接对象,8以后
         */
        int[] arr = {1, 2, 3};
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        for (int i: arr) {
            stringJoiner.add(i + "");
        }
        System.out.println(stringJoiner);
        /*
        JDK8以前无变量参与的String字面量加法会在编译器优化
        有变量参与会在底层使用StringBuilder，再toString()，因此每个加号产生两个对象
        再JDK8以后会底层预估长度建立缓冲区
         */

        // 泛型前面写就行
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
    }
}
