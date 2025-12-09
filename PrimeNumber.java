package JavaBasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Number: ");
         int num=sc.nextInt();
         int count=0;
         if(num>0) {
        	  for(int i=1;i<=num;i++) {
        	        if(num%i==0) {
        	        	count++;
        	        }
        	  }
        	  if(count==2) {
        		  System.out.println(num +" Prime Number");
        	  }else {
        		  System.out.println(num+" Not a Prime Number");
        	  }
        	  
         }
         else {
        	 System.out.println("NOT A PRIME NUMBER because its 0");
         }
	}

}
