package CZ07;
/*

 * */
public class Demo5 {
	int i =100;
	{
		i=300;
	}
	public Demo5(){
		i=200;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo5 demo5=new Demo5();
		System.out.println("i = "+demo5.i);
	}

}
