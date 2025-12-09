package JavaBasics;

import java.util.Scanner;

public class PlindromeNumber {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
          System.out.println("Enter your number: ");
          int num=sc.nextInt();
          int rev=0,org_num=num;
          while(num>0) {
        	  rev=rev*10+num%10;
        	  num=num/10;
       }
          if(org_num==rev) {
        	  System.out.println(org_num+" Palindrome");
          }else {
        	  System.out.println(org_num+" Not a Palindrome");
          }
	}
}
