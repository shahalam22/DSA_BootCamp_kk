import java.util.Arrays;

public class avgSalEXCminSalMaxSal {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2555};
        Arrays.sort(salary);
        double sum = 0;
        for(int i=1; i<salary.length-1; i++){
            sum += salary[i];
        }
        sum = sum/(salary.length-2);
        System.out.println(sum);
    }
}
