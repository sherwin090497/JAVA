package PQHeaps;
import java.util.*;
public class Heap {
	
	private int[] a;
	private int n;
	public Heap()
	{
		a=new int[1];
		n=0;
		a[0]=-100;
	}
	
	public Heap(int maxSize)
	{
		a= new int[maxSize];
		n=0;
		a[0]=-100;
	}
	
	public void insertItem(int value)
	{
		n++;
		a[n]=value;
		upHeap(n);
	}
	
	private void upHeap(int i)
	{
		int k=a[i];
		int iparent=i/2;
		while(a[iparent]>k)
		{
			a[i]=a[iparent];
			i=iparent;
			iparent=i/2;
		}
		a[i]=k;
	}
	
	public int removeMin()
	{
		if(n==0)
			throw new NoSuchElementException("Heap is Empty!!");
		int minValue=a[1];
		a[1]=a[n];
		n--;
		downHeap(1);
		return minValue;
	}
	public void downHeap(int i)
	{
		int k=a[i];
		int left=2*i;
		int right=left+1;
		
		while (right<=n)
		{
			if(k<=a[left]&&k<=a[right])
			{
				a[i]=k;
				return;
			}
			else if(a[left]>a[right])
			{
				a[i]=a[right];
				i=right;
			}
			else
			{
				a[i]=a[left];
				i=left;
			}
			left=2*i;
			right=left+1;
		}
		
		/* If number of nodes is even there is one node without right child */
		if(left==n&&k>a[left])
		{
			a[i]=a[left];
		i=left;
		}
		a[i]=k;
	}
	
	public void min_heapify (int Arr[ ] , int i, int N)
	{
	int left  = 2*i;
	int right = 2*i+1;
	int smallest;
	if(left <= N && Arr[left] < Arr[ i ] )
	     smallest = left;
	else
	    smallest = i;
	if(right <= N && Arr[right] < Arr[smallest] )
	    smallest = right;
	if(smallest != i)
	{
		int temp=Arr[i];
		Arr[i]=Arr[smallest];
		Arr[smallest]=temp;
	    min_heapify (Arr, smallest,N);
	} 
}
	void build_minheap (int Arr[ ]) {
		
	}
	
	
}
