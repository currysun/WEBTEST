package CZ06;
/*���� ʹ��java����һ�������޳���������� ���߱��Ĺ�������:�������� ���֡� ��ɫ ����
�߱��ܵĹ�����Ϊ����֮ǰҪ��������Ƿ�������4�������������4������ôҪ�͵��޳�������
�޳�������֮�󣬳���������Ҫ������4���� Ȼ�󳵾ͼ�������������

�޳����� �߱��������ԣ� ���֡� ��ַ�� �绰��
		 ��������Ϊ�� �޳���
*/
class car1{
	int wheel;
	String name;
	String color;
	void Run(){
		if(wheel==4){
			System.out.println("Car "+name+" can Run");
		}
		else{
			System.out.println("Car is cruash "+wheel+" wheel only");
			System.out.println("go back to factory");
		}
		
	}
	
}
class factory{
	String name;
	String address;
	int tel;
	public void repair(car1 c){
		if(c.wheel!=4){
			c.wheel=4;
			System.out.println("Car is cruash ");
			System.out.println("Car is repaired and wheel is "+c.wheel+"\n Give Money");
		}
		//return c;
	}
}

public class Demo2 {
	public static void main(String[] args){
		car1 c1=new car1();
		factory f=new factory();
		c1.wheel=3;
		c1.name="BMW";
		c1.Run();
		f.repair(c1);
		c1.Run();
		
		
	}
}