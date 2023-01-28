public class P4SearchIn2DArray {

  public static void main(String[] args) {
    int[][] num={
      {37,26,56,43},
      {87,93,58},
      {21,73,5,15},
      {22,49}
    };
    int target = 87;
    int[] ans = search(num, target);
    System.out.println("Row: "+(ans[0]+1)+" Column: "+(ans[1]+1));
  }
  
  static int[] search(int arr[][], int target){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j]==target) return new int[]{i,j};
      }
    }
    return new int[]{-1,-1};
  }
  
}
