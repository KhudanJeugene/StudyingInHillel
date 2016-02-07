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

}
