package CZ13;

/*
 * 模拟3个窗口同时卖票
 */
class SaleTicket extends Thread{
	
	static int num=50;

	public SaleTicket(String name) {
		super(name);
	}

	@Override
	public void run() {
		while(true) {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+"售出了第"+num+"号票");
				num--;
			}else{
				System.out.println("售罄了");
				break;
			}
		}
	}
	
}

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicket s1=new SaleTicket("窗口1");
		SaleTicket s2=new SaleTicket("窗口2");
		SaleTicket s3=new SaleTicket("窗口3");
		s1.start();
		s2.start();
		s3.start();
	}

}
