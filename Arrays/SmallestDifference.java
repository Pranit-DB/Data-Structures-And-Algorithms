import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmallestDifference {
    public static void main(String[] args) {
        List<Integer> ans = smallestDifference(new int[]{-1, 5, 10, 20, 28, 3}, new int[]{26, 134, 135, 15, 17});
        System.out.println(ans);
    }
    private static List<Integer> smallestDifference(int[] a, int[]b){
        Arrays.sort(a);
        Arrays.sort(b);
        int idx1 = 0, idx2 = 0;
        float smallest = Integer.MAX_VALUE;
        float current_difference = 0;
        List<Integer> smallest_difference = new ArrayList<>();

        while(idx1 < a.length && idx2 < b.length){

            int firstNum = a[idx1];
            int secondNum = b[idx2];

            if(firstNum < secondNum){
                current_difference = secondNum - firstNum;
                idx1++;
            } else if (firstNum > secondNum) {
                current_difference = firstNum - secondNum;
                idx2++;
            } else {
                return Arrays.asList(firstNum, secondNum);
            }
            if(smallest > current_difference){
                smallest = current_difference;
                smallest_difference = Arrays.asList(firstNum, secondNum);
            }
        }
        return  smallest_difference;
    }
}
