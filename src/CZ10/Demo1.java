package CZ10;


//�����̬�ı׶ˣ�ǿ������ת��
abstract class Animal{
	String name;
	
	String color="����ɫ";
	public Animal(String name){
		this.name=name;
	}
	public abstract void run();
}

class Mouse extends Animal{
	String color="��ɫ";
	public Mouse(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"������������");
	}
	public void dig(){
		System.out.println(name+" ���ڴ�");
	}
}
class Fish extends Animal{

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void bubble() {
		// TODO Auto-generated method stub
		System.out.print("ð����");
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		long j;
		j=i;
		System.out.println("������ J ="+j);
		j=20000;
		i=(int)j;
		System.out.println("С���� i  ="+i);
		
		Animal a=new Mouse("Jimmy");
		Mouse b=(Mouse)a;
		//b.dig();
		Mouse m=new Mouse("curry");
		getAnyAnimal(m);
	}
	
	public static void getAnyAnimal(Animal a){
		if(a instanceof Mouse){
			Mouse b=(Mouse)a;
			b.dig();
		}else{
			Fish f=(Fish)a;
			f.bubble();
		}
		
		
	}

}
