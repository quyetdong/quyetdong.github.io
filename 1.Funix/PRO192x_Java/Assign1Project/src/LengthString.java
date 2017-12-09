import java.util.Scanner;

public class LengthString {
	
	public static void main(String[] args) {
		System.out.println("To calculate the length of a string, please input a string:");
		string_length();
	}
	
	public static void string_length() {
		Scanner sc = new Scanner(System.in);
		String inp_string = sc.nextLine();
		sc.close();
		
		int length = inp_string.length();
		System.out.printf("The length of this string is: %d\n", length);	
	}
}