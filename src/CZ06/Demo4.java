package CZ06;
/*��������û�б���ָ��Ķ���
      �����������ã����һ����������귽���󣬸ö�����ʹ���ˣ�����ʹ����������
      ��������Ӧ�ó�����
      		1��������д �Ҹ�����ͷ����ڴ�ռ䡣
      		2��������Ϊʵ�ε��÷�����
      		3�� ����ʹ�úܶ࣬��Ϊ���ּ򻯵ı��뷽ʽ��
      		*/


public class Demo4 {
	public static void main(String[] args){
		student s=new student();
		new student().name="Curry";
		s.name="Thomphson";
		System.out.println(new student().name);//���������ȡ�����κ����ԣ�����һ�㲻��������������ֵ��
		System.out.println(s.name);
		System.out.println(new student()==new student());//����������û�б������������ڴ��ַ����Ψһ�������������󲻿�����һ������
	}
}


class student{
	int num;
	String name;
	
}