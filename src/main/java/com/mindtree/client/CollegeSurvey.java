package com.mindtree.client;

import java.util.Scanner;

import com.mindtree.service.ServiceImp;

public class CollegeSurvey {
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		ServiceImp ob = new ServiceImp();
		int choice = 0;
		boolean cont = false;
			do
			{
				System.out.println("Choose to :");
				System.out.println("1. Create a college");
				System.out.println("2. Create a student");
				System.out.println("3. Display all colleges and students");
				System.out.println("4. Display based on college and subject");
				System.out.println("5. Exit");
				System.out.println("Enter your choice :");
			    choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					ob.addCollege();
					break;
				case 2:
					ob.addStudent();
					break;
				case 3:
					ob.displayAll();
					break;
				case 4:
					ob.displayBasedOnCollege();
					break;
				case 5:
					System.out.println("Exit");
					cont = false;
					break;
				default:
					System.out.println("Invalid option. Please try again with a valid option");
					System.out.println("Testing with branch");
					break;
				}
				if(choice!=5)
				{
					System.out.println("Do you want to continue? type true if yes/false if no");
					System.out.println("creating branch");
					cont = sc.nextBoolean();
					//testing branch
				}
			}while(cont);
		}
	

}
