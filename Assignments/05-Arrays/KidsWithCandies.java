package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

  public static void main(String[] args) {
    List<Boolean> ans = new ArrayList<Boolean>();
    int[] candies = {3,4,5,2,1};
    int extraCandies = 2;
    int n = candies.length;
    int max= 0;
    for(int i = 0; i<n; i++){
      if(candies[i]>max) max = candies[i];
    }
    for(int i = 0; i<n; i++){
      if(candies[i]+extraCandies >= max) ans.add(true);
      else ans.add(false);
    }
    
    System.out.println(ans);
  }

}
