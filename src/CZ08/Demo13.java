package CZ08;
/*
 * 值交换：
 * 1.基本数据类型  需求定义一个函数来做值交换
 * 2.引用数据类型
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
