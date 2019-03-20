package algorithms.sorting;

public class MergeSort {

	public int[] sort(int[] arr) {

		sort(arr, 0, arr.length - 1);

		return arr;
	}

	private void sort(int[] arr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;

			sort(arr, left, middle);
			sort(arr, middle + 1, right);

			merge(arr, left, middle, right);
		}
	}

	private void merge(int[] arr, int left, int middle, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;

		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; ++i) {
			leftArray[i] = arr[left + i];
		}

		for (int j = 0; j < n2; ++j) {
			rightArray[j] = arr[middle + 1 + j];
		}

		int i = 0;
		int j = 0;
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}

}
