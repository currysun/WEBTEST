package CZ08;

interface A{
	public void print();
}

interface B{
	public void print();
}

/*
 * �ӿ���ӿ��Ǽ̳й�ϵ
 * �ӿڿ��Լ̳ж���ӿ�
 */
interface C extends A,B{
	public void run();
}


/*
 * �ӿ������� ʵ�ֹ�ϵ
 * һ�������ʵ�ֶ���ӿ�
 */
class Demo10 implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ta=new Demo10();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
