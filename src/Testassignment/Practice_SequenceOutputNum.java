package Testassignment;
import java.util.Scanner;
public class Practice_SequenceOutputNum {

//������������x,y,z���������������С���������
		public static void main(String[] args) {
			int x, y, z;
			Scanner input = new Scanner(System.in);
			x = input.nextInt();
			y = input.nextInt();
			z = input.nextInt();
			if (x > y) { /* ����x,y��ֵ */
				x = (x+y);
				y = x-y;
				x=  x-y;
			} 
			if (x > z) { /* ����x,z��ֵ */
				x = (x+z);
				z = x-z;
				x=  x-z;
			}
			if (y > z) { /* ����z,y��ֵ */
				z = z+y;
				y = z-y;
				z=  z-y;
			}
			System.out.println("��С�����˳���ǣ�" + x + "," + y + "," + z);
		}
		
		
		


	}
