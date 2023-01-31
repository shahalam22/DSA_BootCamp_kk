public class P13SrchInSortedMatrix {

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3, 4, 5},
      {6, 7, 8, 9, 10},
      {11,12,13,14,15},
      {16,17,18,19,20},
      {21,22,23,24,25},
      {26,27,28,29,30}
    };
    int target = 29;
    int[] ans = search(matrix, target);
    System.out.println((ans[0]+1)+" "+(ans[1]+1));
  }

  static int[] search(int[][] matrix, int target){
    int rStart = 0;
    int rEnd = matrix.length-1;
    int cStart = 0;
    int cEnd = matrix[0].length-1;
    
//finding the row by binary search where the element belong

    if(target>matrix[rEnd][0]) rStart=rEnd;
    
    while(rStart+1<rEnd){
      int rMid = rStart + (rEnd-rStart)/2;
      if(target<matrix[rMid][0]){
        rEnd = rMid;
      }
      else if(target>matrix[rMid][0]){
        rStart = rMid;
      }
    }

//doing binary search in the row where the element belong
    
    while(cStart<=cEnd){
      int cMid = cStart + (cEnd-cStart)/2;
      if(target<matrix[rStart][cMid]){
        cEnd = cMid-1;
      }
      else if(target>matrix[rStart][cMid]){
        cStart = cMid+1;
      }
      else return new int[]{rStart, cMid};
    } 
    return new int[]{-1, -1};
  }
   
}
