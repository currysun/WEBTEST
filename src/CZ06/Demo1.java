package CZ06;

class Car{
	int wheel;
	String name;
	String color;
	
	void run(){
		System.out.print("run");
	}
	
}
	

public class Demo1 {

	public static void main(String[] args) {
		// 使用Car类 声明了一个c1 变量，c1变量指向了一个车对象。
		Car c=new Car();
		c.name="BMW";
		c.color="red";
		c.wheel=4;
		Car c1=new Car();
		c1.name="Skoda";
		c1.color="blue";
		c1.wheel=4;
		c=c1;
		System.out.print("car name :"+c.name+"  color : "+c.color+" wheel : "+c.wheel);
	}

}
