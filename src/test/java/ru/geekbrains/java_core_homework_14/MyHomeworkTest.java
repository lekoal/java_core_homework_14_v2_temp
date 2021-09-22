package ru.geekbrains.java_core_homework_14;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class myHomeworkTest {

    // Task one
    static int[] tOneArr1 = {1, 2, 3, 4, 5, 6, 7};
    static int[] tOneArr1Res = {5, 6, 7};

    static int[] tOneArr2 = {2, 4, 1, 1, 4, 5, 7, 2, 4, 9, 1};
    static int[] tOneArr2Res = {9, 1};

    static int[] tOneArr3 = {2, 4, 1, 6, 5, 4, 7};
    static int[] tOneArr3Res = {7};

    int[] tOneArr4 = {2, 3, 6, 8, 9, 1};

    @ParameterizedTest
    @MethodSource("taskOneMethodValuesProvide")
    void shouldGiveAnArrayAfterLastFour(int[] expected, int[] value) {
        Assertions.assertArrayEquals(expected, FirstTask.newArr(value));
    }

    static Stream<Arguments> taskOneMethodValuesProvide() {
        return Stream.of(
                Arguments.arguments(tOneArr1Res, tOneArr1),
                Arguments.arguments(tOneArr2Res, tOneArr2),
                Arguments.arguments(tOneArr3Res, tOneArr3)

        );
    }

    @Test
    void shouldGiveAnExpressionWithoutFour() {
        Assertions.assertThrows(RuntimeException.class, () -> FirstTask.newArr(tOneArr4));
    }

    //Task two

    static int[] tTwoArr1 = {1, 1, 4, 4, 4, 4, 1, 1, 1};

    static int[] tTwoArr2 = {1, 1, 1, 1, 1, 1};

    static int[] tTwoArr3 = {4, 4, 4, 4, 4, 4};

    static int[] tTwoArr4 = {1, 4, 4, 4, 1, 3};

    @Test
    void shouldCheckValuesOfArrayIsFourAndOne() {
        Assertions.assertTrue(SecondTask.isHereOneAndFour(tTwoArr1));
    }

    @ParameterizedTest
    @MethodSource("taskTwoMethodValuesProvide")
    void shouldGiveFalseWithoutFourOrOneOrWithAnotherElement(int[] value) {
        Assertions.assertFalse(SecondTask.isHereOneAndFour(value));
    }

    static Stream<Arguments> taskTwoMethodValuesProvide() {
        return Stream.of(
                Arguments.arguments(tTwoArr2),
                Arguments.arguments(tTwoArr3),
                Arguments.arguments(tTwoArr4)
        );
    }
}
