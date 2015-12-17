#!/usr/bin/python
"""
    @author : SFKiller

    Problem Description:
        Given an array nums, write a function to move all 0's
        to the end of it while maintaining the relative order
        on the non-zero elements.

        For example,
            given nums = [0, 1, 0, 3, 12],
            after calling your function,
            nums should be [1, 3, 12, 0, 0].

"""
class Solution:

    def moveZeros(self, nums):
        """
        :type nums: List[int]
        :retype: void Don't return anything, modify nums in-place instead
        """

        if nums is None or (0 == len(nums)):
            return

        index = 0
        for num in nums:
            if 0 != num:
                nums[index] = num
                index += 1

        while index < len(nums):
            nums[index] = 0
            index += 1

if __name__ == '__main__':
    nums = [0,1,0,3,12]
    solution = Solution()
    solution.moveZeros(nums)
    print(nums)

