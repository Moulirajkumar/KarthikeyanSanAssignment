package application;

import java.util.Scanner;

public class LoginPage 
{
	Scanner sc=new Scanner(System.in);
	public void login()
	{
		System.out.println("Enter MailId to Login");
		String email=sc.next();
		System.out.println("Enter Password ");
		String password=sc.next();
		if(NewUser.al.size()==0)
		{
			System.out.println("Sorry, you don't have an Account");
			System.out.println("Please run again");
		}
		for(int i=0;i<NewUser.al.size();i++)
		{
			if(NewUser.al.get(i).getEmail().equals(email) && NewUser.al.get(i).getPassword().equals(password))
			{
				System.out.println("Login Successfully");
				Inside.feeds();
				boolean isTrue=true;
				while(isTrue) {
					System.out.println("Enter 1 for watch Trendings ");
					System.out.println("Enter 2 for Logout");
					int input=sc.nextInt();
				switch(input)
				{
				case 1:
				{
					System.out.println("---------------------------Trendings in Twitter ------------------------------");
					Inside.trending();
					break;
				}
				case 2:
				{
					System.out.println("Do You want to Exit");
					String str=sc.next();
					if(str.equals("YES") || (str.equals("Y") || (str.equals("Yes"))))
					{
						System.out.println("Logout Successfully");
						System.out.println("Missing You Already!!!");
						isTrue=false;
					}
					break;
				}
				default:
				{
					System.err.println("You Entered Different From the Given Options. So, you have to choose form the given option");
				}
				}
				}
			}
			else
			{
				System.out.println("User Name Doesn't find in the Data Base Or You Entred Wrong, Please check Once");
				System.out.println("Do You Want to Create New Id ");
				System.out.println("Press 1 for Create");
				System.out.println("Press Any To Exit");
				int input2=sc.nextInt();
				if(input2==1)
				{
					System.out.println("Please Fill The Form");
					new NewUser().addData();
				}
				else
				{
					System.out.println("Thanks for Using Our Application");
					System.out.println("Visit Us Again");
				}
			}
		}
	}
}
