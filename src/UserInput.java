import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, Sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		Sum=a+b;
		System.out.println("The sum of two numbers is :"+Sum);
		
	}

}
