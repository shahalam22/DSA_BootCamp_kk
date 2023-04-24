package demo.recursionPractice;

import java.util.ArrayList;

//Integer er maddhome kotogula combination somvob jekhane element gular jogfol 4 hobe ---
public class question03 {
    public static void main(String[] args) {
//        dice("", 4);
        System.out.println(dice2("", 4));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            dice(p+i, target-i);
        }
    }
    static ArrayList<String> dice2(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            ans.addAll(dice2(p+i, target-i));
        }
        return ans;
    }
}
