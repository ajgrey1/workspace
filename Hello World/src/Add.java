import java.util.Scanner;


public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Daniel's adding calculator");
		
		System.out.println("");
		System.out.println("Enter first number to add:");
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("");
		System.out.println("Enter second number to add:");
		int num2 = scan.nextInt();
		int num3 = num1+num2;
		
		System.out.println("");
		System.out.println("Answer:");
		System.out.println(num3);
		
	}

}
