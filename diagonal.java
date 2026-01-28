class diagonal 
{
	public static void main(String[] args) //i+j = n-1 like 0+4 = 4 and so on
	{
		int n = 5;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==j||i+j==n-1)//or i==0||j==0||i==j||i+j==n-1||j==n-1||i==n-1(this not correct)
				   System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
