import java.util.Scanner;
class pluspattern
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)
	{
		int n = sc.nextInt();
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==n/2 || j==n/2)
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