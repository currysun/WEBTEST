package CZ14;

/*
 * �߳�ͨѶ�� һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������
 * 
 * �������ӣ���������������
 * 
 * ����1���������̰߳�ȫ���⣬�۸����
 * ����2��ʹ����synchronized�������̰߳�ȫ������߳�ֻ���ڵ�ǰrun�������������������һ���߳�
 * 
 * wait()���ȴ� ����߳�ִ����wait��������ô���̻߳����ȴ���״̬���ȴ�״̬�µ��̱߳���Ҫ�������̵߳���notify�������ܻ��ѡ�
 * notify() ���� ���ѵȴ����̡߳�
 * 
 * wait ��notify ע������
 * 		1����������Object����
 * 		2��������ͬ��������ͬ�������в���ʹ��
 * 		3������Ҫ����������á�
 */
class Product {
	String name;
	double price;
	
}

class Producer extends Thread{
	Product p;
	
	public Producer(String name) {
		super(name);
	}
	//��������product 
	public Producer(Product p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		int i=0;
		synchronized (p) {
			while(true) {
				if(i%2==0) {
					p.name="ƻ��";
					/*
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					*/
					p.price=6.5;
				}
				else {
					p.name="�㽶";
					p.price=2.0;
				}
				System.out.println("������������"+p.name+" �۸�= "+p.price);
				i++;
			}
		}
	}
	
}

class Customer extends Thread{
	Product p;
	
	public Customer(String name) {
		super(name);
	}
	//��������product 
	public Customer(Product p) {
		this.p=p;
	}

	@Override
	public void run() {
		synchronized (p) {
			while(true) {
				System.out.println("�����߳���"+p.name+" �۸�= "+p.price);
			}
		}
		
	}
	
	
}



public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		Producer producer=new Producer(p);
		Customer customer=new Customer(p);
		producer.start();
		customer.start();
	}

}
