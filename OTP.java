package JavaBasics;

import java.util.Random;

public class OTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Random rand=new Random();
     String otp="";
     for(int i=0;i<=3;i++) {
    	 otp=otp+rand.nextInt(10);
     }
     System.out.println("Your OTP: "+otp);
	}

}
