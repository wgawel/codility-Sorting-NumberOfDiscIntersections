package pl.gawly;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public int solution(int[] A) {
        int[][] starts = new int[A.length][2];

        for (int i = 0; i < A.length; i++) {
            starts[i] = new int[]{i - A[i], i + A[i]};
        }

        Arrays.sort(starts, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int intersections = 0;
        for (int i = 0; i < starts.length; i++) {
            for (int j = i+1; j < starts.length && starts[j][0] <= starts[i][1]; j++) {
                intersections++;
                if (intersections > 10000000) {
                    return -1;
                }
            }
        }

        return intersections;
    }
}
