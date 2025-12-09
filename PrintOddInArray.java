package JavaBasics;

import java.util.Arrays;

public class PrintOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {19,3,4,15,6,7,8,9,10,32,34,65,75,99};
		 Arrays.sort(a);
		 for(int i=0;i<=a.length-1;i++) {
			 if(a[i]%2==1) {
				 System.out.print(a[i]+" ");
			 }
		 }
		 
		 
	}

}
