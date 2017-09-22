package CZ14;
/*
 * 线程的创建方式2
 * 1. 自定义一个类实现Runnable 接口
 * 2.实现Runnable接口的run 方法，把自定义线程任务定义在run 方法上。
 * 3.创建Runnable实现类的对象调用start方法开启线程
 * 4.创建Thread类对象，并且把Runnable 实现类对象作为实参进行传递 ， 为什么要这么做？
 * 作用是把Runnable实现类的对象的run方法作为了线程的任务代码去执行。
 * 5.调用Thread对象的start方法开启线程
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
