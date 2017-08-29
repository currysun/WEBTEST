package Day12;

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
		System.out.println(d.toString());
		Object o =new Object();
		System.out.println(o.toString());
		System.out.println(o);
		Person p =new Person("curry", 30);
		Person d1 =new Person("durant", 30);
		System.out.println(p.equals(d1));
		System.out.println("p hashcode is "+p.hashCode());
		System.out.println("p hashcode is "+d1.hashCode());
		
	}
	
}
