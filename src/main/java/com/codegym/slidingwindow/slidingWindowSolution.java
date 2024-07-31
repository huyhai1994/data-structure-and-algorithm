package com.codegym.slidingwindow;

import static java.lang.Float.parseFloat;

public class slidingWindowSolution {
    public static float findMaxAverageSlidingWindow(int[] nums, int k) {
        int windowSum = 0;
        int start = 0;
        float max = Float.NEGATIVE_INFINITY;
        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];
            if (end - start + 1 == k) {
                max = Math.max(max, parseFloat(String.valueOf(windowSum)) / parseFloat(String.valueOf(k)));
                windowSum -= nums[start];
                start++;
            }
        }
        return max;
    }
}
