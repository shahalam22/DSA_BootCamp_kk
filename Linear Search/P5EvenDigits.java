public class P5EvenDigits {

  public static void main(String[] args) {
    int[] num = {12, 494, 51, -63, 43, -74, 123};
    int b, i, c=0;
    for(i=0; i<num.length; i++){
      b = check(num[i]);
      if(b==1) c++;
    }
    System.out.print(c);
  }

  static int check(int a){
    int count=0;
    if(a<0) a *= -1;
    if(a==0) return 1;
    while(a>0){
      count++;
      a=a/10;
    }
    if(count%2==0) return 1;
    else return 0;
  }

}
