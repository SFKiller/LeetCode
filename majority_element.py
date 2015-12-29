#!/usr/bin/python
"""
    @author SFKiller

    This is a python solution for leetcode problem: 'Majority Element'

    Problem Description:
        Given an array of size n, find the majority element. The majority
        element is that appears more than [n / 2] times. You may assume
        that the array is non-empty and the majority element always exist
        in the array.
"""
class Solution:
    def majorityElement(self, nums):
        """
        :type nums: int[]
        :retype: int
        """
        if nums is None or 0 == len(nums):
            return 0
        chosenOne = nums[0]
        count = 0
        for num in nums:
            if 0 == count or num == chosenOne:
                chosenOne = num
                count += 1
            else:
                count -= 1
        return chosenOne

    def majorityElement2(self, nums):
        if nums is None or 0 == len(nums):
            return 0
        num_dict = dict()
        for num in nums:
            if num_dict.has_key(num):
                if (num_dict.get(num, 0) + 1) > (len(nums) / 2):
                    return num
                else:
                    num_dict[num] = num_dict.get(num, 0) + 1
            else:
                num_dict[num] = 1
        return nums[0]

    def majorityElement3(self, nums):
        if nums is None or 0 == len(nums):
            return 0
        nums.sort()
        return nums[len(nums) / 2]

if __name__ == '__main__':
    nums = [2,2,2,2,2,2,2,3,3,4,5,2,6,3,2,2,2,2,2]
    solution = Solution()
    print solution.majorityElement(nums)
    print solution.majorityElement2(nums)
    print solution.majorityElement3(nums)
