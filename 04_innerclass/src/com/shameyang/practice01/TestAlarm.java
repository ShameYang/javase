package com.shameyang.practice01;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 测试手机类的闹钟功能（使用匿名内部类）
 * @date 2023/3/4 16:56:51
 */
public class TestAlarm {
    public static void main(String[] args) {
        new Cellphone().alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床啦");
            }
        });

        new Cellphone().alarm(new Bell() {
            @Override
            public void ring() {
                System.out.println("放假回家啦");
            }
        });
    }
}
