import java.util.Arrays;

public class arithmaticProgression {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        Arrays.sort(arr);
        int dif = arr[1]-arr[0];
        int flag = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]!=dif){
                flag = 1;
            }
        }
        if(flag==0) System.out.println("True");
        else if (flag==1) System.out.println("False");
    }
}
