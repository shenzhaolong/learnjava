package com.tencent.stu;

public interface Action {
    // 默认被public final修饰
    int id = 5;
    public void eat();
    // 如果两个接口有重名的方法，则多实现只需重写一次
    // 7以前只能有抽象方法
    // 8可以有方法实现的方法,用default修饰，如果继承多个接口有重名的方法，则子类也必须重写
    default void drink() {
        System.out.println("origin drink");
    }
    // 8以后可以定义static方法
    // 9可以有私有方法,不用default关键
    private void log() {
        System.out.println("log");
    }
}
