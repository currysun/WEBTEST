package CZ08;
/*
 * ��̬��Ӧ��:
 * 			1.��̬Ӧ�����β�ʱ�򣬿��Խ��ܸ������͵�����
 * 			2.��̬Ӧ���ڷ�������ʱ�򣬿��Է��ظ������͵�����
 * 
 * 
 * ����1������һ���������Խ�������ͼ�ζ��󣬲��Ҵ�ӡͼ��������ܳ�
 * ����2������һ���������Է�������ͼ�ζ��󣬲��Ҵ�ӡͼ��������ܳ�
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
		System.out.println("���ε����"+l*w);
	}
	@Override
	public void getLength() {
		// TODO Auto-generated method stub
		System.out.println("���εĳ���"+2*(l+w));
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
