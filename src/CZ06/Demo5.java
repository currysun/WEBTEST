package CZ06;
/*
 需求 使用java 类描述下百合网会员
 被竞争对手恶意攻击，比如性别出现人妖。
 根本原因其他人可以直接操作sex 属性。
 
 封装：
 权限控制符：控制变量可见范围
 public 所有人都可以访问
 private 被修饰的成员变量或方法只能在本类中才能访问
 
 封装的步骤：
 		1.使用private 修饰需要被封装的属性。
 		2.提供公共的方法 设置或获取该成员变量。
 			命名规范：set属性名（）
 				   get属性名（）
 	一般开发中，实体类的属性都要封装。
 	实体类：实体类就是描述一类事物
 	工具类Arrays			   
封装的优点：
 		1.提高数据安全 
 		2.操作简单 狗娃 狗剩 教务系统
 		3.影藏了实现 狗剩调用setsex() 不用关心setsex 在student里是如何实现的

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
