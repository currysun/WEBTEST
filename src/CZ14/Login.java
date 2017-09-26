package CZ14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import com.beust.jcommander.Strings;

/*
 * 使用集合实现注册登录功能
 * 第一步：提示用户选择功能; A(注册) B(登录)。要求 功能选择时候忽略大小写
 * 
 * 注册：1提示用户输入注册账号（数字）与密码，如果输入的id 号已经存在集合中，提示用户重新输入。注册完毕之后，把集合中的所有用户信息打印出来（toArray）
 * 登录：提示用户输入登录id与密码，如果账号与密码这个用户已经存在集合中，那么登陆成功，否则登陆失败。
 * 
 */

class Account{
	int id;
	String password;
	
	public Account(int id ) {
		this.id=id;
	}
	
	public Account(int id,String password) {
		this.id=id;
		this.password=password;
	}
	public String toString() {
		return ("id :"+this.id+","+this.password);
	}
	
	public boolean equals(Object obj) {
		Account a=(Account)obj;
		return (this.id==a.id);
	}
}

public class Login {
	 public static void main(String[] args) {
		Collection c2=new ArrayList();
		initalize(c2);
		System.out.println("官网页面");
		System.out.println("请选择注册 还是登陆，注册选A 登陆选B");
		Scanner sc=new Scanner(System.in);
		String text=sc.next();
			if(text.equalsIgnoreCase("A")) {
				signUp(c2);
				logIn(c2);
			}
			else if(text.equalsIgnoreCase("B")){
				logIn(c2);
			}
	
	 }
	 
	
	 
	public static void logIn(Collection c2) {
		System.out.println("请输入用户名：");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("请输入密码：");
		String password=sc.next();
		Collection c=new ArrayList();
		c.add(new Account(id, password));
		if(c2.containsAll(c)) {
			System.out.println("登陆成功");
		}
		else {
			System.out.println("登陆失败");
		}
		
	}
	
	public static void signUp(Collection c2) {
		boolean flag=true;
		System.out.println("欢迎进入注册页面");
		while(flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入注册账号");
			int id=sc.nextInt();
			Collection cid=new ArrayList();
			cid.add(new Account(id));
			System.out.println("请输入注册密码");
			String password=sc.next();
			System.out.println("testset "+cid.contains(c2));
			if(!c2.containsAll(cid)) {
				c2.addAll(cid);
				flag=false;
			}
			else {
				System.out.println("id 已经存在，请重新注册");
			}
		}
		System.out.println("注册成功");
		Object[] arr= c2.toArray(); //把集合中所有元素全部存储到一个object的数组中返回
		System.out.println("所有用户id"+Arrays.toString(arr));
	}

	public static void initalize(Collection c2) {
		c2.add(new Account(123456,"password"));
		c2.add(new Account(123457,"password1"));
		c2.add(new Account(923456,"password2"));
	} 

	
}
