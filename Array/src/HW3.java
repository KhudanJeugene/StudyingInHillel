import java.util.Arrays;

public class HW3
{
	public static int minElem(int[]arr)
	{		
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int min=arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (min>arr[i])
			{
				min = arr[i];
			}
		}
		return min;
	}

	public static int maxElem(int[]arr)
	{
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int max=arr[0];
		for (int i=0; i<arr.length; i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
			}
		}
		return max;	
	}

	public static int minInd(int []arr)
	{
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int a=0; a<arr.length; a++)
		{
			if (arr[ind]>arr[a])
			{
				ind = a;
			}
		}
		return ind;
	}

	public static int maxInd(int []arr)
	{
		if (arr==null || arr.length==0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (arr[ind]<arr[i])
			{
				ind = i;
			}
		}
		return ind;
	}

	public static int sumOddEl(int [] arr)
	{	
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int sum = 0;
		for (int i=0; i<arr.length; i++)
		{
			if (i%2!=0) 
			{
				sum += arr[i];
			}
		}
		return sum;
	}

	public static void reverse(int[]arr)
	{	
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for (int i=0; i<arr.length/2; i++)
		{
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}

	public static int calcCount(int[]arr)
	{	
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int	count=0;
		for (int i:arr)
		{
			if (i%2!=0) count++;
		}
		return count;
	}	

	public static void reverseHalf(int[] arr)
	{
		if(arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int n = 0;
		if(arr.length%2==0)
			n=arr.length/2;

		else
			n=arr.length/2+1;

		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n+i];
			arr[n+i] = temp;
		}
	}

	public static void sortBubble(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int t = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
	}

	public static void sortIns(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for(int i=1;i<arr.length;i++)
		{
			int prev=i-1;
			int curEl=arr[i];
			while(prev>=0&&arr[prev]>curEl)
			{
				arr[prev+1]=arr[prev];
				arr[prev]=curEl;
				prev--;				
			}
		}
	}

	public static void sortSelect(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		for (int i=0;i<arr.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[j]<arr[min]) min=j;
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}

	public static void quickSort(int[]arr)
	{
		if (arr==null || arr.length==0)
		{
			throw new IllegalArgumentException();
		}
		int start = 0;
		int end = arr.length-1;
		doSort(start,end,arr);	
	}
	public static void doSort(int start,int end,int []arr)
	{
		int i=start,j=end; 
		if (i>j) return;
		int mid = arr[(start+end)/2];
		while(i<j)
		{
			while(arr[i]<mid)i++;
			while(arr[j]>mid)j--;
			if (i<=j)
			{
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;j--;
			}
		}
		if(start<j) doSort(start,j,arr);
		if(i<end) doSort(i,end,arr);
	}

	public static void sortMerge(int[] ar) 
	{
		if (ar==null || ar.length==0)
		{
			throw new IllegalArgumentException();
		}
		int len = ar.length;
		int n = 1; 
		int shift;
		int two_size;  
		int[] arr2;
		while (n < len) 
		{
			shift = 0;
			while (shift < len) 
			{
				if (shift + n >= len) 
					break;

				two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
				arr2 = merge(Arrays.copyOfRange(ar, shift, shift + n),
						Arrays.copyOfRange(ar, shift + n, shift + n + two_size));
				
				for (int i = 0; i < n + two_size; ++i)
					ar[shift + i] = arr2[i];

				shift += n * 2;
			}
			n *= 2;
		}
	}
	private static int[] merge(int[] ar_1, int[] ar_2) 
	{
		int len_1 = ar_1.length, len_2 = ar_2.length;
		int a = 0, b = 0, len = len_1 + len_2;
		int[] result = new int[len];
		for (int i = 0; i < len; i++) 
		{
			if (b < len_2 && a < len_1) 
			{
				if (ar_1[a] > ar_2[b]) 
					result[i] = ar_2[b++];

				else 
					result[i] = ar_1[a++];
			} 
			else if (b < len_2) 
			{
				result[i] = ar_2[b++];
			} 
			else 
			{
				result[i] = ar_1[a++];
			}
		}
		return result;
	}

	public static void sortShell(int[] ar)
	{
		if (ar==null || ar.length==0)
		{
			throw new IllegalArgumentException();
		}
		int step = ar.length;
		while(step>0)
		{
			for (int i = 0; i < (ar.length - step); i++)
			{
				int j = i;
				while (j >= 0 && ar[j] > ar[j + step])
				{
					int temp = ar[j];
					ar[j] = ar[j + step];
					ar[j + step] = temp;
					j--; 
				}
			}
			step = step / 2;
		}
	}

	public static void heapify(int[] ar, int size, int pos)
	{    
		while (2 * pos + 1 < size) 
		{                      
			int t = 2 * pos + 1;                                                                                    
			if (2 * pos + 2 < size && ar[2 * pos + 1] < ar[2 * pos + 2])      
			{
				t = 2 * pos + 2;
			}
			if (ar[pos] < ar[t]) 
			{
				int temp = ar[pos];
				ar[pos] = ar[t];
				ar[t] = temp;
				pos = t;
			} 
			else 
			{
				break;
			}
		}
	}
	public static int[] heapMake(int[] ar) 
	{  
		int n = ar.length;                     
		for (int i = n - 1; i >= 0; i--) 
		{
			heapify(ar, n, i);
		}
		return ar;
	}
	public static void sortHeap(int[] ar) 
	{
		if (ar==null || ar.length==0)
		{
			throw new IllegalArgumentException();
		}
		
		int n = ar.length;
		heapMake(ar);
		while (n > 0) 
		{
			int temp = ar[0];                                
			ar[0] = ar[n-1];                               
			ar[n-1] = temp; 
			n--;
			heapify(ar, n, 0);
		}

	}
}
