package CZ13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date);
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat d1=new SimpleDateFormat("yyyy-MM-dd");
		String time=d1.format(date);
		System.out.println(time);
		String red="31/08/2017 18:20";
		String aString=red.substring(0, 16);
		System.out.println(aString);
		
	}

}
