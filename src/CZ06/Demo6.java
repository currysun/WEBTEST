package CZ06;
/*
 * ʹ��java ����һ���������࣬������в����� 1 ������2 �� ����� 3�����ԡ�
 * ���߱��������Ϊ��
 * Ҫ����ֱ�� �Բ�����1 2 �� �������ֵ��Ҫ��װ������
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



