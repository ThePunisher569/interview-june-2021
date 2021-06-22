package exam;

import java.util.Arrays;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.

    int last = arr[arr.length-1];

    for(int i=arr.length-1;i>0;i--){
      arr[i] = arr[i-1];
    }
    arr[0] = last;
    System.out.println(Arrays.toString(arr));
  }

}
