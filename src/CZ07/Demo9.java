package CZ07;
/*
 * ����:����һ��CZѧ����
 * 
*/

class CZStudent{
	String name;
	
	static String country="Amercian"; //ʹ����static ������country �������country���ǹ�������
	
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
