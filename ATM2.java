import java.util.Scanner;
class ATM2
{
	static Scanner data = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.println("1.Check balance \n2.Deposit \n3.Withdraw \n4.change pin");
		int option = data.nextInt();
		
		double balance = 99.9;
		
		int pinno = 1234;
		
		long phoneno = 1234567890L;
		
		
		
		switch (option)
		{
		case 1:System.out.println("Welcome Mr.Lalithadithya ");
		       System.out.println("Enter you pin");
			   int pin = data.nextInt();
			   if (pinno == pin)
			   {
				   System.out.println("Your current balance is "+balance+"Rs in your bank account");
			   }
			  
			   else{
				   System.out.println("Entered wrong pinno! plz check your pinno");
			   }
		       break;
		case 2:System.out.println("Enter your deposit amount");
		       double deposit = data.nextDouble();
			   balance = balance+deposit;
			   System.out.println("Deposit Sucessfull");
			   System.out.println("Your current balance is "+balance+"after deposit");
			   break;
		case 3:System.out.println("Enter your pin: ");
		       int userpin = data.nextInt();
			   
			   if (userpin == pinno)
			   {
				   System.out.println("Enter the amount you want to withdraw:");
				   Double withdraw = data.nextDouble();
				   
				   if (withdraw <= balance)
				   {
					   balance = balance-withdraw;
					   System.out.println("After withdrawl your current balance is: " +balance+ "rs");
				   }
				   else{
					   System.out.println("You have no sufficent balance to withdraw the enterd amount");
				   }
			   }
			   else{
				   System.out.println("Entered worng pinno");
			   }
			   break;
		case 4:System.out.println("Enter your reg phone no.");
		       long phoneNumber = data.nextLong();
			   
		       if (phoneNumber == phoneno)
		       {
				   int otp = (int) (Math.random()*9000)+1000;
				   System.out.println("Your otp is:"+otp);
				   System.out.println("Eneter your otp:");
				   int userotp = data.nextInt();
				   if (userotp == otp)
				   {
					   System.out.println("Enter your new pin:");
					   int newpin = data.nextInt();
					   pinno = newpin;
					   System.out.println("Your new pinno is:"+pinno);
					   
				   }
				   else{
					   System.out.println("Otp is not matching!..Wrong otp");
				   }
		       }
			   else{
				   
				   System.out.println("Wrong mobile number");
			   }
			   break;
		
		default:System.out.println("Give a valid option");
		       
		}
	}
}