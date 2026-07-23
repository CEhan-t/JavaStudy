package com.situ.xiangmu;

import org.junit.Test;

import java.util.Scanner;

public class WorkTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    @Test
    public void test1() {
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

    @Test
    public void test2() {
        int num1 = 3;
        int num2 = 5;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }

    @Test
    public void test3() {
        // 奇数和
        int sumOdd = 0;
        // 偶数和
        int sumEven = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                // 偶数
                sumEven += i;
            } else {
                // 奇数
                sumOdd += i;
            }
        }

        System.out.println("1~100所有奇数的和：" + sumOdd);
        System.out.println("1~100所有偶数的和：" + sumEven);
    }


    @Test
    public void test4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩：");
        int score = sc.nextInt();

        // 合法性校验
        if (score < 0 || score > 100) {
            System.out.println("成绩输入不合法！");
            return;
        }

        int level = score / 10;
        switch (level) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("一般");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
        sc.close();
    }
}
