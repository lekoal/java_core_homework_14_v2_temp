package ru.geekbrains.java_core_homework_14;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class myHomeworkTest {

    int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
    int[] arr1Res = {5, 6, 7};

    @Test
    void shouldGiveAnArrayAfter4() {
        Assertions.assertArrayEquals(arr1Res, FirstTask.newArr(arr1));
    }
}
