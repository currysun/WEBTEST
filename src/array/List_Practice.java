package array;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class List_Practice {

	 
	 
	    public static void main(String[] args) {
	        /**
	         * ��Ŀ��Ŀ¼��װ�� File ����
	         */
	        File dir = new File("C:/Documents/DSExport/Submission/FED/0001/20160630");
	 
	        /**
	         * ��ȡĿ¼�µ������ļ����ļ���
	         */
	        String[] names = dir.list();
	 
	        for (String name : names) {
	            System.out.println(name);
	        }
	    }
	 


}


