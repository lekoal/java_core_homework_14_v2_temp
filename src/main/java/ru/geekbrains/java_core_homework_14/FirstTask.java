package ru.geekbrains.java_core_homework_14;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {

    public static int[] newArr(int[] myArrTaskOne) {
        List<Integer> tempArr = new ArrayList<>();
        int fourSearch = 0;
        for (int i = myArrTaskOne.length - 1; i >= 0; i--) {
            if (myArrTaskOne[i] != 4) {
                tempArr.add(myArrTaskOne[i]);
            } else {
                fourSearch++;
                break;
            }
        }
        if (fourSearch == 0) throw new RuntimeException("Value 4 is not founded!");
        int[] newArr = new int[tempArr.size()];
        for (int i = 0, j = tempArr.size() - 1; i < newArr.length ; i++, j--) {
            newArr[i] = tempArr.get(j);
        }

        return newArr;
    }
}