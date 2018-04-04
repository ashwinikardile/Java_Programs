import java.util.HashSet;
import java.util.Scanner;

public class FirstOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String inputString = scan.next();
		char[] input = inputString.toCharArray();
		System.out.println(findOccurance(input));
	}

	private static char findOccurance(char[] input) {
		// TODO Auto-generated method stub
		HashSet<Character> set = new HashSet<>();
		for(int i=0; i<=input.length-1; i++) {
			char c = input[i];
			if(set.contains(c))
				return c;
			else
				set.add(c);
		}
		return '\0';
	}

}

/*class Solution {
    public String solution(String S) {
        // write your code in Java SE 8
        String[] c = S.split(":");
        
        //char[] c = S.toCharArray();
        for (char ele : c){
            if(ele != 0 || ele != 1 || ele != 2 )
                return null;
        }
        
        for(int i=0; i<= c.length; i++){
            if(c[i] <= 2){
                c[0] = c[i];
            }
            if(c[0] == 2){
                if(c[i] <= 3)
                    c[1] = c[i];
                else
                    return null;
                if(c[0] == 0 || c[0] == 1){
                    c[1] = 
                }
                if(c[i]<= 5)
                    c[2] = c[i];
                else
                    return null;
                c[3] = c[i];
            }
        }
        return c.toString();
    }
}*/
