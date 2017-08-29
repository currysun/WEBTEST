package Testassignment;

import java.util.Scanner;

import com.google.common.base.CaseFormat;

public class Practice_Score {
	public static void main(String[] args) {
		int a,b;
		System.out.println("Please input a integer number");	
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		/*if(a>=90&&a<=100){
		System.out.println("Score = "+a+"\tA");	
		}
		else if (a>=80&&a<=89){
		System.out.println("Score = "+a+"\tB");	
		}
		else if (a>=70&&a<=79){
			System.out.println("Score = "+a+"\tC");	
		}
		else if (a>=60&&a<=69){
			System.out.println("Score = "+a+"\tD");	
		}
		else if (a<60&&a>=0){
			System.out.println("Score = "+a+"\tE");	
		}
		else{
			System.out.println("Invalid Score ,please input right result");	
		}*/
		switch (a/10){
		case  10:
			System.out.println("Score = "+a+"\tA");		
		break;
		case  9:
			System.out.println("Score = "+a+"\tA");		
		break;
		case  8:
			System.out.println("Score = "+a+"\tB");		
		break;
		case  7:
			System.out.println("Score = "+a+"\tC");		
		break;
		case  6:
			System.out.println("Score = "+a+"\tD");		
		break;
		case  5:
			System.out.println("Score = "+a+"\tE");		
		break;
		default:
		
			System.out.println("Invalid result");		
		break;	
		}
	}
}
