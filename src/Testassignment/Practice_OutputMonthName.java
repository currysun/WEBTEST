package Testassignment;

import java.util.Scanner;

public class Practice_OutputMonthName {
	public static void main(String[] args) {
        int month;
		System.out.println("Please input a num");	
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		switch (month){
		case 1:
		System.out.println("January");	
		break;
		case 2:
		System.out.println("Febuary");	
		break;
		case 3:
		System.out.println("March");	
		break;
		}
	}
}
