package CZ07;
/*
*/


class Baby{
	int id;
	String name;
	
	public Baby(int i,String n){
		id=i;
		name=n;
		System.out.println("construct function is working");
	}
	
	public Baby(){
		System.out.println("construct function is working default");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baby b=new Baby(310110, "curry");
		System.out.println(b.id+" = bay id"+b.name+" = baby name");
		new Baby();
	}

}
