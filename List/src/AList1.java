public class AList1 implements EList
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
	
	@Override 
	public void init(int[] a)
	{
		if (a == null)
		{
			ar = new int[10];
			return;
		}
		if (a.length > ar.length)
			throw new IllegalArgumentException();
	
		top = a.length;
		for (int i = 0; i < top; i++)
		{		
			ar[i] = a[i];
		}
	}
	
	@Override 
	public int size()
	{
		return top;
	}
	
	@Override 
	public void clear()
	{
		ar = new int[10];
		top = 0;
	}
	
	@Override
	public int [] toArray()
	{
		int[] temp = new int[top];
		for (int i = 0; i < top; i++)
			temp[i] = ar[i];

		return temp;
	}
	
	@Override
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
	
	@Override 
	public void addStart(int val)
	{
		for (int i = top; i > 0; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[0] = val;
		top++;
	}
	
	@Override
	public void addEnd(int val)
	{	
		ar[top] = val;
		top++;
	}
	
	@Override 
	public void addPos(int pos, int val)
	{
		if (pos < 0 || pos > top)
			throw new ArrayIndexOutOfBoundsException();
		
		for(int i = top; i > pos; i--)
		{
			ar[i] = ar[i-1];
		}
		ar[pos] = val;
		top++;
	}
	
	@Override 
	public int delStart()
	{		
		if (top == 0)	
			throw new IllegalArgumentException();
		
		int delVal = ar[0];
		for(int i = 0; i < top; i++)
		{
			ar[i] = ar[i+1];
		}
		top--;
		return delVal;
	}
	
	@Override 
	public int delEnd()
	{
		if (top == 0)
			throw new IllegalArgumentException();
		
		int delVal = ar[top-1];
		ar[top-1] = ar[top];
		top--;
		return delVal;
	}
	
	@Override 
	public int delPos(int pos)
	{
		if (top == 0)
			throw new IllegalArgumentException();
		
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();
			
		int delVal = ar[pos];
		for (int i = pos; i < top; i++)
		{
			ar[i] = ar[i+1];
		}
		top--;
		return delVal;
	}
	
	@Override 
	public void set(int pos, int val)
	{
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();
			
		ar[pos] = val;
	}
	
	@Override 
	public int get(int pos)
	{
		if (pos < 0 || pos >= top)
			throw new ArrayIndexOutOfBoundsException();
		
		return ar[pos];
	}
	
	@Override 
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
	
	@Override 
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
	
	@Override 
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
	
	@Override 
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
	
	@Override 
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
	
	@Override 
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
	
	@Override 
	public void sort()
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
