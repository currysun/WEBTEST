package CZ08;

class Fu{
	String name;
	public Fu(String name) {
		this.name=name;
	}
	int x=10;
}

class Zi extends Fu{
	int x=20;
	public Zi(String name) {
		super(name);//子类的代参构造方法调用父类中相对应的代参构造方法，使用super()，括号中应对应父类构造方法的形参。
	}
	public void print() {
		System.out.println("x1 = "+x);
		System.out.println("x2 = "+super.x);
		System.out.println("Fu's name = "+name);
	}
}

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Zi z=new Zi("curry");
			z.print();
			
	}

}
