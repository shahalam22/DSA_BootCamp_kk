package Assignment5;

public class nAndItsDouble {

  public static void main(String[] args) {
    int[] arr = {10,1,4,3};
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        if(i==j) continue;
        else{
          if(arr[i]==(2*arr[j])){
            System.out.println("True");
            return;
          }
        }
      }
    }
    System.out.println("False");
    return;
  }

}
