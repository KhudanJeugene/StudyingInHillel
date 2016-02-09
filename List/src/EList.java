public interface EList
{
	public void init(int[] a);
	public int size();
	public void clear();
	public int [] toArray();
	public String toString();
	
	public void addStart(int val);	
	public void addEnd(int val);
	public void addPos(int pos, int val);
	public int delStart();
	public int delEnd();
	public int delPos(int pos);	
	public void set(int pos, int val);
	public int get(int pos);
	
	public int minElem();
	public int maxElem();
	public int minInd();
	public int maxInd();
	public void reverse();
	public  void reverseHalf();
	public void sort();
	
}
