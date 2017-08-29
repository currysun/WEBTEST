package Testassignment;



import java.util.Scanner;

public class Practice_OutputChar {
	public static void main(String[] args) {
		String s;
		char c;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字符：");
		s = input.next();
		c = s.charAt(0); // 取得输入的第一个字符
		
		if (c < 32) {
			System.out.println("这是一个控制字符");
		} 
		else if (c >= '0' && c <= '9') {
			System.out.println("这是一个数字字符");
		} 
		else if (c >= 'A' && c <= 'Z') {
			System.out.println("这是一个大写字母");
		} 
		else if (c >= 'a' && c <= 'z') {
			System.out.println("这是一个小写字母");
		}
		else {
			System.out.println("这是一个其他字符");
		}
	}
}
