package com.codegym.slidingwindow.pattern2;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBacketsSolution {
    public static int fruitIntoBaskets(int[] trees) {
        Map<Integer, Boolean> treeTypesMap = new HashMap<>();
        int max = 0;
        int start = 0;

        for (int end = 0; end < trees.length; end++) {
            int treeType = trees[end];

            if (treeTypesMap.size() < 2 && !treeTypesMap.containsKey(treeType)) {
                treeTypesMap.put(treeType, true);
                max = Math.max(max, end - start + 1);

            } else if (treeTypesMap.containsKey(treeType)) {
                max = Math.max(max, end - start + 1);

            } else {
                treeTypesMap = new HashMap<>();
                treeTypesMap.put(trees[end - 1], true);
                treeTypesMap.put(treeType, true);
                start = end - 1;

                while (start > 0 && trees[start] == trees[start - 1]) {
                    start--;
                }

                max = Math.max(max, end - start + 1);
            }
        }
        return max;
    }
}
