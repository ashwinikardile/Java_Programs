import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class searchingTechniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] input = new int[n];
		for(int i=0;i<n;i++)
			input[i] = scan.nextInt();
		//int res = linearSearch(input,key);
		//System.out.println(res);
		int low = input[0];
		int high = input.length;
		int key = scan.nextInt();
		boolean result = binarySearch(input,key,low,high);
		System.out.println(result);
	}

	private static boolean binarySearch(int[] input, int key, int low, int high) {
		// TODO Auto-generated method stub
		Arrays.sort(input);
		int mid = (low + high) / 2;
		if(input[mid] == key)
			return true;
		else if(input[mid] > key)
			binarySearch(input,key,mid+1,high);
		else
			binarySearch(input,key,low,mid-1);
		return false;
	}

	private static int linearSearch(int[] input, int key) {
		// TODO Auto-generated method stub
		int len = input.length;
		for(int i=0;i<len-1;i++) {
			if(input[i] == key)
				return i;
		}
		return -1;
	}

}
