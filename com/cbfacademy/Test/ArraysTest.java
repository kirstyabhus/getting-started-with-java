package com.cbfacademy.Test;

public class ArraysTest {
    public static void main(String[] args) {

        String[] wordBank = {"snake", "basketball", "pirate", "chocolate"};

        if (wordBank[0] == "snake" && wordBank[1] == "basketball") {
            System.out.println("its a snake!");
        }
        else {
            System.out.println("its not a snake");
        }

        int[][] numbersMatrix = {{1,2,3,4}, {2,4,5,6}, {3,5,6,3}};
        int[] array1 = numbersMatrix[0];
        int[] array2 = numbersMatrix[1];

        System.out.println(array1[0] + array2[0]);

        int[] arrayInt8 = {1,2,3,4,5,6,7,8};
        float[] arrayFloat12 = {1.2f, 1.2f, 1.2f, 1.2f, 1.2f, 1.2f,1.2f,1.2f,1.2f,1.2f,1.2f,1.2f,};
        double[] arrayDouble5 = {1.2,3.4,1.2,3.4,1.2};
        boolean[] arrayBoolean6 = {true, false, true, false, true};

        System.out.println(arrayInt8[4]);
        System.out.println(arrayFloat12[4]);
        System.out.println(arrayDouble5[4]);
        System.out.println(arrayBoolean6[4]);
    }
}


