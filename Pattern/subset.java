import java.lang.module.ModuleDescriptor.Builder;
import java.util.*;
public class subset {
   // using bitsmaupulation to generate all subsets
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int max = 1 << n;
        for (int i = 0; i < max; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;

        
    }
    public static void main(String[] args) {
        subset s = new subset();
        int[] nums = {1,2,3};
        List<List<Integer>> result = s.subsets(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}