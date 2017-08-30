package CZ07;
//2.写一个方法，比较属性和传入的变量谁大谁小（要求变量名和属性名一样）

class Test{
	int age;
	public Test(int age) {
		this.age=age;
	}
	public void CompareAge(int age) {
		if(age>this.age) {
			System.out.println("局部变量大");
		}
		else if(age==this.age) {
			System.out.println("相同");
		}
		else {
			System.out.println("属性大");
		}
		
	}
}

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test assign2=new Test(20);
		assign2.CompareAge(20);
	}

}
