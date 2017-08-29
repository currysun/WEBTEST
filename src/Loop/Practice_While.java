package Loop;

import java.util.Scanner;

import com.sun.jna.platform.win32.WinUser.INPUT;

public class Practice_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please input a num");
		Scanner sc=new Scanner(System.in);
		int a=0;
		a=sc.nextInt();
		
		/*while(a<125||a>999){
			System.out.println("invalid number ,please input a right num");
			a=sc.nextInt();
		}
		System.out.println("over");*/
		/*String b=sc.next();
		while(!b.equals("50%")){
			System.out.println("shotting 100 again");
			System.out.println("layup 100 again");
			b=sc.next();
		}
		System.out.println("take a rest");
		*/
		while(a<=0){
			System.out.println("invalid input value,please input again");
			a=sc.nextInt();
		}
		int count=1,sum=0,score=0;
		while(count<=a){
			System.out.println("please input the "+count+"score");
			score=sc.nextInt();
			while(score<0||score>100){
				System.out.println("invalid score value,please input again");
				score=sc.nextInt();
			}
			sum+=score;
		}
	}

}
