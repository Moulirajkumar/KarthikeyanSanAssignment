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
				boolean visited=true;
				while(isTrue) {
					if(visited)
					{
						System.out.println("Enter 1 for watch Trending ");
					}
					else {
						System.out.println("Enter 1 For Watch Feeds ");
					}
						System.out.println("Enter 2 for Logout");
					int input=sc.nextInt();
				switch(input)
				{
				case 1:
				{	
					if(visited) {
						System.out.println("---------------------------Trendings in Twitter ------------------------------");
						Inside.trending();
						visited=false;
					}
					else {
						Inside.feeds();
						visited=true;
					}
					break;
				}
				case 2:
				{
					System.out.println("Do You want to Exit");
					System.out.println("Enter Yes Or No");
					String str=sc.next();
					if(str.equals("YES") || (str.equals("Y")) || (str.equals("Yes")) || (str.equals("yes")))
					{
						System.out.println("Logout Successfully");
						System.out.println("Missing You Already!!!");
						isTrue=false;
					}
					else if(str.equals("No"))
					{
						System.out.println("We hope You Are Enjoying My Application");
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
				
				System.out.println("Enter 0 for Forget Password");
				System.out.println("Do You Want to Create New Id ");
				System.out.println("Press 1 for Create");
				System.out.println("Press Any Key Except 1,0 To Exit");
				int input2=sc.nextInt();
				if(input2==1)
				{
					System.out.println("Please Fill The Form");
					new NewUser().addData();
				}
				else if(input2==0)
				{
					new LoginPage().forgetPassword();
				}
				else
				{
					System.out.println("Thanks for Using Our Application");
					System.out.println("Visit Us Again");
				}
			}
		}
	}
	public void forgetPassword()
	{
		System.out.println("Enter MailId to Login");
		String emailId=sc.next();
		for(int i=0;i<NewUser.al.size();i++)
		{
			if(NewUser.al.get(i).getEmail().equals(emailId))
			{
				System.out.println("Enter New Password");
				String passwordCheck1=sc.next();
				System.out.println("Enter Again Your Password");
				String passwordCheck2=sc.next();
				if(passwordCheck1.equals(passwordCheck2))
				{
					NewUser.al.get(i).setPassword(passwordCheck2);
					System.out.println("Your Password is Set Successfully!!!!");
					new LoginPage().login();
					break;
				}
				else
				{
					boolean passwordcheck=true;
					while(passwordcheck)
					{
						System.out.println("Sorry, You MisMatch With The Previous One");
						System.out.println("Enter New Password");
						String passwordCheck3=sc.next();
						System.out.println("Enter Again Your Password");
						String passwordCheck4=sc.next();
						if(passwordCheck3.equals(passwordCheck4))
						{
							NewUser.al.get(i).setPassword(passwordCheck3);
							System.out.println("Your Password is Set Successfully!!!!");
							new LoginPage().login();
							passwordcheck=false;
						}
					}
				}
			}
		}
	}
}
