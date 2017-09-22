package CZ14;

/*
 * 线程通讯： 一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务
 * 
 * 经典例子：生产者与消费者
 * 
 * 问题1：出现了线程安全问题，价格错乱
 * 问题2：使用了synchronized块解决了线程安全问题后，线程只能在当前run方法结束后才能运行另一个线程
 * 
 * wait()：等待 如何线程执行了wait方法，那么该线程会进入等待的状态，等待状态下的线程必须要被其他线程调用notify方法才能唤醒。
 * notify() 唤醒 唤醒等待的线程。
 * 
 * wait 和notify 注意事项
 * 		1：都是属于Object对象
 * 		2：必须在同步代码块或同步函数中才能使用
 * 		3：必须要由锁对象调用。
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
	//共享数据product 
	public Producer(Product p) {
		this.p=p;
	}
	
	@Override
	public void run() {
		int i=0;
		synchronized (p) {
			while(true) {
				if(i%2==0) {
					p.name="苹果";
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
					p.name="香蕉";
					p.price=2.0;
				}
				System.out.println("生产者生产了"+p.name+" 价格= "+p.price);
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
	//共享数据product 
	public Customer(Product p) {
		this.p=p;
	}

	@Override
	public void run() {
		synchronized (p) {
			while(true) {
				System.out.println("消费者吃了"+p.name+" 价格= "+p.price);
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
