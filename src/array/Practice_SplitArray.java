package array;

public class Practice_SplitArray {

	public static void main(String[] args) {
		String str = "I,love,Dannie";// ¶¨Òå×Ö·û´®
		String[] array = new String[10];
		array = str.split(",");
		for (String a : array) {
			System.out.println(a + " ");
		}

	}

}
