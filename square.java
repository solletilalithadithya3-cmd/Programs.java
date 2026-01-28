import java.util.Scanner;
class square 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		for (int i=0;i<num;i++)
		{
			for (int j=0;j<num;j++)
			{
				if(true)
				{
					System.out.print("* ");
				}
				else
					System.out.println(" no");
			}
			System.out.println();
			}
		}
}