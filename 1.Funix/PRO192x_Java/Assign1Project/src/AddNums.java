import java.util.Scanner;

public class AddNums{
	public static void main(String[] args) {
		add_nums();
	}
	
	public static void add_nums() {
		int total = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			try{
				num = sc.nextInt();
			}
			catch(Exception e){
				System.out.println("Wrong format, re-input:");
				sc.nextLine();
				continue;
			}
			
			if(num == 0) break;
			total = total + num;
		}
		
		sc.close();
		System.out.printf("Total is: %d\n", total);
	}
}