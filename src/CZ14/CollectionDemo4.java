package CZ14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//���� toArray

public class CollectionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c= new ArrayList();
		c.add("curry");
		c.add("durant");
		c.add("green");
		
		Object[] arr= c.toArray(); //�Ѽ���������Ԫ��ȫ���洢��һ��object�������з���
		System.out.println("����Ԫ�أ�"+Arrays.toString(arr));
		
	}

}
