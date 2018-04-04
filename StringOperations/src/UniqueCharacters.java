import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean res = isUnique(str);
		System.out.println(res);
	}

	private static boolean isUnique(String str) {
		// TODO Auto-generated method stub
		for(char c: str.toCharArray()) {
			if(str.indexOf(c) == str.lastIndexOf(c))
				return true;
		}
		return false;
	}

}
