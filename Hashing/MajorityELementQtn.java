import java.util.HashMap;

public class MajorityELementQtn {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,1,2,1,5};
        majorityElement(nums);
    }

    public static void majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int a : nums){
            if(map.containsKey(a)){
                map.put(a, (map.get(a)+1));
            } else {
                map.put(a, 1);
            }
        }

        for(int a:map.keySet()){
            if(map.get(a)>(nums.length/3)){
                System.out.println(a);
            }
        }
    }
}
