package CZ14;

/*
 * 两夫妻，一人银行卡，一人存折，去银行取钱，每次只能取1000，一共5000，不能出现线程安全问题.
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
					System.out.println(Thread.currentThread().getName()+"取了1000块钱");
					money=money-1000;
				}else
				{
					System.out.println("没钱了");
					break;
				}
			}
		}
	}
		
}
		



public class Demo1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankThread husband=new BankThread("老公存折");
		BankThread wife=new BankThread("老婆银行卡");
		husband.start();
		wife.start();
	}

}
