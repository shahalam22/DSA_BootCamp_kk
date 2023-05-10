//https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class lengthOfString {
    public static void main(String[] args) {
        System.out.println(lenString("hello"));
    }

    static int lenString(String str){
        if(str.equals("")) return 0;
        return lenString(str.substring(1)) + 1;
    }
}
