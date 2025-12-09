package JavaBasics;

import java.util.Arrays;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ascending order
		    Integer a[]= {21,32,41,12,11,21,12,45,76,89,90,2,5,12,0,121,1222};
		    Arrays.sort(a);
		    System.out.println(Arrays.toString(a));
		//Descending order
		    Integer b[] = {21,32,41,12,11,21,12,45,76,89,90,2,5,12,0,121,1222};
            Arrays.sort(b, Collections.reverseOrder());
	        System.out.println(Arrays.toString(b));
	}

}
