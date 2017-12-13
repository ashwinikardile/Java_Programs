import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		
		reverse_method_one(input);
		
	}

	private static void reverse_method_one(String input) {
		// TODO Auto-generated method stub
		byte[] str_len = input.getBytes();
		byte [] res = new byte[str_len.length];
		for(int i = 0; i<str_len.length; i++) {
			res[i] = str_len[str_len.length-i-1];
		}
		System.out.println(new String(res));
	}

}
