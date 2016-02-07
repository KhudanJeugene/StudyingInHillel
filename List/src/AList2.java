public class AList2
{
	int[] ar = new int[30];
	
	int start = 15;
	int end = 15;
	public AList2()
	{
	}

	public AList2(int[] ini)
	{
		init(ini);
	}
	
	public void init(int[] a)
	{
		if (a == null)
		{
			ar = new int[30];
			return;
		}
		if (a.length > ar.length)
			throw new IllegalArgumentException();
				
		int[] temp = new int[a.length];
		start -= a.length/2;
		end = start + a.length;
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = a[i];
			ar[i+start] = temp[i];
		}
	}
	
	public int size()
	{
		return end-start;
	}
	
	public void clear()
	{
		ar = new int[30];
		start = 15;
		end = 15;
	}
	
	public int [] toArray()
	{
		int[] temp = new int[end - start];
		for (int i = 0; i < temp.length; i++)
			temp[i] = ar[i+start];

		return temp;
	}
	
	public String toString()
	{
		String str = "{";
		for (int i = start; i < end; i++)
		{
			str += i < end-1? ar[i] + ", " : ar[i];
		}
		str += "}";
		return str;
	}
	
	public void addStart(int val)
	{
		ar[--start] = val;	
	}
	
	public void addEnd(int val)
	{
		ar[end++] = val;
	}
	
	public void addPos(int pos, int val)
	{
		if (pos+start<start-1 || pos+start>end)
			throw new ArrayIndexOutOfBoundsException();
		
		for(int i = end; i > pos + start; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[start+pos] = val;
		end++;
	}
	
	public int delStart()
	{
		if (end - start == 0)
			throw new IllegalArgumentException();
		
		int delVal = ar[start];
		start++;
		return delVal;
	}
	
	public int delEnd()
	{
		if (end - start == 0)
			throw new IllegalArgumentException();

		int delVal = ar[end-1];
		end--;		
		return delVal;
	}
	
	public int delPos(int pos)
	{
		if (end - start == 0)
			throw new IllegalArgumentException();
		
		if(pos+start < start-1 || pos > end)
			throw new ArrayIndexOutOfBoundsException();

		int delVal = ar[pos + start];
		for(int i = pos + start; i < end; i++)
		{
			ar[i] = ar[i+1];
		}
		end--;
		return delVal;
	}
	
	public void set(int pos, int val)
	{
		if (pos + start < start || pos + start >= end)
			throw new ArrayIndexOutOfBoundsException();
		
			ar[pos + start] = val;
	}
	
	public int get(int pos)
	{
		if (pos + start < start || pos + start >= end)
			throw new ArrayIndexOutOfBoundsException();
		
		return ar[pos + start];
	}
	
	public int minElem()
	{		
		if (end - start == 0) 	
			throw new IllegalArgumentException();
		
		int min=ar[start];
		for (int i = start+1; i < end; i++)
		{
			if (min>ar[i])
			{
				min = ar[i];
			}
		}
		return min;
	}

	public int maxElem()
	{
		if (end - start == 0) 		
			throw new IllegalArgumentException();
		
		int max=ar[start];
		for (int i = start + 1; i < end; i++)
		{
			if (max<ar[i])
			{
				max = ar[i];
			}
		}
		return max;	
	}

	public int minInd()
	{
		if (end - start == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = start;
		for (int i = start +1; i < end; i++)
		{
			if (ar[ind]>ar[i])
			{
				ind = i;
			}
		}
		return ind - start;
	}

	public int maxInd()
	{
		if (end - start == 0) 
			throw new IllegalArgumentException();
		
		int ind = start;
		for (int i=start +1; i<end; i++)
		{
			if (ar[ind]<ar[i])
			{
				ind = i;
			}
		}
		return ind - start;
	}

	public void reverse()
	{	
		for (int i=start; i<start + (end - start)/2; i++)
		{
			int temp = 0;
			temp = ar[i];
			ar[i] = ar[start + (end-i-1)];
			ar[start + (end-i-1)] = temp;
		}
	}

	public  void reverseHalf()
	{
		int d = ((end - start)%2 == 0) ? 0 : 1;
		
		for(int i=start; i<start + (end - start)/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[start + (end - start)/2+d+i-start];
			ar[start + (end - start)/2+d+i-start] = temp;
		}
	}
	
	public void sortSelect()
	{
		for (int i=start;i<end-1;i++)
		{
			int min =i;
			for(int j=i+1;j<end;j++)
			{
				if (ar[j]<ar[min]) min=j;
			}
			int temp = ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
	}
}
