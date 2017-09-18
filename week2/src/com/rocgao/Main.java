package com.rocgao;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();

        Integer[] intArray = generateIntArray();
        printIntArray(intArray);

        long end=System.currentTimeMillis();
        System.out.println("总执行时间:" + (end-start) + "ms");
    }

    private static Integer[] generateIntArray() {
        Random random = new Random();

        Integer[] results = new Integer[10];
        for (int i = 0; i < results.length; i++) {
            Integer temp = random.nextInt(100);
            if (i == 0) {
                results[i] = temp;
            } else {

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
