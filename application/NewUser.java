package application;

import java.util.ArrayList;
import java.util.Scanner;
public class NewUser
{
	public String name;
	public String mailId;
	public long phoneNo;
	public String password;
	static ArrayList<Registration> al=new ArrayList<Registration>();
	Scanner sc=new Scanner(System.in);
	public void addData()
	{
		System.out.println("Enter the User Name");
		name=sc.nextLine();
		System.out.println("Enter User Phone Number");
		phoneNo=sc.nextLong();
		System.out.println("Enter User MailId");
		mailId=sc.next();
		System.out.println("Enter User Password");
		password=sc.next();
		Registration data=new Registration(name,mailId,password,phoneNo);
		al.add(data);
		System.out.println("Congratulations !!!! ");
		System.out.println("Account created Successfully");
		System.out.println("You can Login now");
		new LoginPage().login();
	}
	
}
