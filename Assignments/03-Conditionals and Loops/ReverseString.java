package Assignment2;

//Reversing a string.

public class ReverseString {

  public static void main(String[] args) {
    String word = "Abir";
    System.out.println(reverse(word));
  }
  
  static String reverse(String name){
    int len = name.length();
    int start = 0;
    int end = len-1;
    char[] ch = name.toCharArray();
    while(start<=len/2){
      if(name.charAt(start)!=name.charAt(end)){
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;
      }
      start++;
      end--;
    }
    String rev = String.valueOf(ch);
    return rev;
  }
  
}
