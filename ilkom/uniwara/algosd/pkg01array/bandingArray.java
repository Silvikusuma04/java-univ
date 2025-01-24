package ilkom.uniwara.algosd.pkg01array;
import java.util.Arrays;
public class bandingArray {
    public static void main(String[] args) {
    int[] ary = {1,2,3,4,5,6};
    int[] ary1 = {1,2,3,4,5,6};
    int[] ary2 = {1,2,3,4};
    
    System.out.println("Array 1 sama dengan array 2?? " + Arrays.equals(ary,ary1));
    System.out.println("Array 1 sama dengan array 1?? " + Arrays.equals(ary, ary2));
    }
}
