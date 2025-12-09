package JavaBasics;

import java.util.Scanner;

public class PrintOnlyevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your number: ");
          int num=sc.nextInt();
//Forward order          
        //  for(int i=2;i<=num;i++) {
        	     //      if(i%2==0) {
        	    	//       System.out.println(i);
        	     //    }
         // }
 //Reverse order
          for(int i=num;i>=2;i--) {
        	  if(i%2==0) {
        		  System.out.println(i);
        	  }
          }
	}

}
