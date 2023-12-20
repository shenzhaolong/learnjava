package com.tencent.stu;

// 接口里没有方法则是标记性接口
public class Student extends Person implements Action, Cloneable{
    // 子类不能继承父类任何构造方法
    // 子类拥有父类所有变量方法，但private不能访问
    // 虚拟机将非private final static的方法放入虚方法表，继承时替换成真正的方法地址
    // 所有对象继承自Object,里面有五个虚方法 toString hashCode euqal clone finalize
    // 方法中调用时，符号先从局部，再类成员，再父类，只能调用一层super


    // 构造代码块先于构造函数,每次创建对象执行
    public static String teacher;
    private int subject;

    {
        teacher = "no teacher";
    }

    // 加载类的时候执行
    static {
        teacher = "static no teacher";
    }
    public Student() {
        this(0, "0");
    }

    @Override
    public void speak() {
        System.out.println("Student Speak");
    }

    // 子类构造方法默认先访问父类的无参构造方法
    public Student(int age, String name) {
        // 父类没有无参构造方法必须手动首先调用
        super(age, name);
        this.age = age;
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Student Eat");
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // 默认浅拷贝
    // 深拷贝需要自己写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
