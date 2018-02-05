import java.util.*;
public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] input = new int[n];
		for(int i=0;i<input.length;i++) {
			input[i] = scan.nextInt();
		}
		boolean result; 
		//result = naiveMethod(input);
		result = usingSorting(input);
		System.out.println(result);
	}

	private static boolean usingSorting(int[] input) {
		// TODO Auto-generated method stub
		for(int i=0; i<input.length; i++)
			input[i] = input[i] * input[i];
		Arrays.sort(input);
		for(int i=input.length-1; i>=2; i--) {
			int first = 0;
			int second = i-1;
			while(first < second) {
				if(input[first] + input[second] == input[i])
					return true;
				if(input[first] + input[second] < input[i])
					first++;
				else
					second--;
			}
		}
		return false;
	}

	private static boolean naiveMethod(int[] input) {
		// TODO Auto-generated method stub
		int n = input.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					int a = input[i]*input[i], b= input[j]*input[j], c=input[k]*input[k];
					if(a == b+c || b== a+c|| c== a+b)
						return true;
				}
			}
		}
		
		return false;
	}

}
