public class spcialNumber {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        int maxele = 0;
        for(int v:nums){
            if(v>maxele) maxele = v;
        }
        int max = Math.min(nums.length, maxele);
        for(int i=0; i<= max; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]>=i) count++;
            }
            if(count == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
