package array;

import java.util.Arrays;

public class Practice_doubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,10,1,9};
		bubbleSort(arr);
		String a=Arrays.toString(arr);
		System.out.println(a);
	}
	
	public static void bubbleSort(int arr[]) {
		int temp;
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-j-1;i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		
	}

}
