package JavaBasics;

public class PrinevenInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {2,3,4,5,6,7,8,9,10,32,34,65,75,99};
     for(int i=0;i<=a.length-1;i++) {
    	 if(a[i]%2==0) {
    		 System.out.print(a[i]+" ");
    	 }
     }
	}

}
