package CZ07;
/*
 * ������һ�����࣬�˾߱�id,name,age ���ԣ����߱�һ���Ƚ�����ķ���
 * Ҫ�� ����д�Ϲ��캯�������캯��Ҳ����Ҫʹ����this �ؼ���
*/
class student{
	int id;
	String name;
	
	public student(int id ,String name){
		this(name);
		this.id =id; //�ֲ���������Ա������ֵ��
		System.out.println("two parameter method");
		
	}
	
	public student(String name){
		this.name=name;
		System.out.println("one parameter method");
	}
	
}

public class Demo7 {
	public static void main(String[] args){
		student s= new student(30, "curry");
		System.out.println("Id: "+s.id+" name: "+s.name);
		
		student s2= new student(35, "durant");
		System.out.print("Id: "+s2.id+" name: "+s2.name);
	}
}
