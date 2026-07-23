package com.situ.xiangmu;

import org.junit.Test;

import java.util.Arrays;

public class Day03Test {
    @Test
    // 使用System.arraycopy方法复制数组
    public void test1() {
        String[] original = {"da","daa","daaa","daaaa"};
        String[] copy = new String[original.length];
        //复制整个数组
        System.arraycopy(original, 0, copy, 0, original.length);

        //复制部分数组(仅复制索引1-2的元素)
        String[] part = new String[2];
        System.arraycopy(original, 1, part, 0, 2);

        System.out.println(Arrays.toString(copy));
        //结果：[da, daa, daaa, daaaa]
        System.out.println(Arrays.toString(part));
        //结果：[daa, daaa]
    }

    @Test
    // 使用Arrays.copyOf和Arrays.copyOfRange方法复制数组
    public void test2(){
        int[] original = {10, 20, 30, 40, 50};

        // 1. 复制整个数组（新数组长度=原数组）
        int[] copy1 = Arrays.copyOf(original, original.length);

        // 2. 复制并扩容（长度6，多余位置补0）
        int[] copy2 = Arrays.copyOf(original, 6);

        // 3. 复制指定范围（索引1到4，即元素20、30、40）
        //[1,4) 左开右闭
        int[] copy3 = Arrays.copyOfRange(original, 1, 4);

        System.out.println("完整复制：" + Arrays.toString(copy1));
        // [10, 20, 30, 40, 50]
        System.out.println("扩容复制：" + Arrays.toString(copy2));
        // [10, 20, 30, 40, 50, 0]
        System.out.println("范围复制：" + Arrays.toString(copy3));
        // [20, 30, 40]
    }

    @Test
    // 手动复制数组
    public void test3(){
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length]; // 先创建等长的新数组

        // 手动循环复制每个元素
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("原数组：" + Arrays.toString(original));
        // [1, 2, 3, 4, 5]
        System.out.println("复制数组：" + Arrays.toString(copy));
        // [1, 2, 3, 4, 5]
    }

    @Test
    //二维数组
    public void test4(){
        int[][] array = new int[3][];
        array[0] = new int[2];
        array[1] = new int[2];
        array[2] = new int[3];
        array[0][0] = 23;
        array[0][1] = 12;
        array[1][0] = 22;
        array[1][1] = 22;
        array[2][0] = 21;
        array[2][1] = 22;
        array[2][2] = 23;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }


}
