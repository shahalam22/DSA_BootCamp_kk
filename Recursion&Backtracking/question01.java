package demo.recursionPractice;


//str = baccad white a program using recursion to get output str = bccd
public class question01 {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bapplegapplzapp"));
    }

    //here we are passing resultant string as argument
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        if(up.charAt(0)=='a'){
            skip(p, up.substring(1));
        } else {
            skip(p+up.charAt(0), up.substring(1));
        }
    }

    //here we are not passing resultant string as argument, we are returning string as return value
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0)=='a'){
            return skip2(up.substring(1));
        } else {
            return up.charAt(0) + skip2(up.substring(1));
        }
    }

    //if we want to skip a string instead of a character, then we can follow this
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //if there is such condition that we want to skip "app" but not the "app" of "apple".
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
