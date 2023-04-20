package com.shameyang.houserent.service;

import com.shameyang.houserent.domain.House;

/**
 * @author ShameYang
 * @version 1.0
 * @description TODO 业务层
 * @date 2023/3/2 17:49:43
 */
public class HouseService {

    private House[] houses; //保存House对象
    private int houseNums = 0;
    private int idCount = 0;

    public HouseService(int size) {
        //new houses
        houses = new House[size];
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }

    //add方法
    public boolean add(House newHouse) {
        //判断是否可以继续添加，不能则扩容
        if (houseNums == houses.length) {
            House[] newHouses = new House[houses.length + 5];
            for (int i = 0; i < houses.length; i++) {
                newHouses[i] = houses[i];
            }
            houses = newHouses;
//          return false;
        }
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCount);
        return true;
    }

    //del方法
    public void del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i; // 标记数组下标i的元素
            }
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
    }

    //search方法
    public House search(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
}
