import java.util.Scanner;
class singleline
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("Enter your input");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if (i==j)
				{
				System.out.print("* ");
				}
				else{
					System.out.print("  ");
			    }
			}
			System.out.println();
		}
	}
}