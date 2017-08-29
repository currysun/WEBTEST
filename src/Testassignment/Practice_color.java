package Testassignment;


import java.util.Scanner;
public class Practice_color {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int color;   /* 用整型数表示颜色号 */
		System.out.println("(0--Black, 1--Blue, 2--Green, 3--Red, 4--Yellow");
		System.out.print("Enter color number: ");
		color = input.nextInt();
		switch (color) {
		case 0:
			System.out.println(" Black");
			break;
		case 1:
			System.out.println(" Blue");
			break;
		case 2:
			System.out.println(" Green");
			break;
		case 3:
			System.out.println(" Red");
			break;
		case 4:
			System.out.println(" Yellow");
			break;
		default:
			System.out.println(" Error Input");
		}
	}
}
