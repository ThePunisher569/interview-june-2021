package exam;

import org.apache.commons.codec.binary.StringUtils;
import org.apache.maven.surefire.shared.lang3.ArrayUtils;

public class ConvertToBinary {

  public String toBinary(int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    String res = "";
    try {
      if(n<0){
        throw new Exception("Number is negative");
      }

      int[] bin = new int[50];
      int i = 0;
      while(n>0){
        bin[i++] = n%2;
        n = n/2; 
      }

      for(int j = i-1;j >= 0;j--){    
        res += String.valueOf(bin[j]);    
      }  

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return res;
  }
}
