package CZ08;
/*
 * ��̬������߱�������̬
 * ��̬����������ñ���ָ������Ķ��� ���� �ӿڵ����ñ���ָ��ʵ����Ķ���
 */

abstract class Animal{
	String name;
	
	String color="����ɫ";
	public Animal(String name){
		this.name=name;
	}
	public abstract void run();
}

class Mouse extends Animal{
	String color="��ɫ";
	public Mouse(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"������������");
	}
	public void dig(){
		System.out.println(name+" ���ڴ�");
	}
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Mouse("����");
		System.out.println(a.color);//��̬����£��Ӹ������ͬ����Ա����̬��ȡ���Ǹ���ĳ�Ա�����ǷǾ�̬����ȡ���������Ա��
		a.run();
		//a.dig(); ��̬һ��׶ˣ���̬����²��ܷ���������еķ�����
 	}

}
