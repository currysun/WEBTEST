package CZ09;

import org.hamcrest.core.IsInstanceOf;

/*
 * 需求1： 定义一个函数可以接受任意图形，目前假设有圆形和方形 2种图形。
 * 需求2： 定义一个函数可以返回任意图形，目前假设有圆形和方形 2种图形。
 * 需求3： 定义一函数解决多态的弊端 （多态情况下不能调用子类特有的成员），访问一下子类特有的函数
 */

class Shape{
	public void getArea() {};
	public void getLength() {};
}

class Circle extends Shape{
	static double pai=3.1479;
	int r;
	public Circle(int r) {
		this.r=r;
	}
	
	public void getArea() {
		System.out.println("Circle's area = "+(pai*r*r));
	}
	public void getLength() {
		System.out.println("Circle's length = "+(pai*r*2));
	}
	public void getD() {
		System.out.println("Circle's 直径 = "+(r*2));
	}
}

class Square extends Shape{
	int length;
	int weight;
	public Square(int length,int weight ) {
		this.length=length;
		this.weight=weight;
	}
	
	public void getArea() {
		System.out.println("square area = "+(length*weight));
	}
	public void getLength() {
		System.out.println("square length = "+(2*weight*length));
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq=new Square(5, 3);
		Circle c =new Circle(4);
		getAnyShape(sq);
		getAnyShape(c);
		Shape circle =returnAnyShape(0);
		Shape square =returnAnyShape(2);
		circle.getArea();
		circle.getLength();
		getSpecial(new Circle(6));
		
	}
	
	public static void getAnyShape(Shape s) {
		s.getArea();
		s.getLength();
		
	}
	
	public static Shape returnAnyShape(int i) {
		if(i==0) {
			System.out.println("圆形");
			return new Circle(5);
		}
		else {
			System.out.println("方形");
			return new Square(4, 3);
		}
		
	}
	public static void getSpecial(Shape s) {
		if(s instanceof Circle) {
			Circle z=(Circle)s;
			z.getD();
		}
		
		
	}

}
