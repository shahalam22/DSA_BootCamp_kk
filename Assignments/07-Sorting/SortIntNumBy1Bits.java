import java.util.Arrays;

public class SortIntNumBy1Bits {
    public static void main(String[] args) {
        int[][] num = {
                {4,5},
                {3,6},
                {2,7},
                {1,8}
        };
        System.out.println(Integer.bitCount(7));
    }
}
/**this solution is little off thinking as
 first I am adding sum of number of bits +(sum of bits)* constant

 after that number will become different even for 1 bit count numbers due to its initial value summed.
 for ex- 2 and 4 has same - 1 bit in binary but if we do int two=2+2100 and int four=4+4100 then it makes the difference

 and later on I just divided it back with the constant..
 you can try the constant 50002, or you can check by 500001 this and even 1000001 also.*/