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
		super(name);//����Ĵ��ι��췽�����ø��������Ӧ�Ĵ��ι��췽����ʹ��super()��������Ӧ��Ӧ���๹�췽�����βΡ�
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
