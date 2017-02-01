package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testEx1() {
        Assert.assertEquals(11, s.solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    @Test
    public void testZero() {
        Assert.assertEquals(0, s.solution(new int[]{}));
    }
}
