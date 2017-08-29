package Day12;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="   Apple  curry   ";
		String p="V:\\Grant Sun\\Training\\CZ\\day12\\day12\\src\\cn\\itcsat\\string\\Demo6.java";
		String d="durant";
		String str="abcjavaabcjavaphpjava";
		String info=s.trim();
		System.out.println(info);
		System.out.println(TestTrim(s));
		//System.out.println(p.split("\\"));
		getFileName(p);
		//reverse(d);
		System.out.print(d);
		getCount("java",str);
		
	}
	
	public static String TestTrim(String a){
		char[] arr =a.toCharArray();
		int startIndex=0;
		int endIndex=arr.length-1;
		while(true){
			if(arr[startIndex]==' ')
			{
				startIndex++;
			}
			else{
				break;
			}
		}
		while(true){
			if(arr[endIndex]==' ')
			{
				endIndex--;
			}
			else{
				break;
			}
		}
		return a.substring(startIndex, endIndex+1);
		
	}
	public static String reverse(String a){
		char[] c=a.toCharArray();
		for(int startIndex=0,endIndex=c.length-1;startIndex!=endIndex;startIndex++,endIndex--){
			if(c[startIndex]!=c[endIndex]){
			char temp;
			temp=c[startIndex];
			c[startIndex]=c[endIndex];
			c[endIndex]=temp;
			}
			else if(startIndex>endIndex){
				break;
			}
			
		}
		a=String.valueOf(c);
		return a;
	}
	public static void getFileName(String path){
		int index =path.lastIndexOf("\\");
		String fileName =path.substring(index+1);
		System.out.println("ÎÄ¼þÃû "+fileName);	

	}
	
	public static int getCount(String target,String str){
		int count=0;
		int fromIndex=0;
		while(str.indexOf(target, fromIndex)!=-1){
			count++;
			fromIndex=str.indexOf(target, fromIndex)+target.length();
		}
		System.out.println("java count is "+count);
		return count;	

	}

}
