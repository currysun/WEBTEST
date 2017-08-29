package Testassignment;
import java.util.Scanner;
public class Practice_SequenceOutputNum {

//输入三个整数x,y,z，请把这三个数由小到大输出。
		public static void main(String[] args) {
			int x, y, z;
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
			y = input.nextInt();
			z = input.nextInt();
			if (x > y) { /* 交换x,y的值 */
				x = (x+y);
				y = x-y;
				x=  x-y;
			} 
			if (x > z) { /* 交换x,z的值 */
				x = (x+z);
				z = x-z;
				x=  x-z;
			}
			if (y > z) { /* 交换z,y的值 */
				z = z+y;
				y = z-y;
				z=  z-y;
			}
			System.out.println("从小到大的顺序是：" + x + "," + y + "," + z);
		}
		
		
		


	}
