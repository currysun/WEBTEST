package CZ14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.beust.jcommander.Strings;

/*
 * ʹ�ü���ʵ��ע���¼����
 * ��һ������ʾ�û�ѡ����; A(ע��) B(��¼)��Ҫ�� ����ѡ��ʱ����Դ�Сд
 * 
 * ע�᣺1��ʾ�û�����ע���˺ţ����֣������룬��������id ���Ѿ����ڼ����У���ʾ�û��������롣ע�����֮�󣬰Ѽ����е������û���Ϣ��ӡ������toArray��
 * ��¼����ʾ�û������¼id�����룬����˺�����������û��Ѿ����ڼ����У���ô��½�ɹ��������½ʧ�ܡ�
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
			System.out.println("��½�ɹ�");
		}
		else {
			System.out.println("��ʧ��");
		}
		
	}
	
	public static void signUp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������ע���˺�");
		sc.next();
		System.out.println("������ע������");
		sc.next();
		//Collection c=
	}

	
}
