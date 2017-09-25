package CZ14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//迭代 toArray

public class CollectionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c= new ArrayList();
		c.add("curry");
		c.add("durant");
		c.add("green");
		
		Object[] arr= c.toArray(); //把集合中所有元素全部存储到一个object的数组中返回
		System.out.println("数组元素："+Arrays.toString(arr));
		
	}

}
