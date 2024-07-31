package com.codegym.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class slidingwindowsolutiontest {
    @Test
    void findMaxAverageSlidingWindowTest() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        assertEquals(12.75, slidingWindowSolution.findMaxAverageSlidingWindow(nums, k));
    }


}