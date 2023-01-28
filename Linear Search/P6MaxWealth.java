public class P6MaxWealth {

  public static void main(String[] args) {
  
  int[][] accounts = {{1,2,3,4},{2,3,4,1},{1,3,5,3},{1,2,3,3}};
  System.out.println(maxWealth(accounts));

  }

  static int maxWealth(int[][] accounts){
    int sum;
    int ans = Integer.MIN_VALUE;
    for(int person=0; person<accounts.length; person++){
      sum = 0;
      for(int balance=0; balance<accounts[person].length; balance++){
        sum += accounts[person][balance];
      }
      if(sum>ans) ans = sum;
    }
    return ans;
  }

}
