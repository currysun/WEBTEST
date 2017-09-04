package CZ09;


class Pencil{
	String name;
	
	public void Write() {
		System.out.println(name+"É³É³µÄÐ´");
	}
	
	public Pencil(String name) {
		this.name=name;
	}
	
}

interface Erase{
	public void Modify();
}


class PencilWithEraser extends Pencil implements Erase {

	@Override
	public void Modify() {
		// TODO Auto-generated method stub
		System.out.println(name+"Í¿¸ÄÍ¿¸Ä");
	}
	public PencilWithEraser(String name) {
		super(name);
	}
	
	
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PencilWithEraser p1=new PencilWithEraser("2H");
		p1.Write();
		p1.Modify();
	}

}
