package Assignment4;

import java.util.Arrays;

public class PlusOne {

  public static void main(String[] args) {
    int[] digits = {7,8,9,2,1,3};
    
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            System.out.println(Arrays.toString(digits));
            return;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    System.out.println(Arrays.toString(digits));
    return;
  }  

}