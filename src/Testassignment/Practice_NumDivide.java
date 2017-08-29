package Testassignment;

import java.util.Scanner;

public class Practice_NumDivide {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Please input a num");	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		//b=sc.nextInt();
		
		if(a%3==0&&a>0){
		System.out.println("a="+a+ " is positve num can be divide by 3 or 5 or 7");	
		}
		else if(a%5==0&&a>0){
			System.out.println("a="+a+ " is positve num can be divide by 3 or 5 or 7");		
		}
		else if (a%7==0&&a>0){
			System.out.println("a="+a+ " is positve num can be divide by 3 or 5 or 7");
		}
		else{
		System.out.println("a="+a+ " is nagative num can not be divide by 3 or 5 or 7");
		}
	}

}
