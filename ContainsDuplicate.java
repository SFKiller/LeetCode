/**
 * @author SFKiller
 *
 * This is an java solution for leetcode problem: 'Contains Duplicate'
 *
 * Problem Description:
 *    Given an array of integers, find if the array contains any duplicates. 
 *    Your function should return true if any value appears at least twice 
 *    in the array, and it should return false if every elements is distinct.
 */
import java.util.Set;
import java.util.HashSet;
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        if (null == nums || 0 == n || 1 == n) return false;
        Set<Integer> num_set = new HashSet<Integer>();
        for (int i = 0; i < n; i ++) {
            if (!num_set.add(nums[i])) {
                return true;
            }
        }
        return true;
    }
}
