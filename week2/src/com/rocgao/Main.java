package com.rocgao;

import java.util.Random;

public class Main {

    /*    题目：生成一个长度为1000，有序但是值不连续的整形数组。
        注意项：
          1）代码必须编译通过
          2）需要贴出输出的值
          3）贴出总的执行时间
          4）在关键逻辑处需要有相关的代码注释
          5）尽量自己独立完成
          6）请必须Checkin代码
    */
    public static void main(String[] args) {

        //记录开始时间
        long start=System.currentTimeMillis();

        Integer[] intArray = generateIntArray();
        printIntArray(intArray);

        //记录结束时间
        long end=System.currentTimeMillis();

        //计算总的执行时间
        System.out.println("总执行时间:" + (end-start) + "ms");
    }

    /*
    * 创建递增且不连续的整数数组
    * */
    private static Integer[] generateIntArray() {
        Random random = new Random();

        Integer[] results = new Integer[1000];
        for (int i = 0; i < results.length; i++) {

            //设置boundary为100，防止出现负数
            Integer temp = random.nextInt(100);
            if (i == 0) {
                results[i] = temp;
            } else {

                // 防止temp=0时导致与前一个数相等，故在此加2
                results[i] = results[i - 1] + temp + 2;
            }
        }
        return results;
    }

    private static void printIntArray(Integer[] intArray) {
        for (Integer item : intArray) {

            System.out.println(item);
        }
    }
}
