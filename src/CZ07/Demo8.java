package CZ07;
/*
 * 需求定义一个人类，人巨额被id,name,age 属性，还具备一个比较年龄的方法
 * 要求 必须写上构造函数，构造函数也必须要使用上this 关键字
*/
class human{
	int id;
	String name;
	int age;
	
	public void compareAge(human a){
		if(a.age>this.age){
			System.out.print(a.name+" older");
		}
		else if (a.age<this.age){
			System.out.print(a.name+" younger");
		}
		else{
			System.out.print("same age");
		}
		
	}
	
	public human(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Demo8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h1=new human(30, "curry", 29);
		human h2=new human(35, "durant", 30);
		h2.compareAge(h1);
		
	}

}
