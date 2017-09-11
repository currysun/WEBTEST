package CZ08;
/*
 * 多态的应用:
 * 			1.多态应用于形参时候，可以接受更多类型的数据
 * 			2.多态应用于返回类型时候，可以返回更多类型的数据
 * 
 * 
 * 需求1：定义一个函数可以接收任意图形对象，并且打印图形面积和周长
 * 需求2：定义一个函数可以返回任意图形对象，并且打印图形面积和周长
 */

abstract class Shape{
	public abstract void getArea();
	public abstract void getLength();
}

class Circle extends Shape{
	public static final double PI=3.14;
	double r;
	public Circle(double r){
		this.r=r;
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println(r*r*PI);
	}

	@Override
	public void getLength() {
		// TODO Auto-generated method stub
		System.out.println(2*r*PI);
	}
}
class Square extends Shape{
	int l;
	int w;
	public Square(int l,int w){
		this.l=l;
		this.w=w;
	}
	@Override
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("矩形的面积"+l*w);
	}
	@Override
	public void getLength() {
		// TODO Auto-generated method stub
		System.out.println("矩形的长度"+2*(l+w));
	}
}

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Circle c=new Circle(5);
		//print(c);
		//Square s=new Square(4,9);
		//print(s);
		Shape m=getShape(1);
		m.getArea();
		
		
	}
	public static void print(Shape s){
			s.getArea();
			s.getLength();
		}
		
	public static Shape getShape(int i){
		if(i==0){
			return new Circle(4);
		}
		else{
			return new Square(6,9);
		}
	}
}
