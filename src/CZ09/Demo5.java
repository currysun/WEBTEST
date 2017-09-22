package CZ09;
/*
 * 多态：父类的引用类型变量指向子类的对象  或者 接口类型的引用类型变量 指向接口实现类的对象
 * 接口类型 变量 =new 接口实现类
 * 
 */

class UserDao implements Dao{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("添加员工成功");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("删除员工成功");
	}
	
} 

interface Dao{
	public void add();
	public void delete();
}

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao a=new UserDao(); //接口引用类型 的变量 指向了 接口实现类的对象
		a.add();
		a.delete();
	}

}
