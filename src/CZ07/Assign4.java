package CZ07;
//дһ����ʼ����(��ʵ���ǹ�������)������ͳ�ƴ�����½�����

class CountStatic{
	public static int count=0;
	{
		count++;
		System.out.println(count);
	}

	
}

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountStatic();
		new CountStatic();
		new CountStatic();
	}

}
