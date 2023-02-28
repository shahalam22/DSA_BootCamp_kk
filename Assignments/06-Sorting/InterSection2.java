package Assignment5;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class InterSection2 {

  public static void main(String[] args) {

    //int[] nums1 = {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41}, nums2 = {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20};
    int[] nums1 = {1,2,2,1}, nums2 = {2,2};    

    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    
    int i=0, j=0;
    
    while(i<nums1.length && j<nums2.length){
      if(nums1[i]<nums2[j]){
        i++;
      }
      else if(nums2[j]<nums1[i]){
        j++;
      }
      else{
        list.add(nums1[i]);
        i++;
        j++;
      }
    }
    
    int z = list.size();
    int[] ans = new int[z];
    for(int k=0; k<z; k++){
      ans[k]=list.get(k);
    }
    
    System.out.println(Arrays.toString(ans));

  }

}
