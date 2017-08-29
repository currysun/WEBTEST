package Loop;

public class Practice_ForBreak {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=20;i++){
			sum+=i;
			if(sum>20){
				System.out.println("when i= "+i+" sum= "+sum);
				break;
			}
			
		}

	}

}
