import java.util.Scanner;
class hallowsquare
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("enter a number");
		int num = sc.nextInt();
		
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i==0 || j==0 || i == num-1 || j == num-1)
				{
					System.out.print("* ");//how many character space with char in this will be considered in below
				}
				else{
					System.out.print("  ");//space is imp
				}
				
			}
			System.out.println();
		}
	}
}