package CZ07;
/*�����������ģʽ
 * 1.˽�л����캯��
 * 2.����������������ͱ�������ָ�������
 * 3.�ṩһ��������̬������ȡ�������
 */

class SignleTest{
	private static SignleTest s1=new SignleTest();
	
	private SignleTest() {
		
	}
	
	public static SignleTest getSingle() {
		return s1;
	}
}
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignleTest s1=SignleTest.getSingle();
		System.out.println(s1);
	}

}
