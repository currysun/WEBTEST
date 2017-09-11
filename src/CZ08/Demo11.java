package CZ08;
/*
 * 多态：对象具备多种形态
 * 多态：父类的引用变量指向子类的对象 或者 接口的引用变量指向实现类的对象
 */

abstract class Animal{
	String name;
	
	String color="动物色";
	public Animal(String name){
		this.name=name;
	}
	public abstract void run();
}

class Mouse extends Animal{
	String color="黑色";
	public Mouse(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"四条腿慢慢跑");
	}
	public void dig(){
		System.out.println(name+" 正在打洞");
	}
}

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Mouse("老鼠");
		System.out.println(a.color);//多态情况下：子父类存在同名成员，多态下取得是父类的成员，但是非静态函数取得是子类成员。
		a.run();
		//a.dig(); 多态一大弊端：多态情况下不能访问子类独有的方法。
 	}

}
