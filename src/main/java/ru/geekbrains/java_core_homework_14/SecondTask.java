package ru.geekbrains.java_core_homework_14;

public class SecondTask {
    private final int[] myArrTaskTwo;

    public SecondTask(int[] myArrTaskTwo) {
        this.myArrTaskTwo = myArrTaskTwo;
    }

    public boolean isHereOneAndFour() {
        int oneCount = 0;
        int fourCount = 0;
        for (int i : myArrTaskTwo) {
            if (i == 1) {
                oneCount++;
            }
            if (i == 4) {
                fourCount++;
            }
        }
        if (oneCount == 0 || fourCount == 0) return false;
        else return (oneCount + fourCount) == myArrTaskTwo.length;
    }
}
