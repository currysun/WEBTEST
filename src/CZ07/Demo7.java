package CZ07;
/*
 * 需求定义一个人类，人具备id,name,age 属性，还具备一个比较年龄的方法
 * 要求 必须写上构造函数，构造函数也必须要使用上this 关键字
*/
class student{
	int id;
	String name;
	
	public student(int id ,String name){
		this(name);
		this.id =id; //局部变量给成员变量赋值。
		System.out.println("two parameter method");
		
	}
	
	public student(String name){
		this.name=name;
		System.out.println("one parameter method");
	}
	
}

public class Demo7 {
	public static void main(String[] args){
		student s= new student(30, "curry");
		System.out.println("Id: "+s.id+" name: "+s.name);
		
		student s2= new student(35, "durant");
		System.out.print("Id: "+s2.id+" name: "+s2.name);
	}
}
