#!/usr/bin/python
"""
    @author SFKiller

    This is a python solution for leetcode problem: 'Contains Duplicate'

    Problem Description:
        Given an array of integers, find if the array contains any duplicate.
        Your function should return true if any value appears at least twice
        in the array, and it should return false if every element is distinct.
"""
class Solution:

    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :retype: bool
        """
        if 0 == len(nums) or 1 == len(nums):
            return False
        else:
            num_set = set()
            for num in nums:
                if num in num_set:
                    return True
                else:
                    num_set.add(num)
        return False
