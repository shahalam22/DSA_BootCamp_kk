import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/
public class sumTriangleGFG {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

        int[] cNum = Arrays.copyOf(num, num.length);
        sum(num);
        System.out.println(Arrays.toString(cNum));
    }
    public static void sum(int[] num){
        if(num.length==1) return;
        for(int i=0; i< num.length-1; i++){
            num[i] = num[i]+num[i+1];
        }
        sum(Arrays.copyOf(num, num.length-1));
        System.out.println(Arrays.toString(Arrays.copyOf(num, num.length-1)));
    }
}
