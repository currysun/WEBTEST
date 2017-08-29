package CZ07;

class Emp{
	
	static int count=0;
	{
		count++;
	}
	public Emp(){
		
	}
	
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Emp();
		new Emp();
		new Emp();
		new Emp();
		new Emp();
		Emp e=new Emp();
		System.out.print(e.count);
		
	}

}
