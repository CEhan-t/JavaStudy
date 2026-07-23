package com.situ.xiangmu;

import org.junit.Test;

public class ArrayDemo {
    @Test
    //数组的定义和遍历
    public void testArray() {
        int [] array = new int[4];//new一个对象
        array[0] = 123;
        array[1] = 456;
        array[2] = 789;
        array[3] = 101112;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("----------------------");
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
        //增强的for循环,不需要遍历下标，自动遍历数组中的元素，适用于只需要元素，不需要下标的情况
        //语法：for(数组元素的类型 数组元素的别名 : 数组名){}
        for (int item : array) {
            System.out.println(item);
        }
    }

    @Test
    //数组下标越界异常
    public void testArray2() {
        int[] array = new int[4];
        array[0] = 33;
        array[1] = 2;
        array[2] = 45;
        array[3] = 19;
        for (int i = 0; i <= array.length; i++) {
            //java.lang.ArrayIndexOutOfBoundsException
            System.out.println(array[i]);
        }
    }

    @Test
    //求数组的和
    public void testArray3() {
        int[] array = {33, 2, 45, 19};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
    }

    @Test
    //求数组中的最大值
    public void testArray4() {
        int[] array = {33, 2, 45, 19};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
    }

    @Test
    //求数组中的最小值
    public void testArray5() {
        int[] array = {33, 2, 45, 19};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min = " + min);
    }

    @Test
    public void testArray6() {
        int[] array = {33, 2, 45, 19};
        int max = getMax(array);
        System.out.println("max = " + max);
    }

    /**
     * 获取数组中的最大值
     * @param array 数组
     * @return 最大值
     */
    public int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Test
    public void testArray7() {
        int[] array = {33, 2, 45, 19};
        int min = getMin(array);
        System.out.println("min = " + min);
    }

    /**
     * 获取数组中的最小值
     * @param array 数组
     * @return 最小值
     */
    public int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Test
    //冒泡排序
    public void testArray8() {
        int[] array = {33, 2, 45, 19};
        sort1(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public void sort1(int[] array) {
        for (int i = 1; i <= array.length - 1; i++) {
            //i代表第几轮
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    @Test
    public void testArray9() {
        int[] array2 = {1,233,35,436,5};
        sort2(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
    public void sort2(int[] array2) {
        for(int i = 1; i <= array2.length - 1; i++){
            for(int j = 0; j < array2.length - i; j++){
                if(array2[j] > array2[j+1]){
                    int temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;
                }
            }
        }
    }

}
