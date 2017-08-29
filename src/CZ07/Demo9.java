package CZ07;
/*
 * 需求:描述一个CZ学生类
 * 
*/

class CZStudent{
	String name;
	
	static String country="Amercian"; //使用了static 修饰了country ，那这个country就是共享数据
	
	public CZStudent(String name,String country){
		this.name=name;

	}
}

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CZStudent s1=new CZStudent("curry", "American");
		CZStudent s2=new CZStudent("durant", "American");
		s1.country="China";
		System.out.println("name: "+s1.name+" nation: "+s1.country);
		System.out.println("name: "+s2.name+" nation: "+s2.country);
	}

}
