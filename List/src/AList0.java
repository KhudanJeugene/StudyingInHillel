public class AList0
{
	private int[] ar = {};
	public AList0()
	{
	}

	public AList0(int[] ini)
	{
		init(ini);
	}

	public void init(int[] a)
	{
		if (a == null)
		{
			ar = new int[0];
			return;
		}
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length; i++)
		{
			temp[i] = a[i];
		}
		ar = temp;
	}

	public int size()
	{
		return ar.length;
	}

	public void clear()
	{
		ar = new int[0];
	}

	public int [] toArray()
	{
		int[] temp = new int[ar.length];
		for (int i = 0; i < ar.length; i++)
			temp[i] = ar[i];

		return temp;
	}

	public String toString()
	{
		String str = "{";
		for (int i = 0; i < ar.length; i++)
		{
			str += i < ar.length-1? ar[i] + ", " : ar[i];
		}
		str += "}";
		return str;
	}

	public void addStart(int val)
	{
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++)
		{
			temp[i+1] = ar[i];
		}
		temp[0] = val;
		ar = temp;
	}

	public void addEnd(int val)
	{
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < ar.length; i++)
		{
			temp[i] = ar[i];
		}
		temp[temp.length - 1] = val;
		ar = temp;
	}

	public void addPos(int pos, int val)
	{
		int[] temp = new int[ar.length + 1];
		for (int i = 0; i < pos; i++)
		{
			temp[i] = ar[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i < temp.length; i++)
		{
			temp[i] = ar[i - 1];
		}
		ar = temp;
	}

	public int delStart()
	{
		if (ar.length == 0)
			throw new NegativeArraySizeException();
		
		int delVal = ar[0];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i + 1];
		}
		ar = temp;

		return delVal;
	}

	public int delEnd()
	{
		if (ar.length == 0)
			throw new NegativeArraySizeException();

		int delVal = ar[ar.length-1];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i];
		}
		ar = temp;

		return delVal;
	}

	public int delPos(int pos)
	{
		if (ar.length == 0)
			throw new NegativeArraySizeException();

		int delVal = ar[pos];
		int[] temp = new int[ar.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = i<pos? ar[i] : ar[i+1];
		}
		ar = temp;
		return delVal;
	}

	public void set(int pos, int val)
	{
		ar[pos] = val;
	}
	public int get(int pos)
	{
		return ar[pos];
	}

	public int minElem()
	{		
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int min=ar[0];
		for (int i = 1; i < ar.length; i++)
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
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int max=ar[0];
		for (int i = 1; i < ar.length; i++)
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
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int i = 1; i < ar.length; i++)
		{
			if (ar[ind]>ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}

	public int maxInd()
	{
		if (ar.length == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;
		for (int i=0; i<ar.length; i++)
		{
			if (ar[ind]<ar[i])
			{
				ind = i;
			}
		}
		return ind;
	}

	public void reverse()
	{	
		for (int i=0; i<ar.length/2; i++)
		{
			int temp = 0;
			temp = ar[i];
			ar[i] = ar[ar.length-i-1];
			ar[ar.length-i-1] = temp;
		}
	}

	public  void reverseHalf()
	{
		int d = (ar.length%2 == 0) ? 0 : 1;

		for(int i=0; i<ar.length/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length/2+d+i];
			ar[ar.length/2+d+i] = temp;
		}
	}
	public void sortSelect()
	{
		for (int i=0;i<ar.length-1;i++)
		{
			int min =i;
			for(int j=i+1;j<ar.length;j++)
			{
				if (ar[j]<ar[min]) min=j;
			}
			int temp = ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
	}
}
