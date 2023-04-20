package com.shameyang.houserent.view;

import com.shameyang.houserent.domain.House;
import com.shameyang.houserent.service.HouseService;

import java.util.Scanner;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 界面
 * @date 2023/3/2 17:34:32
 */
public class HouseView {

    private boolean loop = true; //控制显示菜单
    private char key = ' '; //接收用户选择
    Scanner scanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(5);

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("-------------房屋出租系统----------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退     出");
            System.out.println("请输入你的选择(1-6): ");
            key = scanner.next().charAt(0);
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    System.out.println("查 找");
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    System.out.println("退 出");
                    break;
            }

        } while (loop);
    }

    //listHouses查看房屋列表
    public void listHouses() {
        System.out.println("-----------房屋列表-------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); //得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
    }

    //addHouse添加房屋
    public void addHouse() {
        System.out.println("----------添加房屋-------------");
        System.out.println("姓名: ");
        String name = scanner.next();
        System.out.println("电话: ");
        String phone = scanner.next();
        System.out.println("地址: ");
        String address = scanner.next();
        System.out.println("月租: ");
        int rent = scanner.nextInt();
        System.out.println("状态: ");
        String state = scanner.next();
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("添加成功~");
        } else {
            System.out.println("添加失败！");
        }
    }

    //delHouse删除房屋
    public void delHouse() {
        System.out.println("------------删除房屋------------");
        System.out.println("请选择要删除的房屋编号(-1退出): ");
        int index = scanner.nextInt();
        if (index == -1) {
            return;
        }
        System.out.println("确认是否删除(Y/N): ");
        char c = scanner.next().charAt(0);
        if (c == 'y') {
            houseService.del(index);
            System.out.println("删除成功");
        } else if (c == 'n') {
            System.out.println("放弃删除");
        }
    }

    //searchHouse查找房屋
    public void searchHouse() {
        System.out.println("------------查找房屋------------");
        System.out.println("请输入要查找的房屋标号(-1退出): ");
        int findId = scanner.nextInt();
        if (findId == -1) {
            return;
        }
        House house = houseService.search(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("房屋不存在");
        }
    }

    //updateHouse修改房屋
    public void updateHouse() {
        System.out.println("------------修改房屋------------");
        System.out.println("请输入要修改的房屋标号(-1退出): ");
        int index = scanner.nextInt();
        if (index == -1) {
            return;
        }
    }
}

