package Testassignment;

import java.util.Scanner;

public class Practice_temp {
	public static void main(String[] args){
		int a,b,c,max,min = 0,t,mid = 0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		/*if(a>b){
			System.out.println(a);
		}
		else if(a==b){
			System.out.println(a-b);
		}
		
		else {
			System.out.println(b);
		}
		*/
		if(a>b){
			max=a;
			t=b;
			
		}
		else {
			max=b;
			t=a;
		}
		if(max<c){
			max=c;
			min=t;
		}
		else if(t<c){
			min=t;
		}
		else{
			min=c;
		}
		if(a>min&&a<max){
			mid=a;
		}
		else if(b>min&&b<max){
			mid=b;
		}
		else if(c>min&&c<max){
			mid=c;
		}
		if(max-min>mid){
			System.out.println("big");
		}
		else if(max-min<mid){
			System.out.println("small");
		}
		else if(max-min==mid){
			System.out.println("0");
		}
	}
	
	
}
