package CZ08;
/*
 * 使用java描述一下普通的学生、java 基础班的学生、java就业班的学生
 * 所有的学生都会学习。但是学习内容不一样
 * 普通的学生：马克思
 * 基础班：javase
 * 就业班学生：javaee+android
 */

class StudentA{
	String name;
	public StudentA(String name) {
		this.name=name;
	}
	public void Study() {
		System.out.println("普通学生 "+name+"学马克思");
	}
}

class StudentJavaSe extends StudentA{
	public StudentJavaSe(String name) {
		super(name);
	}
	public void Study() {
		System.out.println("java基础班学生"+name+ "学se");
	}
}

class StudentJavaEe extends StudentA{         //就业班学生 是属于基础班的一种，不合理
	public StudentJavaEe(String name) {
		super(name);
	}
	public void Study() {
		System.out.println("java就业班学生 学ee");
	}
}


public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA a1=new StudentA("小明");
		StudentJavaSe a2=new StudentJavaSe("小克");
		StudentJavaEe a3=new StudentJavaEe("小类");
		a1.Study();
		a2.Study();
		a3.Study();
	}

}
