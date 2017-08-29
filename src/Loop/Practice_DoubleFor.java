package Loop;

public class Practice_DoubleFor {

	public static void main(String[] args) {
		//³Ë·¨±í
		/* for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\0");
			}
			System.out.println("");
		} */
		
		char a='A';
		for(int i=1;i<=5;i++){
			System.out.println(a);
			for(int j=1;j<i;j++){
				a++;
				System.out.print(a);	
			}
			
			
		
		}
	}

}
