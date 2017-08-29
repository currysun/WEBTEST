package Loop;

import java.util.Scanner;

public class Practice_While2 {

	public static void main(String[] args) {
		//System.out.println("please input a num");
		//Scanner sc=new Scanner(System.in);
		int year=2016;
		double student=80000;
		while(student<200000){
			student=(student*0.25)+student;
			year++;
			System.out.println(student);

		}
		System.out.println(year+"20W+ student ="+(int)student);

	}

}
