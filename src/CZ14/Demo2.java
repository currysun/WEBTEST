package CZ14;

/*
 * �߳��������������������
 * 	1.����2�������ϵ��߳�
 * 	2.2�������ϵ��̹߳���ͬһ�����ݣ���������
 * javaĿǰû�н���߳������ķ�����ֻ�д�����ϱ��⡣
 */

class DeadLock extends Thread{
	public DeadLock(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("curry"))
		{
			synchronized ("���") {
				System.out.println("curry �õ���أ�׼��ȥ��ң����");
			}
			synchronized ("ң����") {
				System.out.println("curry �õ�ң�����͵�أ��򿪿յ�");
			}
		}
		else if(Thread.currentThread().getName().equals("durant")) {
			synchronized ("ң����") {
				System.out.println("durant �õ�ң���� ��׼��ȥ�õ��");
			}
			synchronized ("���") {
				System.out.println("durant �õ�ң�����͵�أ��򿪿յ�");
			}
		}
	}
	
	
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock p1=new DeadLock("curry");
		DeadLock p2=new DeadLock("durant");
		p1.start();
		p2.start();
	}

}
