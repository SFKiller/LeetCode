#!/usr/bin/python
"""
    @author:SFKiller

    Problem Description:
        You are playing the following Flip Game with your friend:
        Given a string that contains only these two characters: + and -,
        you and your friend take turns to flip two consecutive "++" into "--".
        The game ends when a person can no longer make a move and therefore
        the other person will be the winner.

        Write a function to compute all possible states of the string after one valid move.

        For example, given s = "++++", after one move, it may become one of the following states:

        [
           "--++",
           "+--+",
           "++--"
        ]
        If there is no valid move, return an empty list [].

"""
import sys
import os

class Solution:

    def __init__(self):
        self.results = []

    def generatePossibleNextMoves(self, s):
        if None == s or 1 == len(s) or "" == s:
            return self.results;

        for i in range(len(s) - 1):
            if s[i] == s[i + 1]:
                if s[i] == '+':
                    print(s[:i])
                    print(s[i + 2:])
                    self.results.append(s[:i] + "--" + s[i + 2:])
                else:
                    self.results.append(s[:i] + "++" + s[i + 2:])
            else:
                continue

        return self.results

if __name__ == '__main__':

    solution = Solution()
    print(solution.generatePossibleNextMoves("++++"))
