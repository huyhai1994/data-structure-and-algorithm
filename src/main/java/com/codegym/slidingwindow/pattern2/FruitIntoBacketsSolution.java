package com.codegym.slidingwindow.pattern2;

import java.util.HashMap;
import java.util.Map;

/**
 * This function calculates the maximum number of fruits ()that can be put into a basket
 * while ensuring that no more than two different types of fruits are present in the basket.
 * The function uses a sliding window approach to traverse the array of trees.
 *
 * @param trees An array of integers representing the types of trees. Each integer represents a different type of fruit.
 * @return The maximum number of fruits that can be put into a basket while adhering to the given constraints.
 */
public class FruitIntoBacketsSolution {

    public static void main(String[] args) {
        int result = fruitIntoBaskets(new int[]{1, 2, 3, 2, 2});
    }

    public static int fruitIntoBaskets(int[] trees) {
        /* Initialize a map (treeTypesMap) to store the types of fruits in the current window and an integer (max) to store the maximum number of fruits collected so far. Set the start pointer (start) to 0.*/
        Map<Integer, Boolean> treeTypesMap = new HashMap<>();
        int max = 0;
        int start = 0;

        /* Iterate through the array of trees using the end pointer (end).*/
        for (int end = 0; end < trees.length; end++) {
            int treeType = trees[end];

            /* For each tree, check if the current window contains less than two different types of fruits and if the current tree type is not already in the map. If both conditions are true, add the tree type to the map and update the maximum number of fruits collected (max).*/

            if (treeTypesMap.size() < 2 && !treeTypesMap.containsKey(treeType)) {
                treeTypesMap.put(treeType, true);
                max = Math.max(max, end - start + 1);

                /* If the current tree type is already in the map, update the maximum number of fruits collected (max).*/
            } else if (treeTypesMap.containsKey(treeType)) {
                max = Math.max(max, end - start + 1);

            } else {
                /* If the current window contains more than two different types of fruits, reset the map, add the previous tree type and the current tree type to the map, and update the start pointer (start) to the previous tree. Then, move the start pointer (start) to the left until the window contains only two different types of fruits. Update the maximum number of fruits collected (max).*/

                treeTypesMap = new HashMap<>();
                treeTypesMap.put(trees[end - 1], true);
                treeTypesMap.put(treeType, true);
                start = end - 1;

                while (start > 0 && trees[start] == trees[start - 1]) {
                    start--;
                    System.out.println("start = " + start);
                }
                /* After iterating through all the trees, return the maximum number of fruits collected (max).*/
                max = Math.max(max, end - start + 1);
            }
        }
        return max;
    }
}
