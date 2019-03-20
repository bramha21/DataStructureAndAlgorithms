package algorithms.sorting;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testMergeSort() {
		int[] expectedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] inputArr = { 3, 2, 1, 5, 6, 7, 8, 9, 4 };

		MergeSort mergeSort = new MergeSort();
		int[] resultArr = mergeSort.sort(inputArr);

		Assert.assertTrue(compareTwoArrays(expectedArr, resultArr));
	}

	private boolean compareTwoArrays(int[] expectedArr, int[] resultArr) {
		// Assumed that both arrays of same length
		for (int i = 0; i < resultArr.length; i++) {
			if (resultArr[i] != expectedArr[i]) {
				return false;
			}
		}

		return true;
	}
}
