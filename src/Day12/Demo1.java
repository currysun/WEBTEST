package Day12;
/*
 * Object 类
 * 
 * Object类常用的方法:
 * 		toString();    返回该对象的字符串表示
 * 疑问：toString() 有何作用?
 * 重写toString 方法后，我们直接输出一个对象时，就会输出符合我们所需求的格式数据。
 * 
 * 		
 * 
 */
import bsh.commands.dir;

class Person{
	String name;
	int age;
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "name= "+this.name+" age= "+this.age;
	}
	public boolean equals(Object o){
		 Person p=(Person)o;
		return this.age==p.age;
		
	}
	public int hashCode(){
		return this.age;
		
	}
}



public class Demo1 {
	
	public static void main(String[] args){
		Demo1 d =new Demo1();
		System.out.println(d.toString()); //java.lang.Object@18b3364 返回字符串表示：完整类名+@对象哈希码
		Object o =new Object();
		//思考以下2句打印结果为何一致？
		System.out.println(o.toString());
		System.out.println(o);
		//重写 Object.toString后输出重写后的toString()方法。
		Person p =new Person("curry", 30);
		Person d1 =new Person("durant", 30);
		System.out.println(p.toString());
		System.out.println(p.equals(d1));
		System.out.println("p hashcode is "+p.hashCode());
		System.out.println("p hashcode is "+d1.hashCode());
		
	}
	
}
