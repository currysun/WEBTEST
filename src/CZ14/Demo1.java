package CZ14;

/*
 * �����ޣ�һ�����п���һ�˴��ۣ�ȥ����ȡǮ��ÿ��ֻ��ȡ1000��һ��5000�����ܳ����̰߳�ȫ����.
 */
class BankThread extends Thread{
	static int money=5000;
	public BankThread (String name) {
		super(name);
	}
	@Override
	public void run() {	
			while(true) {
				synchronized ("lock") {
				if(money>0) {
					System.out.println(Thread.currentThread().getName()+"ȡ��1000��Ǯ");
					money=money-1000;
				}else
				{
					System.out.println("ûǮ��");
					break;
				}
			}
		}
	}
		
}
		



public class Demo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankThread husband=new BankThread("�Ϲ�����");
		BankThread wife=new BankThread("�������п�");
		husband.start();
		wife.start();
	}

}
