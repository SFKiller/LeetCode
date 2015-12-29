/**
 * @author SFKiller
 *
 * This is a java solution for leetcode problem: 'Majority Element'.
 *
 * Problem Description:
 *     Given an array of size n, find the majority element. The majority
 *     is the element that appears more than [n / 2] times. You may assume
 *     that the array is non-empty and the majority element always exist
 *     in the array.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.System;
public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(Integer.valueOf(num))) {
                if ((map.get(Integer.valueOf(num)) + 1) > (nums.length / 2)) {
                    return num;
                } else {
                    map.put(Integer.valueOf(num), map.get(Integer.valueOf(num)) + 1);
                }
            } else {
                map.put(Integer.valueOf(num), 1);
            }
        }
        return nums[0];
    }

    public int majorityElement2(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement3(int[] nums) {
        if (null == nums || 0 == nums.length) return 0;

        int theOne = nums[0], count = 0;
        for (int num : nums) {
            if (0 == count || theOne == num) {
                theOne = num;
                count++;
            } else {
                count--;
            }
        }
        return theOne;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,2,3,4,2,3,4,2,2,2,5,5,5,5,5,5,5,5,2,2,2,2,2,2,2,22,2,22,2,2,2,2,2,2,2,2,2,22,2,2,2,2,4,4,4,4,44,44,4,4,4,4,4,4,4,5,5,5,2,2,2,2,2,2,2,2,2,2,22,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,2,2,2,2,2,2,22,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,32,2,2,2,2,2,22,2,2,2,22,2,2,2,2,2,2,2,2,2,2,2,2,2,3,33,3,3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
        MajorityElement me = new MajorityElement();
        //long startTime = System.currentTimeMillis();
        System.out.println(String.valueOf(me.majorityElement(nums)));
        //long launchTime = System.currentTimeMillis() - startTime;
        //System.out.println(String.valueOf(launchTime));
        //startTime = System.currentTimeMillis();
        System.out.println(String.valueOf(me.majorityElement2(nums)));
        //launchTime = System.currentTimeMillis() - startTime;
        //System.out.println(String.valueOf(launchTime));
        System.out.println(String.valueOf(me.majorityElement3(nums)));
    }
}
