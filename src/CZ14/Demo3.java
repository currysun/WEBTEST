package CZ14;
/*
 * �̵߳Ĵ�����ʽ2
 * 1. �Զ���һ����ʵ��Runnable �ӿ�
 * 2.ʵ��Runnable�ӿڵ�run ���������Զ����߳���������run �����ϡ�
 * 3.����Runnableʵ����Ķ������start���������߳�
 * 4.����Thread����󣬲��Ұ�Runnable ʵ���������Ϊʵ�ν��д��� �� ΪʲôҪ��ô����
 * �����ǰ�Runnableʵ����Ķ����run������Ϊ���̵߳��������ȥִ�С�
 * 5.����Thread�����start���������߳�
 * 
 * 
 */


public class Demo3 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		Thread t=new Thread(d,"curry");
		t.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
