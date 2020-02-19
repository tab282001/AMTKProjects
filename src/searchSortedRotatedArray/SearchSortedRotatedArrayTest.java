package searchSortedRotatedArray;

import org.junit.Assert;
import org.junit.Test;

public class SearchSortedRotatedArrayTest {

    @Test
    public void searchArray() {
        Assert.assertEquals(8,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3},3 ));

        Assert.assertEquals(-1,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3},30 ));

        Assert.assertEquals(7,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{6, 7, 8, 9, 10, 1, 2, 3},3 ));

        Assert.assertEquals(3,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{30, 40, 50, 10, 20},10 ));

        Assert.assertEquals(2,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{30, 40, 40,50, 10, 30},40 ));

        Assert.assertEquals(2,new SearchSortedRotatedArray().searchRotatedArray(
                new int[]{3, 3, 3, 1, 2, 3},3));


        Assert.assertEquals(8,new SearchSortedRotatedArray().searchRotatedRecursive(
                new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3},3 ));

        Assert.assertEquals(-1,new SearchSortedRotatedArray().searchRotatedRecursive(
                new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3},30 ));

        Assert.assertEquals(7,new SearchSortedRotatedArray().searchRotatedRecursive(
                new int[]{6, 7, 8, 9, 10, 1, 2, 3},3 ));

        Assert.assertEquals(3,new SearchSortedRotatedArray().searchRotatedRecursive(
                new int[]{30, 40, 50, 10, 20},10 ));

        Assert.assertEquals(6,new SearchSortedRotatedArray().findPivot(
                new int[]{5, 6, 7, 8, 9, 10, 1, 2, 3} ));

        Assert.assertEquals(5,new SearchSortedRotatedArray().findPivot(
                new int[]{6, 7, 8, 9, 10, 1, 2, 3}));

        Assert.assertEquals(3,new SearchSortedRotatedArray().findPivot(
                new int[]{30, 40, 50, 10, 20} ));


        Assert.assertEquals(2,new SearchSortedRotatedArray().searchArrayUnrotated(
                new int[]{1,2,3,5, 6, 7, 8, 9, 10},3 ));
        Assert.assertEquals(2,new SearchSortedRotatedArray().searchArrayUnrotated(
                new int[]{1,2,3,5, 6, 7, 8, 9},3 ));
        Assert.assertEquals(-1,new SearchSortedRotatedArray().searchArrayUnrotated(
                new int[]{1,2,3,5, 6, 7, 8, 9},-1 ));
    }
}