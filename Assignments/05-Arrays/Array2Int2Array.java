package Assignment4;

//18no. Add to Array-Form of Integer
//989. Add to Array-Form of Integer (Leetcode)
//didn't accepted in leetcode

import java.util.ArrayList;
import java.util.List;


public class Array2Int2Array {

  public static void main(String[] args) {
    int[] num = {9,9,9,9,9,9,9,9,9};
    int k = 1;
    List<Integer> list = new ArrayList<Integer>();
    long x=0L;
    for(int i=0; i<num.length; i++){
      x = x*10 + num[i];
    }
    
    x = x + k;
    while(x>0){
      int y = (int)x%10;
      list.add(0, y);
      x = x/10;
    }
    System.out.println(list);
  }

}
