import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Collections.*;


public class TwoSum{
	public static void main(String args[]){
        int[] array = {2, 4, 1, 9, 6};
        List<Integer> ans = twoSum(array,5);
        sort(ans);
        System.out.println(ans);
	}
    private static List<Integer> twoSum(int[] array, int x) {
        ConcurrentHashMap<Integer,Integer> ht1 = new ConcurrentHashMap<>();
        Integer needed;
        List<Integer> ans = new ArrayList<>();
        for (int i=0; i < array.length; i++){
            needed = x - array[i];

            if(ht1.get(needed)!=null){
                ans.add(i);
                ans.add(ht1.get(needed));
                return ans;
            }else{
                ht1.put(array[i],i);
            }
        }
        return null;
    }
}
