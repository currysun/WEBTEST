package CZ09;
/*
 * ������У�ڼ䣬����ͨѧ����Ҫѧϰ���ر�ѧ��ѧϰ����Ǯ
 * ʹ�ýӿ���չ����ɴ�����
 */
class NormalStu {
	String name;
	public NormalStu(String name) {
		this.name=name;
	}
	public void Study() {
		System.out.println(name+"Normal study");
	}
}

interface EarnStu{
	public void Earn();
}


class SpecialStu extends NormalStu implements EarnStu{
	public SpecialStu(String name) {
		super(name);
	}
	@Override
	public void Earn() {
		// TODO Auto-generated method stub
		System.out.println(name+"Make money");
	}
	
} 

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalStu s1=new NormalStu("maikao");
		SpecialStu s2=new SpecialStu("curry");
		s1.Study();
		s2.Study();
		s2.Earn();
	}

}
