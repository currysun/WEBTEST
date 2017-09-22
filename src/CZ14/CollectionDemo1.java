package CZ14;
/*
 * 数组：存储同一种数据类型的数据
 * 
 * 数组的特点：
 * 		1.只能存储同一种数据类型的数据。
 * 		2.一旦初始化，长度固定。
 * 		3.数组的元素与元素之间的内存地址是连续的。
 * 
 * 注意：Object 类型的数组可以存储任意类型的数据
 * 
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		//arr[0]="abc";
		arr[0]=12;
		
		Object[] brr=new Object[10];
		brr[0]="abc";
		brr[1]=123;

	}

}
