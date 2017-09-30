package interview;

public class FeiFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="Iphone 8";
		String a=reverse(text);
		System.out.println(a);
	}
	
	public static String reverse(String text) {
		char[] arrayChar=text.toCharArray();
		for(int startIndex=0,endIndex=arrayChar.length-1;startIndex<endIndex;startIndex++,endIndex--) {
			char temp;
			temp=arrayChar[startIndex];
			arrayChar[startIndex]=arrayChar[endIndex];
			arrayChar[endIndex]=temp;
		}
		return new String(arrayChar);
	}
	
}
