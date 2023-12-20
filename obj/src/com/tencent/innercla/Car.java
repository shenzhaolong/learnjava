package com.tencent.innercla;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show() {
        Engine e = new Engine();
        System.out.println(e.engineName);
    }
    /*
    成员内部类
    静态内部类
    局部内部类
    匿名内部类 *
     */

    // 成员内部类 地位和成员方法类似
    // 16以后可以定义静态变量
    public class Engine { // 成员内部类 地位和成员方法类似
        String engineName;
        public void show() {
            System.out.println(engineName);
            // 内部类可以访问内部类的所有成员
            System.out.println(carName);
            System.out.println(Car.this.carAge); // 获取外部成员变量的方式
        }
    }

    // 静态内部类只能访问外部类的静态变量
    static class Engine2 {

    }
}
