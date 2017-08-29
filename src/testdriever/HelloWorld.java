package testdriever;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args){
		//int money=1000; //存数据，内存空间存的数值
		//int a=10,b=0;
		//b=a++;
		//System.out.println(b);
		//System.out.println(a+++a);
		Scanner input =new Scanner(System.in);
		System.out.println("please input math score");
		int a =input.nextInt();
		System.out.println("please input java score");
		int b =input.nextInt();
		if(b%a==0 || b>1000){
			System.out.println("a="+a);
		}
		else{
			System.out.println("b="+b);
		}
	}
}
