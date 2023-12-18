package com.tencent.stu;

import java.util.Scanner;

public final class StudentTest extends Object{

    public static void getEat(Action action) {
        action.eat();
    }
    public static void main(String[] args) {
        // 静态成员8以前放在方法区，8以后的放在堆空间的静态区
        // 类的全类名为包+类名
        // com.tencent.stu.Student student2 = new com.tencent.stu.Student();
        // 同一个包不需要导入包，两包的同名类需要用全类名
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
        /*
        final修饰方法，该方法不进入子类虚表
        修饰类，该类不能被继承
        修饰变量，该变量不可变,必须立即赋值，单词必须大写，用下划线分开
         */
        /*
        private 同类
        empty 可被同包使用
        protected 只能子类
        public都可以
         */
        // 局部代码块：在方法里
        {

        }
        StudentTest.getEat(student1);
    }
}
