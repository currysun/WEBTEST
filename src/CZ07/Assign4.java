package CZ07;
//写一个初始化块(其实就是构造代码块)，用于统计此类的新建次数

class CountStatic{
	public static int count=0;
	{
		count++;
		System.out.println(count);
	}

	
}

public class Assign4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CountStatic();
		new CountStatic();
		new CountStatic();
	}

}
