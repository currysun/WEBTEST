package interview;

public class CountN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count();
		Sum();
	}
	public static void Count() {
		String abc="what you to know one thing";
		int count=0;
		char[] arryChar=abc.toCharArray();
		for(int i=0;i<arryChar.length;i++) {
			if(arryChar[i]=='n') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void Sum() {
		int x=13;
		int y=23;
		int sum=0;
		boolean flag=true;
		while(flag) {
			sum+=(x-y);
			x+=20;
			y+=20;
			if(x==993) {
				flag=false;
			}
		}
		System.out.println(sum);
	}

}
