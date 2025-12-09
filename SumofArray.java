package JavaBasics;

public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a[]= {4,3,5,6};
           int sum=0;
           int len=a.length;
            System.out.println(len);
           for(int i=0;i<=len-1;i++) {
        	   sum=sum+a[i];
           }
           System.out.println(sum);
	}

}
