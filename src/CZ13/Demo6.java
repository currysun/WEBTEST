package CZ13;

/*
 * ģ��3������ͬʱ��Ʊ
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
				System.out.println(Thread.currentThread().getName()+"�۳��˵�"+num+"��Ʊ");
				num--;
			}else{
				System.out.println("������");
				break;
			}
		}
	}
	
}

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicket s1=new SaleTicket("����1");
		SaleTicket s2=new SaleTicket("����2");
		SaleTicket s3=new SaleTicket("����3");
		s1.start();
		s2.start();
		s3.start();
	}

}
