package CZ07;
//1.使用this关键字为person类的属性赋值

class Person{
	String name;
	int age;
	
	public Person() {
		this.name="Curry";
	}
}

public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		System.out.println(p1.name);
		String code="8";
		int i=Integer.parseInt(code)+1;
		System.out.println(i);
	}

}
