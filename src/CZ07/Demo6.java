package CZ07;

class animal{
	String name="dog";
	String color;
	
	public void eat(){
		//String name ="rat";
		System.out.print(name+" is eating");
	}
	public animal(String name){
		this.name=name;
	}
}

public class Demo6 {
	public static void main(String[] args){
		animal a =new animal("cat");
		animal b =new animal("fish");
		System.out.println(a.name);
		System.out.println(b.name);
		a.eat();
		
	}
}
