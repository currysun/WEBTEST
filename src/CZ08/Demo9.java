package CZ08;
/*
 * super �ؼ��ִ�����ռ������
 * 
 * super �ؼ������ã�
 * 1.�Ӹ������ͬ���ĳ�Աʱ����������Ĭ���Ƿ�������ĳ�Ա������ͨ��superָ�����ʸ���ĳ�Ա��
 * 2.�����������ʱ��Ĭ�ϻ��ȵ��ø����޲εĹ��췽��������ͨ��super�ؼ���ָ�����ø���Ĺ��췽����
 */
class fu{
	int x=10;
	String name;
	public fu(String name){
		this.name=name;
		System.out.println("Fu ����εĹ��췽��");
	}
}
class zi extends fu{
	int x=20;
	
	public zi(String name){
		super(name);
	}
	public void print(){
		System.out.print("x = "+super.x);
	}
}


public class Demo9 {
	public static void main(String[] args){
		zi zi= new zi("curry");
		zi.print();;
	}
}
