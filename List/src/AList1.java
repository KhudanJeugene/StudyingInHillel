public class AList1
{
	private int[] ar = new int[10];
	private int top = 0;
	
	public AList1()
	{
	}

	public AList1(int[] ini)
	{
		init(ini);
	}
	
	public void init(int[] a)
	{
		if (a == null)
		{
			ar = new int[10];
			return;
		}
		int[] temp = new int[a.length];
		top = a.length;
		for (int i = 0; i < top; i++)
		{		
			temp[i] = a[i];
		}
		ar = temp;
	}
	
	public int size()
	{
		return top;
	}
	
	public void clear()
	{
		ar = new int[10];
		top = 0;
	}
	
	public int [] toArray()
	{
		int[] temp = new int[top];
		for (int i = 0; i < top; i++)
			temp[i] = ar[i];

		return temp;
	}
	
	public String toString()
	{
		String str = "{";
		for (int i = 0; i < top; i++)
		{
			str += i < top-1? ar[i] + ", " : ar[i];
		}
		str += "}";
		return str;
	}
	
	public void addStart(int val)
	{
		int[] temp = new int[top + 1];
		for (int i = 0; i < top; i++)
		{
			temp[i+1] = ar[i];
		}
		temp[0] = val;
		top++;
		ar = temp;
	}
	
	public void addEnd(int val)
	{
		int[] temp = new int[top+1];
		for (int i = 0; i < top; i++)
		{
			temp[i] = ar[i];
		}
		temp[top] = val;
		top++;
		ar = temp;
	}
	
	public void addPos(int pos, int val)
	{
		if (pos < 0 || pos > top)
			throw new ArrayIndexOutOfBoundsException();
		
		int[] temp = new int[top + 1];
		for (int i = 0; i < pos; i++)
		{
			temp[i] = ar[i];
		}
		temp[pos] = val;
		for (int i = pos + 1; i <= top; i++)
		{
			temp[i] = ar[i - 1];
		}
		top++;
		ar = temp;
	}
	
	public int delStart()
	{		
		if (top == 0)	
			throw new IllegalArgumentException();
		
		int delVal = ar[0];
		int[] temp = new int[top - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i + 1];
		}
		ar = temp;
		top--;
		return delVal;
	}
	
	public int delEnd()
	{
		if (top == 0)
			throw new IllegalArgumentException();

		int delVal = ar[top-1];
		int[] temp = new int[top - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i];
		}
		ar = temp;
		top--;
		return delVal;
	}
	
	public int delPos(int pos)
	{
		if (top == 0)
			throw new IllegalArgumentException();
		
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();

		int delVal = ar[pos];
		int[] temp = new int[top - 1];
		for (int i = 0; i < temp.length; i++)
		{
			temp[i] = i<pos? ar[i] : ar[i+1];
		}
		ar = temp;
		top--;
		return delVal;
	}
	
	public void set(int pos, int val)
	{
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();
			
		ar[pos] = val;
	}
	
	public int get(int pos)
	{
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();
		
		return ar[pos];
	}
	
	public int minElem()
	{		
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int min=ar[0];
		for (int i = 1; i < top; i++)
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
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int max=ar[0];
		for (int i = 1; i < top; i++)
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
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind=0;
		for (int i = 1; i < top; i++)
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
		if (top == 0) 
		{
			throw new IllegalArgumentException();
		}
		int ind = 0;
		for (int i=0; i<top; i++)
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
		for (int i=0; i<top/2; i++)
		{
			int temp = 0;
			temp = ar[i];
			ar[i] = ar[top-i-1];
			ar[top-i-1] = temp;
		}
	}
	
	public  void reverseHalf()
	{
		int d = (top%2 == 0) ? 0 : 1;

		for(int i=0; i<top/2; i++)
		{
			int temp = ar[i];
			ar[i] = ar[top/2+d+i];
			ar[top/2+d+i] = temp;
		}
	}
	
	public void sortSelect()
	{
		for (int i=0;i<top-1;i++)
		{
			int min =i;
			for(int j=i+1;j<top;j++)
			{
				if (ar[j]<ar[min]) min=j;
			}
			int temp = ar[i];
			ar[i]=ar[min];
			ar[min]=temp;
		}
	}
}
