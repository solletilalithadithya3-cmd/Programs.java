import java.util.Scanner;
class traffic
{
	static Scanner data = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("eneter color");
		String color = data.next();
		
		switch (color)
		{
		case "red":
			System.out.println("Stop");
		    break;
		case "orange":
			System.out.println("Wait");
		    break;
		case "green":
			System.out.println("Go");
		    break;
		default :
			System.out.println("System is not working");
		}
		
		}
}
