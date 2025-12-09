package JavaBasics;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {21,32,41,12,11,21,12,45,76,89,90,2,5,12,0,121,1222};
           int len=a.length;
           for(int i=0;i<len-1;i++) {
        	   for(int j=0;j<len-1;j++) {
        		   if(a[j]>a[j+1]) {
        			   int b=a[j];
        			   a[j]=a[j+1];
        			   a[j+1]=b;
        		   }
        	   }
        	   
           }
           System.out.println(Arrays.toString(a));
           
	}

}
