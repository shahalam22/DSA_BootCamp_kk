import java.util.Arrays;
import java.util.HashSet;

public class setMismatchLC {
    public static void main(String[] args) {
        int[] nums = {1,5,3,2,2,7,6,4,8,9};

        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int[] ans = new int[2];

        for(int b:nums){
            set.add(b);
        }

        for(int i=1; i<= nums.length; i++){
            if(!set.contains(i)){
                ans[1]=i;
            }
        }

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=i; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==2) {
                ans[0] = nums[i];
                break;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
