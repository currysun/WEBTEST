package CZ06;
/*
 ���� ʹ��java �������°ٺ�����Ա
 ���������ֶ��⹥���������Ա����������
 ����ԭ�������˿���ֱ�Ӳ���sex ���ԡ�
 
 ��װ��
 Ȩ�޿��Ʒ������Ʊ����ɼ���Χ
 public �����˶����Է���
 private �����εĳ�Ա�����򷽷�ֻ���ڱ����в��ܷ���
 
 ��װ�Ĳ��裺
 		1.ʹ��private ������Ҫ����װ�����ԡ�
 		2.�ṩ�����ķ��� ���û��ȡ�ó�Ա������
 			�����淶��set����������
 				   get����������
 	һ�㿪���У�ʵ��������Զ�Ҫ��װ��
 	ʵ���ࣺʵ�����������һ������
 	������Arrays			   
��װ���ŵ㣺
 		1.������ݰ�ȫ 
 		2.������ ���� ��ʣ ����ϵͳ
 		3.Ӱ����ʵ�� ��ʣ����setsex() ���ù���setsex ��student�������ʵ�ֵ�

 */

class Member{
	String name;
	private String sex;
	int    salary;
	
	
	public void setsex(String s){
		if(s.equals("male")||s.equals("female")){
			sex=s;
		}
		else{
			sex="male";
		}
	}
	public String getsex(){
		return sex;
	}
	
}

public class Demo5 {
	public static void main (String[] args){
	Member m=new Member();
	m.name="curry";
	m.setsex("female");
	m.getsex();
	m.salary=100;
	
	
	System.out.print("Name :"+m.name+" sex :"+m.getsex()+" salary :"+m.salary);
	}
}
