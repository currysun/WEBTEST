package CZ08;
/*
 * super 关键字代表父类空间的引用
 * 
 * super 关键字作用：
 * 1.子父类存在同名的成员时，在子类中默认是访问子类的成员，可以通过super指定访问父类的成员。
 * 2.创建子类对象时，默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法。
 */
class fu{
	int x=10;
	String name;
	public fu(String name){
		this.name=name;
		System.out.println("Fu 类带参的构造方法");
	}
}
class zi extends fu{
	int x=20;
	
	public zi(String name){
		super(name);
	}
	public void print(){
		System.out.print("x = "+super.x);
	}
}


public class Demo9 {
	public static void main(String[] args){
		zi zi= new zi("curry");
		zi.print();;
	}
}
