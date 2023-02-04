public class CheckPaliondrom {

  public static void main(String[] args) {
    String word = "madam";
    System.out.println(chkpaliondrom(word));
  }
  
  static Boolean chkpaliondrom(String name){
    int len = name.length();
    int start = 0;
    int end = len-1;
    while(start<=len/2){
      if(name.charAt(start)!=name.charAt(end)){
        return false;
      }
      start++;
      end--;
    }
    return true;
  }
  
}
