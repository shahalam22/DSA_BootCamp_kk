import java.util.HashMap;

//here we will given an array and we have to find the numbers of that how many sub-arrays can we form which elements sum is equal to a given number K
//we can think to solve this using recursive call or iteration call
public class SubarraySumEqualToKQtn {
    public static void main(String[] args) {
        int[] arr = {10,2,-2,-20,10};
        int k = -10;

        System.out.println(subarraySum(arr, k));
    }

    public static int subarraySum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1);
        int count = 0;
        int innerCount = 0;

        for(int j=0; j<arr.length; j++){
            innerCount += arr[j];
            if(map.containsKey(innerCount-k)){
                count += map.get(innerCount-k);
            }

            if(map.containsKey(innerCount)){
                map.put(innerCount, map.get(innerCount)+1);
            }
            else {
                map.put(innerCount, 1);
            }
        }
        return count;
    }
}
