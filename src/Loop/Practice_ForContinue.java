package Loop;

public class Practice_ForContinue {

	public static void main(String[] args) {
		int a = 0, sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {

				continue;
			}
			sum += i;
			if (i != 10) {
				System.out.print(sum + "+");
			} else {
				System.out.print(sum);
			}
		}
		System.out.println("= " + sum);
	}

}
