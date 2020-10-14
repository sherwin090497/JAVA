package Sorting;

import java.util.LinkedList;
import java.util.Random;
import java.util.Arrays;

public class SortingTest<E> implements Sorting<E> {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		testInput(10);
//		testInput(50);
//		testInput(100);
//		testInput(150);
//		testInput(300);
//		testInput(500);
//		testInput(1000);
		testInput(1500);
	}

	public static void testInput(int num) {
		SortingTest<Integer> sortTest = new SortingTest<>();
		LinkedList<Integer> unsortedList = new LinkedList<>();

		Random random = new Random();
		int D = num;
		System.out.println("\n\t Testing " + D + " samples");

		// UNSORTED
		System.out.print("Unsorted: \t\t");
		long unsortedStart = System.nanoTime();
		for (int i = 0; i < D; i++) {
			int R = random.nextInt(100);
			unsortedList.add(R);
		}
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long unsortedEnd = System.nanoTime();

		// INSERTION SORT
		System.out.print("Insertion Sort: \t");
		long insertionStart = System.nanoTime();
		sortTest.insertionSort(unsortedList, 0, 0, false);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long insertionEnd = System.nanoTime();

		// QUICK SORT
		System.out.print("Quick Sort: \t\t");
		long quickStart = System.nanoTime();
		sortTest.quicksort(unsortedList, 0, 0, false);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long quickEnd = System.nanoTime();

		// MERGE SORT
		System.out.print("Merge Sort: \t\t");
		long mergeStart = System.nanoTime();
		sortTest.mergeSortLL(unsortedList, false);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long mergeEnd = System.nanoTime();

		// REVERSE INSERTION SORT
		System.out.print("Reverse Insertion Sort: ");
		long reverseInsertionStart = System.nanoTime();
		sortTest.insertionSort(unsortedList, 0, 0, true);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long reverseInsertionEnd = System.nanoTime();

		// REVERSE QUICK SORT
		System.out.print("Reverse Quick Sort: \t");
		long reverseQuickStart = System.nanoTime();
		sortTest.quicksort(unsortedList, 0, 0, true);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long reverseQuickEnd = System.nanoTime();

		// REVERSE MERGE SORT
		System.out.print("Reverse Merge Sort: \t");
		long reverseMergeStart = System.nanoTime();
		sortTest.mergeSortLL(unsortedList, true);
		System.out.println(Arrays.toString(unsortedList.toArray()));
		long reverseMergeEnd = System.nanoTime();

		// NANOSECONDS
		long unsortedTime = unsortedEnd - unsortedStart;
		long insertionTime = insertionEnd - insertionStart;
		long quickTime = quickEnd - quickStart;
		long mergeTime = mergeEnd - mergeStart;
		long reverseInsertionTime = reverseInsertionEnd - reverseInsertionStart;
		long reverseQuickTime = reverseQuickEnd - reverseQuickStart;
		long reverseMergeTime = reverseMergeEnd - reverseMergeStart;

		// MILLISECONDS
		long milliunsortedTime = unsortedTime / 1000000;
		long milliinsertionTime = insertionTime / 1000000;
		long milliquickTime = quickTime / 1000000;
		long millimergeTime = mergeTime / 1000000;
		long millireverseInsertionTime = reverseInsertionTime / 1000000;
		long millireverseQuickTime = reverseQuickTime / 1000000;
		long millireverseMergeTime = reverseMergeTime / 1000000;

		System.out.println("\nSort & Input \t\t Time");
		System.out.println("Unsorted \t\t " + unsortedTime + " nanoseconds\t " + milliunsortedTime + " milliseconds");
		System.out.println(
				"Insertion Sort \t\t " + insertionTime + " nanoseconds\t " + milliinsertionTime + " milliseconds");
		System.out.println("Quick Sort \t\t " + quickTime + " nanoseconds\t " + milliquickTime + " milliseconds");
		System.out.println("Merge Sort \t\t " + mergeTime + " nanoseconds\t " + millimergeTime + " milliseconds");
		System.out.println("Reverse Insertion Sort   " + reverseInsertionTime + " nanoseconds\t "
				+ millireverseInsertionTime + " milliseconds");
		System.out.println("Reverse Quick Sort \t " + reverseQuickTime + " nanoseconds\t " + millireverseQuickTime
				+ " milliseconds");
		System.out.println("Reverse Merge Sort \t " + reverseMergeTime + " nanoseconds\t " + millireverseMergeTime
				+ " milliseconds");
	}

	private int compareTo(E x, E y) {
		return ((Integer) x).compareTo((Integer) y);
	}

	@Override
	public void insertionSort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) { // Template
		// TODO Auto-generated method stub

		if (reversed == true) {
			reverseInsertionSort(list);
		} else if (reversed == false) {
			for (int i = 1; i < list.size(); i++) {
				E key = list.get(i);
				int j = i - 1;

				while (j >= 0 && compareTo(list.get(j), key) >= 1) {
					list.set(j + 1, list.get(j));
					j = j - 1;
				}
				list.set(j + 1, key);
			}
		}
	}

	private void reverseInsertionSort(LinkedList<E> list) {
		for (int i = 1; i < list.size(); i++) {
			E key = list.get(i);
			int j = i - 1;

			while (j >= 0 && compareTo(list.get(j), key) < 1) {
				list.set(j + 1, list.get(j));
				j = j - 1;
			}
			list.set(j + 1, key);
		}
	}

	@Override
	public void quicksort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) { // Template
		// TODO Auto-generated method stub
		if (reversed == false) {
			quickSort(list, 0, list.size() - 1, false);
		} else if (reversed == true) {
			reverseQuickSort(list, 0, list.size() - 1, true);
		}
	}

	private void quickSort(LinkedList<E> list, int low, int high, boolean reversed) {
		int pivot;
		if (low < high) {
			pivot = partition(list, low, high);
			quickSort(list, low, pivot - 1, false);
			quickSort(list, pivot + 1, high, false);
		}
	}

	private int partition(LinkedList<E> list, int low, int high) {
		E pivot = list.get(low);
		int right = high;
		int left = low + 1;
		while (left <= right) {
			while ((left <= high) && (compareTo(list.get(left), pivot) < 1)) {
				left++;
			}
			while (compareTo(list.get(right), pivot) >= 1) {
				right--;
			}
			if (left < right) {
				swap(list, left, right);
				left++;
				right--;
			}
		}

		swap(list, low, right);
		return right;
	}

	private void reverseQuickSort(LinkedList<E> list, int low, int high, boolean reversed) {
		if (low < high) {
			int pivot = reversePartition(list, low, high);
			reverseQuickSort(list, low, pivot, true);
			reverseQuickSort(list, pivot + 1, high, true);
		}

	}

	private int reversePartition(LinkedList<E> list, int left, int right) {
		E pivot = list.get(left);
		int i = left;
		for (int j = left + 1; j <= right; j++) {
			if (compareTo(list.get(j), pivot) >= 1) {
				i = i + 1;
				swap(list, i, j);
			}
		}

		swap(list, i, left);
		return i;
	}

	private void swap(LinkedList<E> list, int i, int j) {
		E temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	@Override
	public void mergeSortLL(LinkedList<E> list, boolean reversed) {
		LinkedList<E> secondList = new LinkedList<E>();
		for (int i = 0; i < list.size(); i++) {
			secondList.add(list.get(i));
		}
		merger(secondList, 0, list.size(), list, reversed);
		list.clear();
		for (int i = 0; i < secondList.size(); i++) {
			list.add(secondList.get(i));
		}
	}

	private void merger(LinkedList<E> list, int low, int high, LinkedList<E> secondList, boolean reversed) {
		// TODO Auto-generated method stub
		if (high - low >= 2) {
			int midLow = low + ((high - low) / 3);
			int midHigh = low + 2 * ((high - low) / 3) + 1;
			merger(secondList, low, midLow, list, reversed);
			merger(secondList, midLow, midHigh, list, reversed);
			merger(secondList, midHigh, high, list, reversed);
			if (reversed == false) {
				merge(secondList, low, midLow, midHigh, high, list);
			} else if (reversed == true) {
				reversedMerge(secondList, low, midLow, midHigh, high, list);
			}

		}
	}

	private void merge(LinkedList<E> list, int low, int midLow, int midHigh, int high, LinkedList<E> secondList) {
		// TODO Auto-generated method stub
		int i = low;
		int j = midLow;
		int k = midHigh;
		int l = low;

		while ((i < midLow) && (j < midHigh) && (k < high)) {
			if (compareTo(list.get(i), list.get(j)) < 0) {
				if (compareTo(list.get(i), list.get(k)) < 0)
					secondList.set(l++, list.get(i++));

				else
					secondList.set(l++, list.get(k++));
			} else {
				if (compareTo(list.get(j), list.get(k)) < 0)
					secondList.set(l++, list.get(j++));
				else
					secondList.set(l++, list.get(k++));
			}
		}

		while ((i < midLow) && (j < midHigh)) {
			if (compareTo(list.get(i), list.get(j)) < 0)
				secondList.set(l++, list.get(i++));
			else
				secondList.set(l++, list.get(j++));
		}

		while ((j < midHigh) && (k < high)) {
			if (compareTo(list.get(j), list.get(k)) < 0)
				secondList.set(l++, list.get(j++));

			else
				secondList.set(l++, list.get(k++));
		}

		while ((i < midLow) && (k < high)) {
			if (compareTo(list.get(i), list.get(k)) < 0)
				secondList.set(l++, list.get(i++));
			else
				secondList.set(l++, list.get(k++));
		}

		while (i < midLow)
			secondList.set(l++, list.get(i++));

		while (j < midHigh)
			secondList.set(l++, list.get(j++));

		while (k < high)
			secondList.set(l++, list.get(k++));
	}

	private void reversedMerge(LinkedList<E> list, int low, int midLow, int midHigh, int high,
			LinkedList<E> secondList) {
		// TODO Auto-generated method stub
		int i = low;
		int j = midLow;
		int k = midHigh;
		int l = low;

		while ((i < midLow) && (j < midHigh) && (k < high)) {
			if (compareTo(list.get(i), list.get(j)) > 0) {
				if (compareTo(list.get(i), list.get(k)) > 0)
					secondList.set(l++, list.get(i++));

				else
					secondList.set(l++, list.get(k++));
			} else {
				if (compareTo(list.get(j), list.get(k)) > 0)
					secondList.set(l++, list.get(j++));
				else
					secondList.set(l++, list.get(k++));
			}
		}

		while ((i < midLow) && (j < midHigh)) {
			if (compareTo(list.get(i), list.get(j)) > 0)
				secondList.set(l++, list.get(i++));
			else
				secondList.set(l++, list.get(j++));
		}

		while ((j < midHigh) && (k < high)) {
			if (compareTo(list.get(j), list.get(k)) > 0)
				secondList.set(l++, list.get(j++));

			else
				secondList.set(l++, list.get(k++));
		}

		while ((i < midLow) && (k < high)) {
			if (compareTo(list.get(i), list.get(k)) > 0)
				secondList.set(l++, list.get(i++));
			else
				secondList.set(l++, list.get(k++));
		}

		while (i < midLow)
			secondList.set(l++, list.get(i++));

		while (j < midHigh)
			secondList.set(l++, list.get(j++));

		while (k < high)
			secondList.set(l++, list.get(k++));
	}
}
