package student;

import java.util.Scanner;

public class StudentUtils {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String msg) {
		System.out.print(msg);
		return scanner.nextLine();
		
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));   //nextint는 버퍼이슈때문에 사용안함
		
	}
	
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg);
		return s.equalsIgnoreCase("y") || s.equals("yes")
	}
}
