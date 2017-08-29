package testdriever;

import java.util.Scanner;

import com.sun.jna.platform.win32.WinUser.INPUT;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("please input ranking");
		int a= input.nextInt();
		switch (a){
		case 1:
		case 2:
		case 3:System.out.print("award you a cup");
		break;
		case 4:
		case 5:
		case 6:System.out.print("award you a book");
		break;
		default:System.out.print("input wrong value");
		}

	}

}
