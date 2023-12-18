package com.tencent.stu;

public abstract class Person {
    public int age;
    public String name;

    private int personPrivate;

    // 存在抽象方法时，类必须是抽象类
    public abstract void speak();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
