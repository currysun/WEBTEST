package CZ08;
/*
 * ֵ������
 * 1.������������  ������һ����������ֵ����
 * 2.������������
 * 
 * 
 */
public class Demo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=3;
		valueChange(a,b);
		//System.out.println("a= "+a+" b = "+b);
	}
	
	public static void valueChange(int a,int b){
		int temp=b;
		b=a;
		a=temp;
		System.out.println("a= "+a+" b = "+b);
	}
}
