import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOf2SetsQtn {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,6,2,4};

        System.out.println("Number of elements in the intersection set is : " + intersectionOf2Sets(arr1, arr2));
    }

    static int intersectionOf2Sets(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        int count = 0;

        for(int x:arr1){
            set.add(x);
        }
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
//                list.add(arr2[i]);
                System.out.println(arr2[i] + "  ");
                set.remove(arr2[i]);
            }
        }

        return count;
    }
}
