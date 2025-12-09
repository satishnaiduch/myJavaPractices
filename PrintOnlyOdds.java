package JavaBasics;

import java.util.Scanner;

public class PrintOnlyOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Number: ");
            int num=sc.nextInt();
//forward direction            
           /* for(int i=1;i<=num;i++) {
            	if(i%2==1) {
            		System.out.println(i);
            	}
            }*/
//Reverse direction
            for(int i=num;i>=1;i--) {
            	if(i%2==1) {
            		System.out.println(i);
            	}
            }
	}

}
