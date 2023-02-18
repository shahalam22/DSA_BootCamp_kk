package Assignment4;

public class Pangram {

  public static void main(String[] args) {
    String str = "thebrownfx";
    char[] ch = str.toCharArray();
    boolean k;
    char[] alp = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    if(ch.length<26) {
      k = false;
      System.out.println(k);
      return;
    }
    for(int i=0; i<ch.length; i++){
      for(int j=0; j<26; j++){
        if(ch[i]==alp[j]){
          alp[j] = '0';
          break;
        }
      }
    }
    for(int i=0; i<26; i++){
      if(alp[i]!='0'){
        k = false;
        System.out.println(k);
        return;
      }
    }
    k = false;
    System.out.println(k);
    return;
  }

}
