package JavaBasics;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num=1040567;
         int count=0;
         while(num>0) {
        	 num=num/10;
        	 count++;
         }
         System.out.println("count:"+count);
	}

}
