//Write a program for printing k largest elements in an array. 

import java.util.*;

public class KLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		Integer []numberOfInput = new Integer[input];
		for(int i=0; i<numberOfInput.length; i++) {
			numberOfInput[i] = scan.nextInt();
		}
		System.out.println("Enter K value");
		int k = scan.nextInt();
		Arrays.sort(numberOfInput, Collections.reverseOrder());
		for(int i=0; i<k; i++) {
			System.out.println(numberOfInput[i] +" ");
		}
	}
}
