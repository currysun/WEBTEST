package Testassignment;

import java.util.Scanner;

public class Practice_Function {

	public static void main(String[] args) {
		double a,b;
		System.out.println("Please input a num");	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		//b=sc.nextInt();
		
		if(a<0){
		System.out.println("f(x)="+(2*a+5)+"\nx= "+a );	
		}
		else if(a<10&&a>=0){
			System.out.println("f(x)="+(a*a-a+3)+"\nx= "+a  );	
		}
		else if (a>=10){
			System.out.println("f(x)="+(a*a*a-7*a)+"\nx= "+a  );	
		}
		else{
		System.out.println("a="+a+ " is unexpected value");
		}
	}

}
