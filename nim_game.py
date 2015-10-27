#!/usr/bin/python
"""
    This is an ugly solution for "Nim Game"
    @author SFKiller

"""
import sys

class Solution:
    def CanWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if (0 == (n - 1) % 4) or (0 == (n - 2) % 4) or (0 == (n - 3) % 4):
            print("Win")
            return True
        else:
            return False

if __name__ == '__main__':

    n = int(sys.argv[1])

    solution = Solution()
    print(solution.CanWinNim(n))
            
