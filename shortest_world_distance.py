#!/usr/bin/python
"""
    @author SFKiller
    This is an python solution for leetcode problem: 'Shortest Word Distance'

    Problem Description:
        Given a list of words and two words word1 and word2, return the shortest distance between these
        two words in the list.

    For example,
        Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

        Given word1 = "coding", word2 = "practice", return 3.
        Given word1 = "makes", word2 = "coding", return 1.

    Note:
        You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
"""

class ShortestWordsDistance:

    def __init__(self, wordss, word1, word2):
        self.words = wordss
        self.word_a = word1
        self.word_b = word2

    def shortestDistance(self):
        w_p_a = -1
        w_p_b = -1
        d = len(self.words)

        for i in range(len(self.words)):
            if self.words[i] == self.word_a:
                w_p_a = i
            if self.words[i] == self.word_b:
                w_p_b = i

            if w_p_a != -1 and w_p_b != -1:
                d = min(d, abs(w_p_a - w_p_b))
        return d

if __name__ == '__main__':
    words = ["practice", "makes", "perfect", "coding", "makes"]
    word1 = 'coding'
    word2 = 'practice'

    swd = ShortestWordsDistance(words, word1, word2)
    print(swd.shortestDistance())
