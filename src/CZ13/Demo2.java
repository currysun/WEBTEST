package CZ13;

import java.util.Arrays;
import java.util.Properties;

import bsh.This;

class Person{
	 String name;

	public Person(String name) {
		this.name=name;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(this.name+"被回收了");
	}
	


}



public class Demo2 {
	/*
	* System.arraycopy()
	* currentTimeMillis() 当前的系统时间 重点
	* exit(int status) 退出jvm， 如果参数=0代表正常退出jvm，非0表示异常退出jvm
	* gc() 建议jvm马上启动垃圾回收器回收垃圾 ，利用object 类中有一个finalize()方法查看垃圾回收
	* object.finalize()如果一个对象被垃圾回收器回收时，会县调用finalize()方法
	* getenv() 获取当前环境变量
	* getProperties()获取当前系统的属性
	* 
	*/
	public static void main(String[] args) {
		int[] srcArr= {10,14,16,18,20};
		int[] disArr=new int[4];
		
		System.arraycopy(srcArr, 1, disArr, 1, 2);
		//System.exit(0);
		System.out.println(Arrays.toString(disArr));
		System.out.println("当前的系统时间 "+System.currentTimeMillis());
		System.out.println(System.getenv("JAVA_HOME"));
		//System.out.println(System.getProperties(user.dir));
		for(int i=0;i<4;i++) {
			new Person("curry"+i);
			System.gc();//建议jvm回收马上回收垃圾对象，不一定马上
		}
		//Properties properties=System.getProperties();
		//properties.list(System.out);
		String value =System.getProperty("os.name");
		System.out.println(value);
		
	}
	
}
