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
		System.out.println(this.name+"��������");
	}
	


}



public class Demo2 {
	/*
	* System.arraycopy()
	* currentTimeMillis() ��ǰ��ϵͳʱ�� �ص�
	* exit(int status) �˳�jvm�� �������=0���������˳�jvm����0��ʾ�쳣�˳�jvm
	* gc() ����jvm�������������������������� ������object ������һ��finalize()�����鿴��������
	* object.finalize()���һ��������������������ʱ�����ص���finalize()����
	* getenv() ��ȡ��ǰ��������
	* getProperties()��ȡ��ǰϵͳ������
	* 
	*/
	public static void main(String[] args) {
		int[] srcArr= {10,14,16,18,20};
		int[] disArr=new int[4];
		
		System.arraycopy(srcArr, 1, disArr, 1, 2);
		//System.exit(0);
		System.out.println(Arrays.toString(disArr));
		System.out.println("��ǰ��ϵͳʱ�� "+System.currentTimeMillis());
		System.out.println(System.getenv("JAVA_HOME"));
		//System.out.println(System.getProperties(user.dir));
		for(int i=0;i<4;i++) {
			new Person("curry"+i);
			System.gc();//����jvm�������ϻ����������󣬲�һ������
		}
		//Properties properties=System.getProperties();
		//properties.list(System.out);
		String value =System.getProperty("os.name");
		System.out.println(value);
		
	}
	
}
