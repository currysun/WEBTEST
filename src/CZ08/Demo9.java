package CZ08;
/*
 * ʹ��java����һ����ͨ��ѧ����java �������ѧ����java��ҵ���ѧ��
 * ���е�ѧ������ѧϰ������ѧϰ���ݲ�һ��
 * ��ͨ��ѧ�������˼
 * �����ࣺjavase
 * ��ҵ��ѧ����javaee+android
 */

class StudentA{
	String name;
	public StudentA(String name) {
		this.name=name;
	}
	public void Study() {
		System.out.println("��ͨѧ�� "+name+"ѧ���˼");
	}
}

class StudentJavaSe extends StudentA{
	public StudentJavaSe(String name) {
		super(name);
	}
	public void Study() {
		System.out.println("java������ѧ��"+name+ "ѧse");
	}
}

class StudentJavaEe extends StudentA{         //��ҵ��ѧ�� �����ڻ������һ�֣�������
	public StudentJavaEe(String name) {
		super(name);
	}
	public void Study() {
		System.out.println("java��ҵ��ѧ�� ѧee");
	}
}


public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA a1=new StudentA("С��");
		StudentJavaSe a2=new StudentJavaSe("С��");
		StudentJavaEe a3=new StudentJavaEe("С��");
		a1.Study();
		a2.Study();
		a3.Study();
	}

}
