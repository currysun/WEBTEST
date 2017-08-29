package CZ06;
/*需求： 使用java描述一个车与修车厂两个事物， 车具备的公共属性:轮子数、 名字、 颜色 ，还
具备跑的功能行为。跑之前要检测轮子是否少于了4个，如果少于了4个，那么要送到修车厂修理，
修车厂修理之后，车的轮子数要补回来4个。 然后车就继续的跑起来。

修车厂： 具备公共属性： 名字、 地址、 电话。
		 公共的行为： 修车。
*/
class car1{
	int wheel;
	String name;
	String color;
	void Run(){
		if(wheel==4){
			System.out.println("Car "+name+" can Run");
		}
		else{
			System.out.println("Car is cruash "+wheel+" wheel only");
			System.out.println("go back to factory");
		}
		
	}
	
}
class factory{
	String name;
	String address;
	int tel;
	public void repair(car1 c){
		if(c.wheel!=4){
			c.wheel=4;
			System.out.println("Car is cruash ");
			System.out.println("Car is repaired and wheel is "+c.wheel+"\n Give Money");
		}
		//return c;
	}
}

public class Demo2 {
	public static void main(String[] args){
		car1 c1=new car1();
		factory f=new factory();
		c1.wheel=3;
		c1.name="BMW";
		c1.Run();
		f.repair(c1);
		c1.Run();
		
		
	}
}