package CZ07;
/*
 * ������һ�����࣬�˾޶id,name,age ���ԣ����߱�һ���Ƚ�����ķ���
 * Ҫ�� ����д�Ϲ��캯�������캯��Ҳ����Ҫʹ����this �ؼ���
*/
class human{
	int id;
	String name;
	int age;
	
	public void compareAge(human a){
		if(a.age>this.age){
			System.out.print(a.name+" older");
		}
		else if (a.age<this.age){
			System.out.print(a.name+" younger");
		}
		else{
			System.out.print("same age");
		}
		
	}
	
	public human(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Demo8 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		human h1=new human(30, "curry", 29);
		human h2=new human(35, "durant", 30);
		h2.compareAge(h1);
		
	}

}
