package Assignment5;

public class NegNumCount {

  public static void main(String[] args) {
    int[][] grid = {{3,-1,-3,-3,-3},{2,-2,-3,-3,-3},{1,-2,-3,-3,-3},{0,-3,-3,-3,-3}} ;
    int count = 0;
    for(int i=0; i<grid.length; i++){
      count = count + negnum(grid[i], i);
    }
    System.out.println(count);
  }
  
  static int negnum(int[] arr, int i){
    //int[] arr = {4,3,2,1,-1,-2,-3};
    if(arr[arr.length-1]>=0) return 0;
    int l=0;
    int h=(arr.length) - 1;
    int mid = 0;
    while(l<h){
      mid = (h+l)/2;
      if(arr[mid]<=-1) h=mid;
      else if(arr[mid]>=0) l=mid+1;
    }
    //System.out.println((arr.length)-h);
    return (arr.length - h);
  }
  
}
