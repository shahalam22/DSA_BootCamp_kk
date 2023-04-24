package demo.recursionPractice;

import java.util.ArrayList;
import java.util.List;


//dial pad theke digit input deyar sapekkhe possible output ki ki ashte pare ta ber kora -- GOOGLE question
public class question2 {
    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(pad2("", "12"));
    }

    //solving using recursion
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1)*3; i<(digit)*3; i++){
            pad(p+(char)('a'+i), up.substring(1));
        }
    }

    //solving using LIST
    static ArrayList<String> pad2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0)-'0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            ans.addAll(pad2(p+(char)('a'+i), up.substring(1)));
        }
        return ans;
    }
}
