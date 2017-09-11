package CZ08;

interface A{
	public void print();
}

interface B{
	public void print();
}

/*
 * 接口与接口是继承关系
 * 接口可以继承多个接口
 */
interface C extends A,B{
	public void run();
}


/*
 * 接口与类是 实现关系
 * 一个类可以实现多个接口
 */
class Demo10 implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ta=new Demo10();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
