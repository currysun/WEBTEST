package CZ14;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ÅÐ¶Ï
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

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection=new ArrayList();
		collection.add(new person("curry", 30));
		collection.add(new person("thompson", 27));
		System.out.println(collection.isEmpty());
		System.out.println("´æÔÚ¸ÃÔªËØÂð£¿"+collection.contains(new person("curry", 30)));
		System.out.println(collection);

		
		
		
		
	}

}
