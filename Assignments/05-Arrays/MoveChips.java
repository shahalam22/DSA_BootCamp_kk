package Assignment4;

public class MoveChips {

  public static void main(String[] args) {
    int[] position = {2,3,3};
    //int cost = 0;
    int minCost = Integer.MAX_VALUE;
    for(int i=0; i<position.length; i++){
      int cost = 0;
      for(int j=0; j<position.length; j++){
        int dif = position[i] - position[j];
        if(dif<0) dif=dif*(-1);
        if(dif%2==1) cost++;
      }
      //System.out.println(cost);
      if(cost<minCost) minCost=cost;
    }
    System.out.println(minCost);
  }

}
