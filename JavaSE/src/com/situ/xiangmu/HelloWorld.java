package com.situ.xiangmu;

import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    //arg:argument 参数
    public static void main(String[] args){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld.main");
        System.out.println("HelloWorld.main");

        //变量: variable
    }

    @Test
    //字符运算
    public void test01(){
        System.out.println("Hello World.test01");
        char ch = 'a';//字符‘a’转化为整数为97
        System.out.println(ch);//a
        System.out.println(ch + 1);//97+1=98
        // a为97 ch='a'为char类型，1为int类型，小转大自动转换
        System.out.println(ch + 2);//97+2=99
        System.out.println((char)(ch + 1));//b 从大到小强制类型转换  98为b
        System.out.println((char)(ch + 2));//c 从大到小强制类型转换  99为c

        double d = 3.14;
        int num = (int)d;
        System.out.println(num);//3
    }

    @Test
    //单目运算符
    public void test02(){
        System.out.println("Hello World.test02");
        int i=0;
        i++;//i=1
        ++i;//i=2
        System.out.println(i++);//i=2
        System.out.println(++i);//i=4

    }

    @Test
    //逻辑运算符
    public void test03(){
        int num1 = 3;
        int num2 = 5;
        //&&短路
        System.out.println(num1 < 0 && num1++ < num2);//false
        System.out.println(num1);//3
        System.out.println(num2);//5

        //||短路
        System.out.println(num1 > 0 || num1++ < num2);//true
        System.out.println(num1);//3
        System.out.println(num2);//5


        System.out.println(num1 < 0 & num1++ < num2);//false
        System.out.println(num1);//4
        System.out.println(num2);//5

        //||短路
        System.out.println(num1 > 0 | num1++ < num2);//true
        System.out.println(num1);//5
        System.out.println(num2);//5
    }

    @Test
    //卫语句
    public void test04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int score = scanner.nextInt();
        //卫语句1
        if (score < 0 || score > 100) {
            System.out.println("这是非法输入");
            //方法后面的代码不再执行
            return;
        }
        //卫语句2...

        //合法输入
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score < 90) {
            System.out.println("良好");
        } else if (score >= 70 && score < 80) {
            System.out.println("一般");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }

    @Test
    public void test05(){
        int age = 28;
        //豆豆加加
        System.out.println("我的年龄是23岁");
        System.out.println("我的年龄是" + age + "岁");
        System.out.println(10 + 20 + "" + 30);//"3030"
        System.out.println("" + 10 + 20 + 30);//"102030"
    }

    @Test
    public void test06() {
        int i=1;
        while(i <= 5){
            System.out.println("Hello World");
            i++;
        }
    }

    @Test
    public void test07(){
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test08(){
        int count = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    @Test
    public void test09() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test10() {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test11() {
        //i,j,k
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;
                }
                System.out.println("j: " + j);
            }
        }
    }

    @Test
    //打印菱形
    public void test12() {
        for (int i = 1; i <= 4; i++) {
            System.out.print("*");
        }
        System.out.println();  //****

        for (int i = 1; i <= 4; i++) {
            System.out.println("*");
        }
        //*
        //*
        //*
        //*
    }

    @Test
    //打印矩形
    public void test13() {
        for (int i = 1; i <= 3; i++) {
            //i=1: 代表打印第一行
            //i=2: 代表打印第二行
            //i=3: 代表打印第三行
            for (int j = 1; j <= 4; j++) {
                //j代表这一行打印多少个
                System.out.print("*");
            }
            //打印完一行之后需要换行
            System.out.println();
        }
    }

    @Test
    //打印直角三角形
    public void test14() {
        // i=1 j=1
        // i=2 j=2
        // i=3 j=3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //    *
        //    **
        //    ***
        //    ****
        //    *****
    }

    @Test
    //打印乘法口诀表
    public void test15() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                //很多时候先用一个假的数据先把框架搭建起来，先把流程走完，再把假的变成真是的
                //System.out.println("2*7=14\t");
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    @Test
    //猜数字
    public void test16() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // 随机生成1~1000的数字
        int target = rand.nextInt(1000) + 1;

        while (true) {
            System.out.println("猜吧！");
            int input = scanner.nextInt();

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
        scanner.close();
    }

    @Test
    //打印乘法口诀表
    public void test17() {
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }

}
