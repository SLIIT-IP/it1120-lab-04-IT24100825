import java.util.Scanner;

public class IT24100825Lab4Q1{

	public static void main(String[] args) {
		double num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = scanner.nextDouble();
		
		if(num > 0) {
			System.out.println("The number is: Positive");
		}else if(num < 0) {
			System.out.println("The number is: Negative");
		}else {
			System.out.println("The number is Zero.");
		}
	}

}
