package CZ06;
/*
 * 使用java 描述一个计算器类，计算机有操作数 1 操作数2 和 运算符 3个属性。
 * 还具备运算的行为。
 * 要求不能直接 对操作数1 2 和 运算符赋值，要封装起来。
 */

class calculator{
	private double a;
	private double b;
	private String cal;
	private double result;
	
	public double Cal(){
		if(cal.equals("+")){
			result=a+b;
		}
		else if(cal.equals("-")){
			result=a-b;
		}	
		else if(cal.equals("*")){
			result=a*b;
		}		
		else if(cal.equals("/")){
			result=a/b;
		}
		else{
			System.out.println("Type wrong flag");
		}
		System.out.println(result);
		return result;
		
	}
	
	public void seta(double a1){
		a=a1;
	}

	
	public void setb(double b1){
		b=b1;
	}

	
	public void setcal(String c1){
		if(c1.equals("+")||c1.equals("-")||c1.equals("*")||c1.equals("/")){
			cal=c1;
		}
		else{
			cal="+";
		}
	}

}


public class Demo6 {
	public static void main(String[] args){
		calculator c=new calculator();
		c.seta(3);
		c.setb(5);
		c.setcal("AA");
		c.Cal();
	}
}



