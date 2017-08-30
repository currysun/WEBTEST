package CZ14;

/*
 * 线程死锁现象满足的条件：
 * 	1.存在2个或以上的线程
 * 	2.2个或以上的线程共用同一份数据（对象锁）
 * java目前没有解决线程死锁的方案，只有从设计上避免。
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
			synchronized ("电池") {
				System.out.println("curry 拿到电池，准备去拿遥控器");
			}
			synchronized ("遥控器") {
				System.out.println("curry 拿到遥控器和电池，打开空调");
			}
		}
		else if(Thread.currentThread().getName().equals("durant")) {
			synchronized ("遥控器") {
				System.out.println("durant 拿到遥控器 ，准备去拿电池");
			}
			synchronized ("电池") {
				System.out.println("durant 拿到遥控器和电池，打开空调");
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
