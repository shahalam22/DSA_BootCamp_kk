package Assignment5;

public class SmallCharGreatThanTarget {

  public static void main(String[] args) {
    char[] letters = {'x','x','x','y','y'};
    char target = 'x';
    int i=0, j=letters.length-1, mid=0;
    while(i<=j){
      mid =(i+j)/2; 
      if(letters[mid]>target){
        j = mid-1;
      }
      else if(letters[mid]<=target){
        i = mid+1;
      }
    } 
    System.out.println(letters[i%letters.length]);
    return;
  }

}
