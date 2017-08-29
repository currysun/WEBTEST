package array;

import java.util.Scanner;

public class Practice_Array {

	public static void main(String[] args) {
		int a[]={8,4,2,1,23,344,12,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("input a num");
		int b=sc.nextInt();
		int count=0;
		boolean result=false;
		
		for(int i=0;i<a.length;i++){
			if(b==a[i]){
				count++;
			}
			//System.out.println(a[i]);
		}
		if(count>0&&count<1){
			System.out.println("bingo "+b);
		}
			else if(count>1){
			
			System.out.println("there havs "+count+"duplicated numbers");
		}
		else{
			System.out.println("wrong num "+b);
		}
	}

}
