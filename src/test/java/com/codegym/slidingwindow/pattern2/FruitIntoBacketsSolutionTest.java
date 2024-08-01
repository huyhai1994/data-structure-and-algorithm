package com.codegym.slidingwindow.pattern2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitIntoBacketsSolutionTest {
    @Test
    void fruitIntoBacketsTest() {
        int[] trees = {1, 2, 3, 2, 2};
        assertEquals(4, FruitIntoBacketsSolution.fruitIntoBaskets(trees));
    }


}