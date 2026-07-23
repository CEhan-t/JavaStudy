package com.situ.xiangmu;

import org.junit.Test;
import java.util.Random;
import java.util.Scanner;


public class FirstTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    //猜数字游戏
    public void test01() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // 随机生成1~1000的数字
        int target = random.nextInt(1000) + 1;

        while (true) {
            System.out.println("猜吧！");
            int input = sc.nextInt();

            // 输入0退出程序
            if (input == 0) {
                System.out.println("程序退出");
                break;
            }

            if (input > target) {
                System.out.println("太大了");
            } else if (input < target) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
        sc.close();
    }

    @Test
    //根据月份判断天数
    public void test02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("31天");
                break;
            case 3:
                System.out.println("31天");
                break;
            case 4:
                System.out.println("30天");
                break;
            case 5:
                System.out.println("31天");
                break;
            case 2:
                System.out.println("请输入年份：");
                int year = scanner.nextInt();
                break;
        }
    }

    @Test
    //根据月份判断天数（考虑闰年）
    public void test03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
                System.out.println("31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println("请输入年份：");
                int year = scanner.nextInt();
                // 判断闰年
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29天");
                } else {
                    System.out.println("28天");
                }
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
