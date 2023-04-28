import java.util.Arrays;
import java.util.HashMap;

public class RankTransform {
    public static void main(String[] args) {

        int[] arr = {37,12,28,9,100,56,80,5,12};
        int[] arr1 = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(arr1);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for(int i=0; i<arr1.length; i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], count);
                count++;
            }
        }
        for(int j=0; j<arr1.length; j++){
            arr1[j] = map.get(arr[j]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
