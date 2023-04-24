package demo.recursionPractice;

import java.util.ArrayList;

public class permutationUsingRecursion {
    public static void main(String[] args) {
//        permutations("", "abc");
//        System.out.println(permutationsRet("", "ab"));
        System.out.println(permutationCount("", "ab"));
    }

    //in recursion process
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            permutations(f + up.charAt(0) + l, up.substring(1));
        }
    }

    //in iteration process
    static ArrayList<String> permutationsRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            ans.addAll(permutationsRet(f+up.charAt(0)+l, up.substring(1)));
        }
        return ans;
    }

    //permutation counter
    static int permutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            count = count + permutationCount(f+up.charAt(0)+l, up.substring(1));
        }
        return count;
    }
}
