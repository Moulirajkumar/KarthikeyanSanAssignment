package application;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------Welcome to Dummy Twitter Application--------------");
		System.out.println("Enter 1 for Registration ");
		System.out.println("Enter 2 for Login");
		int n = sc.nextInt();
		if (n == 1) 
		{
			System.out.println("Please Enter Your Details");
			new NewUser().addData();
		} 
		else if (n == 2)
		{
			System.out.println("Hey,Their....");
			new LoginPage().login();
		} 
		else
		{
			new LoginPage().forgetPassword();
			System.out.println("Enter 1 for Registration ");
			System.out.println("Enter 2 for Login");
			int store = sc.nextInt();
			if (store == 1)
			{
				System.out.println("Please Enter Your Details");
				new NewUser().addData();
			} 
			else if (store == 2) 
			{
				System.out.println("Hey,Their....");
				new LoginPage().login();
			}
			else 
			{
				System.out.println("You Entered Invalid Input Please Run Again");
			}
		}
		sc.close();
	}
}
