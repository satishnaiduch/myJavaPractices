package JavaBasics;

public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="Welcome To Infosys";
           int upper=0;
           int lower=0;
           for(int i=0;i<str.length();i++) {
        	   char ch=str.charAt(i);
        	   if(ch>=65 && ch<=90) {
        		   upper++;
        	   }else if(ch>=97 && ch<=122) {
        		   lower++;
        	   }
           }
           System.out.println("No.of Upper: "+upper);
           System.out.println("No.of Lower: "+lower);
	}

}
