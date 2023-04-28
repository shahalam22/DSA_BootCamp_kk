import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int v:nums){
            set.add(v);
        }

        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0; i< arr.length; i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
