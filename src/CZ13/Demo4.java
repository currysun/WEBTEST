package CZ13;

import java.util.Calendar;
import java.util.Date;

/*
 * Date ��
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.getYear());
		//Calendar calendar=new Calendar();
		Calendar calendar=Calendar.getInstance();
		int month=calendar.get(Calendar.MONTH)+1;
		System.out.println("�� "+calendar.get(Calendar.YEAR));
		System.out.println("�� "+month);
	}

}
