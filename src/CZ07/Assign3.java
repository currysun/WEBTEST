package CZ07;
//3.帮person类添加静态初始化块，将静态的属性附上默认值

class person1{
	public static String name;
	static {
		name="curry";
		int age=30;
	}
}
public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person1 p1=new person1();
		System.out.println(p1.name);
	}

}
