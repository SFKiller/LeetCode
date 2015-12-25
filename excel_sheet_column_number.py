#!/usr/bin/python
"""
    @author SFKiller

    This is an python solution for leetcode problem: 'Excel Sheet Column Number'

    Problem Description:

        Given a column title as appear in an Excel sheet, return its corresponding column number.

        For example:

            A -> 1
            B -> 2
            C -> 3
            ...

            Z -> 26
            AA -> 27
            AB -> 28
"""
class Solution:

    def titleToNumber(self, s):
        """
        :type s: str
        :retype: int
        """
        if s is None or (0 == len(s)):
            return 0
        if (1 == len(s)):
            return (ord(s[0]) - ord('A') + 1)
        else:
            return self.titleToNumber(str(s[: -1])) * 26 + self.titleToNumber(str(s[-1]))

if __name__ == '__main__':
    s = "AAA"
    solution = Solution()
    print solution.titleToNumber(s)
