package mainMethods;
import java.util.Arrays;
public class MergeSort {

	public static int [] init()
	{	
		int []arr = {21,6,8,7,5,1};
		return arr;
	}
	public static void outArr(int[]arr)
	{
		for (int i:arr) System.out.print(i + " ");
	}
	public static void sortMerge(int[] arr) {
		int len = arr.length;
		int n = 1; 
		int shift;
		int two_size; // 
		int[] arr2;
		while (n < len) {
			shift = 0;
			while (shift < len) {
				if (shift + n >= len) break;
				two_size = (shift + n * 2 > len) ? (len - (shift + n)) : n;
				arr2 = merge(Arrays.copyOfRange(arr, shift, shift + n),
						Arrays.copyOfRange(arr, shift + n, shift + n + two_size));
				for (int i = 0; i < n + two_size; ++i)
					arr[shift + i] = arr2[i];
				shift += n * 2;
			}
			n *= 2;
		}
	}
	private static int[] merge(int[] arr_1, int[] arr_2) {
		int len_1 = arr_1.length, len_2 = arr_2.length;
		int a = 0, b = 0, len = len_1 + len_2;
		int[] result = new int[len];
		for (int i = 0; i < len; i++) {
			if (b < len_2 && a < len_1) {
				if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
				else result[i] = arr_1[a++];
			} else if (b < len_2) {
				result[i] = arr_2[b++];
			} else {
				result[i] = arr_1[a++];
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{	
		int [] arr =init();	
		sortMerge(arr);
		outArr(arr);
	}
}
