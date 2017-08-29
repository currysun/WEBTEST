package Testassignment;

import java.util.Scanner;

public class Practice_YearMonth {
	public static void main(String[] args) {
        int year,month;
		System.out.println("Please input a num");	
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		month=sc.nextInt();
		switch (month) {
		/*case 1:
			System.out.println("month =31");
			break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println("month =29");	
			}
			else{
				System.out.println("month =28");	
			}	
			break;
		case 3:
			System.out.println("month =31");
			break;
		case 4:
			System.out.println("month =30");
			break;
		default:
			System.out.println("please input a valid num");
			break;
		*/
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("month =31");
		break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("month =30");
		break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println("month =29");	
			}
			else{
				System.out.println("month =28");		
			}
		break;
		default:
			System.out.println("Invalid month");
		}
		
	}
}