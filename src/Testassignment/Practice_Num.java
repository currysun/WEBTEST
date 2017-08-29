package Testassignment;

import java.util.Scanner;

public class Practice_Num {
	
	public static void main(String[] args){
		int x,y,z,max,min,t;
	     Scanner abc=new Scanner(System.in);
         x=abc.nextInt();
         y=abc.nextInt();
         z=abc.nextInt();
         if(x>y){
	         max=x; 
	         t=y;	 
         }
         else{
		        max=y;
		        t=x;	 
	         }
	         if(max<z){
	        	max=z;	         	 
	         }
	         else if(z<t){
	        	min=z; 
	         }
				min=t;	
	System.out.println("三个数的最大值是：" + max + ",最小值是：" + min);
	}
        
             
	
}
