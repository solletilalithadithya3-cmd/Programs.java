import java.util.Scanner;
class Triangle
{
	static Scanner data = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter first angle :");
		int num1 = data.nextInt();
		
		System.out.println("Enter second angle :");
		int num2 = data.nextInt();
		
		System.out.println("Enetr third angle :");
		int num3 = data.nextInt();
		
		if (num1+num2+num3 == 180)
		{
			System.out.println("It is a triangle");
		}
		else
		{
			System.out.println("it is not a triangle");
		}
	}
}

