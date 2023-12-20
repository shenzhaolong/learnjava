package com.tencent.innercla;

import com.tencent.stu.Action;
import com.tencent.stu.Student;

public class CarTest {
    public static void main(String[] args) {
        // 成员内部类必须归属一个外部类
        Car.Engine engine = new Car().new Engine();
        // 静态内部类只是一个命名空间
        Car.Engine2 engine2 = new Car.Engine2();

        // 局部内部类，可以访问局部变量
        class MainInner {

        }
        // 匿名内部类，new 类名或者方法名，并重写方法
        Action action = new Action() {

            @Override
            public void eat() {
                System.out.println("inner action");
            }

            @Override
            public void drink() {
                Action.super.drink();
            }
        };
        action.eat();
    }
}
