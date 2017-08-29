package Testassignment;

import java.util.Scanner;

public class Practice_Even_or_Odd {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Please input a num");	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		//b=sc.nextInt();
		
		if(a%2==0){
		System.out.println("a="+a+ " is Even");	
		}
		else{
			System.out.println("a="+a+ " is Odd");		
		}

	}

}
