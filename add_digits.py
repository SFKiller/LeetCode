#!/usr/bin/python
"""
    This is an ugly version.

    @author SFKiller
    @usage:
        python AddDigits.py number
    @example:
        python AddDigits.py 88
"""

import sys
class Solution:
    def addDigitals(num):
        """
        :type num: int
        :rtype: int
        """
        if 0 == num:
            return 0

        while 0 != (num // 10):
            s = 0
            while 0 != (num // 10):
                s += (num % 10)
                num = num // 10
            num += s
#            print(num)
#            print(s)
        return num

if __name__ == '__main__':
    number = sys.argv[1]
    #print(number)

    int_num = int(number)
    print(Solution.addDigitals(int_num))
