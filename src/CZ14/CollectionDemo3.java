package CZ14;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 判断
 * isEmpty
 * contains(Object o)
 * containsAll(Collection<?> c)
 * 
 */
class person{
	String name;
	int age;
	
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return ("name= "+this.name+" age= "+this.age);
	}
	
	public boolean equals(Object obj) {
		person person=(person)obj;
		return this.age==person.age;
	}
}

class Dog{}

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection=new ArrayList();
		collection.add(new person("curry", 30));
		collection.add(new person("thompson", 27));
		System.out.println(collection.isEmpty());
		System.out.println("存在该元素吗？"+collection.contains(new person("curry", 30)));
		System.out.println(collection);
		System.out.println("存在该元素吗？"+collection.contains(new Dog()));
		
		Collection c2=new ArrayList();
		c2.add(new person("curry", 30));
		c2.add(new person("thompson", 28));
		
		System.out.println("collection包含c2集合吗？"+collection.containsAll(c2));
		
		
		
		
	}

}
