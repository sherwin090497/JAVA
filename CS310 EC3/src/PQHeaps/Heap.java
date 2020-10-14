package PQHeaps;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Heap {

	private int[] a;
	private int n;

	public Heap() {
		a = new int[1];
		n = 0;
		a[0] = -100;
	}

	public Heap(int maxSize) {
		a = new int[maxSize];
		n = 0;
		a[0] = -100;
	}

	public void insertItem(int value) {
		if (n < a.length) {
			n++;
			a[n] = value;
			upHeap(n);
		} else
			System.out.println("Heap is full");
	}

	private void upHeap(int i) {
		int k = a[i];
		int parent = i / 2;

		while (parent >= 1 && a[parent] < k) {
			a[i] = a[parent];
			i = parent;
			parent = i / 2;
		}
		a[i] = k;
	}

	public int removeMax() {
		if (n == 0)
			throw new NoSuchElementException("Heap is Empty!!");
		int maxValue = a[1];
		a[1] = a[n];
		n--;
		downHeap(1);
		return maxValue;
	}

	private void downHeap(int i) {
		int k = a[i];
		int left = 2 * i;
		int right = left + 1;

		while (right <= n) {

			if (k >= a[left] && k >= a[right]) {
				a[i] = k;
				return;
			} else if (a[left] < a[right]) {
				a[i] = a[right];
				i = right;
			} else {
				a[i] = a[left];
				i = left;
			}

			left = 2 * i;
			right = left + 1;
		}

		if (left == n && k < a[left]) {
			a[i] = a[left];
			i = left;
		}

		a[i] = k;
	}

	public void display() {
		for (int i = 1; i <= n; i++)
			System.out.println(a[i] + " ");
		System.out.println();
	}

	public void max_heapify(int Arr[], int i, int N) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int largest;
		if (left <= N && Arr[left] > Arr[i])
			largest = left;
		else
			largest = i;
		if (right <= N && Arr[right] > Arr[largest])
			largest = right;
		if (largest != i) {
			int temp = Arr[i];
			Arr[i] = Arr[largest];
			Arr[largest] = temp;
			max_heapify(Arr, largest, N);
		}
	}

	public static Heap convertToHeap(int Arr[]) {
		Heap heap = new Heap(Arr.length + 1);
		for (int i = 0; i < Arr.length; i++)
			heap.insertItem(Arr[i]);
		return heap;
	}
	
	public void displayInput(int max) {
		for (int i = 1; i <= max; i++) {
			if (a[i] == 0) {
				break;
			}
			System.out.println(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int arr[] = { 43, 89, 59, 4, 165, 178, 55, 43, 15, 198, 6 };
		Heap heap = convertToHeap(arr);
		System.out.print("Inserting to heap: ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n\nMax Heap array: ");
		heap.display();
		System.out.println("Removing max from heap... ");
		System.out.println("Displaying heap:  ");
		heap.removeMax();
		heap.display();
		
		System.out.print("Enter heap size: ");
		int heapSize = input.nextInt();
		int[] heapArr = new int[heapSize];
		
		for(int i = 0; i < heapArr.length ;i++) {
			System.out.print("\nInsert a number to the Heap: ");
			int heapInput = input.nextInt();
			heapArr[i] = heapInput;
			System.out.println("\nMax Heap: ");
			Heap heapArray = convertToHeap(heapArr);
			heapArray.displayInput(heapSize);
		}
		
	}
}