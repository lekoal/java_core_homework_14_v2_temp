package ru.geekbrains.java_core_homework_14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 5, 7, 4, 8, 3, 5};
        int[] arr2 = {2, 3, 4, 1, 3, 7, 7, 6};
        int[] arr3 = {1, 4, 1, 4, 4, 4, 1, 1};
        int[] arr4 = {4, 4, 4, 4};
        int[] arr5 = {1, 1, 1, 1};
        taskOne(arr1);
        taskOne(arr2);
        taskTwo(arr1);
        taskTwo(arr3);
        taskTwo(arr4);
        taskTwo(arr5);
        taskOne(arr5);
    }

    public static void taskOne(int[] arr) {
        System.out.println(Arrays.toString(FirstTask.newArr(arr)));
    }

    public static void taskTwo(int[] arr) {
        SecondTask secondTask = new SecondTask();
        System.out.println(secondTask.isHereOneAndFour(arr));
    }
}