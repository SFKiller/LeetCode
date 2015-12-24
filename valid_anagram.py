#!/usr/bin/python
"""
    @author: SFKiller

    This is an python solution for leetcode problem: 'Valid Angaram'.

    Problem Description:
        Giver two strings s and t, write a function to determine if
        t is an angaram of s.

        For example,
        s = "angaram" , t = "nagaram", return true.
        s = "rat", t = "car", return false.
"""

class ValidAnagram:
    def isAnagram(self, s, t):
        if s is None and t is None:
            return True
        if s is None or t is None:
            return False
        if (len(s) != len(t)):
            return False
        count = [0] * 26
        for ss in s:
            count[ord(ss) - ord('a')] += 1
        for tt in t:
            count[ord(tt) - ord('a')] -= 1

        for i in count:
            if 0 != i:
                return False

        return True

if __name__ == '__main__':
    va = ValidAnagram()
    print(va.isAnagram("rat", "car"))
