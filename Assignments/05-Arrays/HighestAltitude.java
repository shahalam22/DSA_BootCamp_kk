package Assignment4;

public class HighestAltitude {

  public static void main(String[] args) {
    int[] gain = {-5,1,5,0,-4};
    int ha = 0, sum = 0;
    for(int i=0; i<gain.length; i++){
      sum = sum + gain[i];
      if(sum>ha) ha = sum;
    }
    System.out.println(ha);
  }

}
