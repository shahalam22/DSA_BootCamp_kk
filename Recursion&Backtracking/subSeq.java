package demo.recursionPractice;

import java.util.ArrayList;
import java.util.List;

//subset problem: amader ekta string/int value deya thakbe,
// then oi value er subset niye ekta kaj kora lagbe;
//for a value of n element has a subset of 2^n element;
public class subSeq {
    public static void main(String[] args) {
        //System.out.println(subseq("", "abc"));
        subseq("", "abc");

//        int[] arr = {1,2,3};
//        List<List<Integer>> list = ssUsingIteration(arr);
//        System.out.println(list);

//        int[] arr = {1,2,2};
//        List<List<Integer>> list = ssUsingIterationDup(arr);
//        System.out.println(list);
    }

    //code of subset without LIST
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p, up.substring(1));
        subseq(p + up.charAt(0), up.substring(1));
    }

    //code using LIST
    static ArrayList<String> subseqRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = subseqRet(p+up.charAt(0), up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    //considering ASCII value of the letter as an element of the subset
    //for a value of n element has a subset of 3^n element;
    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseqAscii(p, up.substring(1));
        subseqAscii(p + up.charAt(0), up.substring(1));
        subseqAscii(p + (up.charAt(0)+0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> first = subseqAsciiRet(p+up.charAt(0), up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p+(up.charAt(0)+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

    //this subset problem without recursion, using iteration methode
    static List<List<Integer>> ssUsingIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    //if set is {1,2,2} then there {2} & {1,2} will be duplicate in the set of element,
    //to skip this follow bellow code
    static List<List<Integer>> ssUsingIterationDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int j = 0; j<arr.length; j++){
            start=0;
            if(j>0 && arr[j]==arr[j-1]){
                start = end+1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for(int i=start; i<n; i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
