public class P1SearchInStrings {
    
    public static void main(String[] args) {
    String name = "Shah Alam Abir";
    char target = 'v';
    System.out.print(search(name, target));
  }
  
    static Boolean search(String str, char target){
    if(str.length()==0) return false;
    
    for(int i=0; i<str.length(); i++){
      if(str.charAt(i)==target) return true;
    }    
    return false;
  }

}


/*

We can use function like-

  static Boolean search(String str, char target){
  if(str.length()==0) return false;
    
  for(char ch : str.toCharArray()){
    if(ch == target) return true;
  }
  return false;
}

*/
