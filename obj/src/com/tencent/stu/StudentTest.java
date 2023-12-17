package com.tencent.stu;

import java.util.Scanner;

public class StudentTest extends Object{
    public static void main(String[] args) {
        // 静态成员8以前放在方法区，8以后的放在堆空间的静态区
        //
        Student student1 = new Student(1, "222");
        Student.teacher = "szl";
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println(student1);

        Person person = new Student();
        if (person instanceof Student) {
            System.out.println("person is Student instance");
        } else System.out.println("person is not Student instance");

        // jdk14新特性
        if (person instanceof Student student2) {
            System.out.println("如果是Student,那么强转并赋值给student");
        }
    }
}
