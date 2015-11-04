#!/usr/bin/python
"""
    This is an ugly solution for Palindrome Permutation
    @author SFKiller

    Problem Description:
      Given a string s, return all the palindromic permutations (without duplicates) of it.
      Return an empty list if no palindromic permutation could be form.
      For example:
          Given s = "aabb", return ["abba", "baab"].
          Given s = "abc", return [].
"""

import sys

class Solution:

    def __init__(self):
        self.results = []

    def generatePalindromes(self, s):
        """
        :type s: str
        :retype: List[str]
        """
        if s is None or (0 == len(s)):
            return []

        if 1 == len(s):
            self.results.append(s);
            return self.results;

        origin_string = {}
        for c in s:
            if c not in origin_string:
                origin_string[c] = 1
            else:
                origin_string[c] += 1

        odd_char = ""
        add_count = 0
        for cc in origin_string:
            if 0 == origin_string[cc] % 2:
                continue
            else:
                odd_char = cc
                add_count += 1

        if add_count <= 1:
            half_s = self.generateBaseString(origin_string)
            self.generatePalindromeInternal(half_s, "", len(half_s), odd_char)
            return self.results

        return self.results

    def generateBaseString(self, origin_s):
        half_s = ""
        for ccc in origin_s:
            for i in range(origin_s[ccc] // 2):
                half_s += ccc
        return half_s

    def generatePalindromeInternal(self, s, leftPart, length, odd_char):
        if length == len(leftPart):
            self.results.append(leftPart + odd_char + leftPart[::-1])
            return
        for i in range(len(s)):
            if i > 0 and s[i] == s[i - 1]:
                continue
            else:
                self.generatePalindromeInternal(s[ :i] + s[i + 1: ], leftPart + s[i], length, odd_char)

if __name__ == '__main__':
    s = sys.argv[1]
    origin_s = str(s)
    solution = Solution()
    print(solution.generatePalindromes(origin_s))
