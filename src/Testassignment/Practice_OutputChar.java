package Testassignment;



import java.util.Scanner;

public class Practice_OutputChar {
	public static void main(String[] args) {
		String s;
		char c;
		Scanner input = new Scanner(System.in);
		System.out.print("������һ���ַ���");
		s = input.next();
		c = s.charAt(0); // ȡ������ĵ�һ���ַ�
		
		if (c < 32) {
			System.out.println("����һ�������ַ�");
		} 
		else if (c >= '0' && c <= '9') {
			System.out.println("����һ�������ַ�");
		} 
		else if (c >= 'A' && c <= 'Z') {
			System.out.println("����һ����д��ĸ");
		} 
		else if (c >= 'a' && c <= 'z') {
			System.out.println("����һ��Сд��ĸ");
		}
		else {
			System.out.println("����һ�������ַ�");
		}
	}
}
