package JavaBasics;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter your string: ");
	       String str=sc.next(),rev="",org_str=str;
	       for(int i=str.length()-1;i>=0;i--) {
	    	   rev=rev+str.charAt(i);
	    	  
	       }
	       if(org_str.equals(rev)) {
    		   System.out.println(org_str +" Palindrome");
    	   }else {
    		   System.out.println(org_str+" Not a palindrome");
    	   }
	      // System.out.println(rev);
	}

}
