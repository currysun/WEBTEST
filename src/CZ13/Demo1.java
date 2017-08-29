package CZ13;

import org.apache.http.conn.BasicEofSensorWatcher;

public class Demo1 {
	public static void main(String[] args){
		StringBuffer sb =new StringBuffer();
		sb.append("abcjavaabcjava123241");
		//sb.append(true);
		//sb.append(3.14f);;
		//sb.insert(3, "Curry");
		//sb.delete(3, 6);
		int index=sb.indexOf("abc",0);
		int count=sb.capacity();
		System.out.println("String buffer content : "+sb);
		System.out.println("Index is  "+index);
		System.out.println("count is  "+count+sb.charAt(4));
	}
}
