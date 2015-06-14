import java.util.Scanner;


public class Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Daniel's subtracting calculator");
		
		System.out.println("");
		System.out.println("Enter first number:");
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("");
		System.out.println("Enter number to subtract:");
		int num2 = scan.nextInt();
		int num3 = num1-num2;
		
		System.out.println("");
		System.out.println("Answer:");
		System.out.println(num3);
		
	}

}
