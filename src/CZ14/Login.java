package CZ14;

import java.util.ArrayList;
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
	public Account(int id,String password) {
		this.id=id;
		this.password=password;
	}
}

public class Login {
	 public static void main(String[] args) {
		 signUp();
	
	 }
	 
	public void logIn(int id,String password) {
		Collection c=new ArrayList();
		c.add(new Account(id, password));
		Collection c2=new ArrayList();
		c2.add(new Account(123456,"password"));
		c2.add(new Account(123457,"password1"));
		c2.add(new Account(923456,"password2"));
		if(c.containsAll(c2)) {
			System.out.println("登陆成功");
		}
		else {
			System.out.println("登失败");
		}
		
	}
	
	public static void signUp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入注册账号");
		sc.next();
		System.out.println("请输入注册密码");
		sc.next();
		//Collection c=
	}

	
}
