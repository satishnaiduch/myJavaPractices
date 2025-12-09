package JavaBasics;

import java.util.Scanner;

public class CountEvenOddinNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter your number: ");
              int num=sc.nextInt();
              int even=0, odd=0;
              while(num>0) {
            	      int rem=num%10;
            	  if(rem%2==0) {
            		  even++;
            	  }else {
            		  odd++;
            	  }
            	  num=num/10;
              }
              System.out.println("even count: "+even);
              System.out.println("odd count: "+odd);
	}

}
