import java.util.*;
public class SortString {

	public static void main(String[] args) {
		char ch1 ;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the string :");
      String str = sc.nextLine();
      char ch []= str.toCharArray();
      int length = str.length();
      for (int i=0;i<length;i++) {
    	  for (int j=i+1;j<length;j++) {
        	  if(ch[i]>ch[j]) {
        		  ch1=ch[i];
        		  ch[i]=ch[j];
        		  ch[j]=ch1;
        	  }
        	}  
      }
      System.out.println("sorting string :"+Arrays.toString(ch));
	}

}
