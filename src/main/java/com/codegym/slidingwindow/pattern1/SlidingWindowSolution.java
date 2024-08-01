package com.codegym.slidingwindow.pattern1;

public class SlidingWindowSolution {
    public static float findMaxAverageSlidingWindow(int[] nums, int k) {
        int windowSum = 0;
        int start = 0;
        float max = Float.NEGATIVE_INFINITY;

        for (int end = 0; end < nums.length; end++) {
            windowSum += nums[end];
            if (end - start + 1 == k) {
                max = Math.max(max, Float.parseFloat(String.valueOf(windowSum)) / Float.parseFloat(String.valueOf(k)));
                windowSum -= nums[start];
                start++;
            }
        }
        return max;
    }
}
