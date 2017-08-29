package CZDemo;

public class Demo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 16, 19, 23, 54 };
		int index=searchEle(arr, 16);
		System.out.println("index is "+index);
	}

	public static int searchEle(int[] arr, int target) {
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}

		}
		return -1;
	}

}
