import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  T = O(n^2), S = O(n)
public class ThreeNumSum {
    public static void main(String[] args) {

        int[] arr = {12, 3, 1, 2, -6, 5, -8, 6};
        List<List<Integer>> ans = threeNumSum(arr, 0);
        System.out.println(ans);
    }
    private static List<List<Integer>> threeNumSum(int[] array, int targetSum){
        Arrays.sort(array);
        List<List<Integer>> absolute = new ArrayList<>();
        for (int i = 0; i< array.length; i++) {
            int left = i + 1, right = array.length - 1;
            while(left<right){
                List<Integer>ans = new ArrayList<>();
                int currentSum = array[i] + array[left] + array[right];
                if(currentSum==targetSum){
                    ans.add(array[i]);
                    ans.add(array[left]);
                    ans.add(array[right]);
                    absolute.add(ans);
                    left++;
                    right--;
                } else if (currentSum < targetSum) left++;
                else if (currentSum > targetSum) right--;
            }
        }
        return absolute;
    }
}
