package Assignment5;

import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.List;


public class MissingNumber {

  public static void main(String[] args) {
    int[] arr = {1,3,5,7,9};
    int k = 2; 
    int i = 0, j = 1;
    List<Integer> list = new ArrayList<Integer>();
    while(i<arr.length){
      if(arr[i]!=j){
        list.add(j);
        j++;
      }
      else{
        j++;
        i++;
      }
      if(list.size()==k){
        break;
      }
    }
    while(list.size()!=k){
      list.add(j);
      j++;
    }
    int ans = list.get(k-1);
    System.out.println(ans);
  }

}
