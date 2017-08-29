package Testassignment;

import java.util.Scanner;

public class Practice_LuckyNum {

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, x = 0, y = 0;
		System.out.println("input a num betwwen 125~999");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		// c=sc.nextInt();
		c = (a * 81);
		d = c / 10000;
		e = (c - d * 10000) / 1000;
		f = (c - d * 10000 - e * 1000) / 100;
		g = (c - d * 10000 - e * 1000 - f * 100) / 10;
		h = c % 10;
		x = d + e + f + g + h;
		System.out.println(c + "," + d + "," + e + "," + f + "," + g + h);
		/*
		 * if(a/10==0){ System.out.println("this is 1 position num"); } else
		 * if(a/100==0){ System.out.println("this is 2 position num"); } else
		 * if(a/1000==0){ System.out.println("this is hunred position num"); }
		 * if(a<125&&a>999){ System.out.println(
		 * "please input a num betwwen 125~999"); } if(){
		 * 
		 * }
		 */
		if (x >= 10 && x > 0) {
			y = x / 10 + x % 10;
			y = (y - 4) * 50;
			System.out.println("your luck number = " + y);
		} else {
			y = (x - 4) * 50;
			System.out.println("your luck number = " + y);
		}
	}

}
