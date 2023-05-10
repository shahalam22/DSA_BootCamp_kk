//https://leetcode.com/problems/reverse-string/submissions/
public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

//        non recursive way
//        for(int i=0; i<s.length/2; i++){
//            char temp = s[i];
//            s[i] = s[s.length-1-i];
//            s[s.length-1-i] = temp;
//        }
        revChar(s, 0);
        System.out.println(s);
    }
    public static void revChar(char[] s, int start){
        if(start==s.length/2) return;
        char temp = s[start];
        s[start] = s[s.length-1-start];
        s[s.length-1-start] = temp;
        revChar(s, start+1);
    }
}
