package Assignment4;

public class RichestCustomer {

  public static void main(String[] args) {
  
    int[][] num = {{1,2,3},{2,2,3},{2,3,1}};
    int max = 0;
    int sum;
    
    for(int i=0; i<num.length; i++){
      sum = 0;
      for(int j=0; j<num[i].length; j++){
        sum = sum + num[i][j];
      }
      if(sum>max){
        max = sum;
      }
    }
    
    System.out.println(max);

  }

}
