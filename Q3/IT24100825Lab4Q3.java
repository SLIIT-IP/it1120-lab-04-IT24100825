import java.util.Scanner;

public class IT24100825Lab4Q3{
		public static void main(String[] args) {
			double num;
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter a number: ");
			num = scanner.nextDouble();
			
			String message = (num > 0) ? "The number is: Positive" :
				  			 (num < 0) ? "The number is: Negative" :
				  			 "The number is Zero.";
			
			System.out.println(message);
		}
}
