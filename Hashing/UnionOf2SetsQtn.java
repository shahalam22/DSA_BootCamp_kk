import java.util.HashSet;

//we have to print out how many values will be there in the union of the sets
public class UnionOf2SetsQtn {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,6,2,4};

        System.out.println("Number of elements in the union set is : " + UnionOf2Sets(arr1, arr2));
    }
    static int UnionOf2Sets(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int x:arr1){
            set.add(x);
        }
        for(int x:arr2){
            set.add(x);
        }
        return set.size();
    }
}
