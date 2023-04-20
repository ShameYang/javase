package com.shameyang.practice02;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 内部类练习
 * @date 2023/3/5 16:08:07
 */
public class Practice02 {
    public static void main(String[] args) {
        new A().m1();
    }
}

class A {
    public void m1() {
        class B {
            private final String name = "abc";
            public void show() {
                System.out.println(name);
            }
        }
        B b = new B();
        b.show();
    }
}