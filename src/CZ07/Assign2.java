package CZ07;
//2.дһ���������Ƚ����Ժʹ���ı���˭��˭С��Ҫ���������������һ����

class Test{
	int age;
	public Test(int age) {
		this.age=age;
	}
	public void CompareAge(int age) {
		if(age>this.age) {
			System.out.println("�ֲ�������");
		}
		else if(age==this.age) {
			System.out.println("��ͬ");
		}
		else {
			System.out.println("���Դ�");
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
