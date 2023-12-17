package com.tencent.stu;

public class Student extends Person{
    // 子类不能继承父类任何构造方法
    // 子类拥有父类所有变量方法，但private不能访问
    // 虚拟机将非private final static的方法放入虚方法表，继承时替换成真正的方法地址
    // 所有对象继承自Object,里面有五个虚方法 toString hashCode euqal clone finalize
    // 方法中调用时，符号先从局部，再类成员，再父类，只能调用一层super


    public static String teacher;
    public Student() {
        this(0, "0");
    }

    // 子类构造方法默认先访问父类的无参构造方法
    public Student(int age, String name) {
        // 父类没有无参构造方法必须手动首先调用
        super(age, name);
        this.age = age;
        this.name = name;
    }

    // 重写时，方法的访问权限至少和父类一样广
    // 返回类型是父类返回类型或者其子类（协变covariant）
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("age");
        sb.append(age).append(", name: ").append(name).append(", teacher:").append(teacher);
        return sb.toString();
    }
}
