package JavaBasics;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str="aeiouaeiou";
          //System.out.println(str.length());
          int count=0;
          for(int i=0;i<str.length();i++) {
        	  char ch=str.charAt(i);
        	  if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') {
        		  count++;
        	  }
          }
              System.out.println(count);
	}

}
