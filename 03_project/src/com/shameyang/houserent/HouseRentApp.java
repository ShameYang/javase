package com.shameyang.houserent;

import com.shameyang.houserent.view.HouseView;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 房屋出租系统程序入口
 * @date 2023/3/2 16:17:37
 */
public class HouseRentApp {
    public static void main(String[] args) {
        //创建HouseView对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("已退出房屋出租系统");
    }
}
