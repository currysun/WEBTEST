package CZ13;

import java.io.IOException;

/*
 
 RunType  该类代表应用程序的运行环境
 一个应用程序只有一个运行环境
 getRuntime()
 freeMemory()返回jvm空闲内存，字节为单位。
 jvm 试图使用最大内存 maxMemory()
 jvm 内存总量 totalMemory()
 */

public class Demo3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Runtime runtime=Runtime.getRuntime();
		//Process process=runtime.exec("C:\\Windows\\notepad.exe");
		//Thread.sleep(1000);
		//process.destroy();
		
		System.out.println("jvm 空闲内存 "+runtime.freeMemory());
		System.out.println("jvm 试图使用最大内存 "+runtime.maxMemory());
		System.out.println("jvm 内存总量 "+runtime.totalMemory());
	}

}
