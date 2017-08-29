package Testassignment;

import java.util.Scanner;

public class Practice_ZSNnumber {

	public static void main(String[] args) {
		int a,b,c,d;
		System.out.println("Please input 2 num");	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=(a*b)%100;
		if(a==c){
			System.out.println(a+" yes "+a+"*"+a+"="+a*b);	
		}
		else{
			System.out.println(a+" no "+a+"*"+a+"="+a*b);	
		}
		//System.out.println(c);	
		//c=a*b;
		//if(c)

	}

}
