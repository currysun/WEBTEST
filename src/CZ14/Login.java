package CZ14;

import java.util.ArrayList;
import java.util.Arrays;
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
		System.out.println("����ҳ��");
		System.out.println("��ѡ��ע�� ���ǵ�½��ע��ѡA ��½ѡB");
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
		System.out.println("�������û�����");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("���������룺");
		String password=sc.next();
		Collection c=new ArrayList();
		c.add(new Account(id, password));
		if(c2.containsAll(c)) {
			System.out.println("��½�ɹ�");
		}
		else {
			System.out.println("��½ʧ��");
		}
		
	}
	
	public static void signUp(Collection c2) {
		boolean flag=true;
		System.out.println("��ӭ����ע��ҳ��");
		while(flag) {
			Scanner sc=new Scanner(System.in);
			System.out.println("������ע���˺�");
			int id=sc.nextInt();
			Collection cid=new ArrayList();
			cid.add(new Account(id));
			System.out.println("������ע������");
			String password=sc.next();
			System.out.println("testset "+cid.contains(c2));
			if(!c2.containsAll(cid)) {
				c2.addAll(cid);
				flag=false;
			}
			else {
				System.out.println("id �Ѿ����ڣ�������ע��");
			}
		}
		System.out.println("ע��ɹ�");
		Object[] arr= c2.toArray(); //�Ѽ���������Ԫ��ȫ���洢��һ��object�������з���
		System.out.println("�����û�id"+Arrays.toString(arr));
	}

	public static void initalize(Collection c2) {
		c2.add(new Account(123456,"password"));
		c2.add(new Account(123457,"password1"));
		c2.add(new Account(923456,"password2"));
	} 

	
}
