package CZ13;

import java.io.IOException;

/*
 
 RunType  �������Ӧ�ó�������л���
 һ��Ӧ�ó���ֻ��һ�����л���
 getRuntime()
 freeMemory()����jvm�����ڴ棬�ֽ�Ϊ��λ��
 jvm ��ͼʹ������ڴ� maxMemory()
 jvm �ڴ����� totalMemory()
 */

public class Demo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
		//Process process=runtime.exec("C:\\Windows\\notepad.exe");
		//Thread.sleep(1000);
		//process.destroy();
		
		System.out.println("jvm �����ڴ� "+runtime.freeMemory());
		System.out.println("jvm ��ͼʹ������ڴ� "+runtime.maxMemory());
		System.out.println("jvm �ڴ����� "+runtime.totalMemory());
	}

}
