package CZ07;
/*饿汉单例设计模式
 * 1.私有化构造函数
 * 2.声明本类的引用类型变量，并指向本类对象
 * 3.提供一个公共静态方法获取本类对象
 */

class SignleTest{
	private static SignleTest s1=new SignleTest();
	
	private SignleTest() {
		
	}
	
	public static SignleTest getSingle() {
		return s1;
	}
}
public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignleTest s1=SignleTest.getSingle();
		System.out.println(s1);
	}

}
