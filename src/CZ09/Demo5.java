package CZ09;
/*
 * ��̬��������������ͱ���ָ������Ķ���  ���� �ӿ����͵��������ͱ��� ָ��ӿ�ʵ����Ķ���
 * �ӿ����� ���� =new �ӿ�ʵ����
 * 
 */

class UserDao implements Dao{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("���Ա���ɹ�");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("ɾ��Ա���ɹ�");
	}
	
} 

interface Dao{
	public void add();
	public void delete();
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao a=new UserDao(); //�ӿ��������� �ı��� ָ���� �ӿ�ʵ����Ķ���
		a.add();
		a.delete();
	}

}
