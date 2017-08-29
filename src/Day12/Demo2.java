package Day12;

public class Demo2 {
	public static void main(String[] args){
		String str1 ="hello";
		String str2 ="hello";
		String str3 =new String("hello");
		String str4 =new String("hello");

		System.out.println("str1==str2?"+(str1==str2));
		System.out.println("str2==str3?"+(str2==str3));
		System.out.println("str3==str4?"+(str3==str4));
		System.out.println("str3.equals?str4"+(str3.equals(str4)));
		
		String str5=new String();
	
		byte[] b={97,98,99,100};
		String str6=new String(b);
		System.out.println(new String(b,1,2));
	}
	
	
}
