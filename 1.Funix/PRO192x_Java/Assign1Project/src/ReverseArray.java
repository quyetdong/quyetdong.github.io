import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("Reverse the order of a sequence of numbers\n");
		reverse_nums();
	}
	
	public static void reverse_nums() {
		Scanner sc = new Scanner(System.in);
		
		//get an array of ten integers
		int size = 10;
		System.out.printf("Input %d integers:\n", size);
		int[] numbers = input_number_array(sc, size);
		sc.close();
		
		//print reversed-array
		System.out.println("The sequence of numbers in reversed-order:");
		print_reversed(numbers);
	}
	
	public static int[] input_number_array(Scanner sc, int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}		
		return array;
	}
	
	public static void print_reversed(int[] numbers) {
		int length = numbers.length;
		for(int i = 1; i < length + 1; i++) {
			System.out.printf("%d ", numbers[length - i]);	
		}	
	}
}
