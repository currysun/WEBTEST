package CZ06;
/*匿名对象：没有变量指向的对象
      匿名对象作用：如果一个对象调用完方法后，该对象不再使用了，可以使用匿名对象。
      匿名对象应用场景：
      		1）简化了书写 且更快的释放了内存空间。
      		2）可以作为实参调用方法。
      		3） 经后使用很多，因为是种简化的编码方式。
      		*/


public class Demo4 {
	public static void main(String[] args){
		student s=new student();
		new student().name="Curry";
		s.name="Thomphson";
		System.out.println(new student().name);//匿名对象获取不到任何属性，所以一般不给匿名对象赋属性值。
		System.out.println(s.name);
		System.out.println(new student()==new student());//匿名对象因没有变量，所以其内存地址永不唯一。两个匿名对象不可能是一个对象。
	}
}


class student{
	int num;
	String name;
	
}