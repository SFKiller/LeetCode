/**
 * @author SFKiller
 *
 * This is an java solution for leetcode problem: Shortest Word Distance
 *
 * Problem Description:
 *     Given a list of words and two words word1 and word2, 
 *     return the shortest distance between these two words 
 *     in the list.
 *
 *     For example,
 *     Assume that words = ["practice", "makes", "perfect", "coding", "makes"].
 *
 *     Given word1 = "coding", word2 = "practice", return 3.
 *     Given word1 = "makes", word2 = "coding", return 1.
 *
 *     Note:
 *     You may assume that word1 does not equal to word2, 
 *     and word1 and word2 are both in the list.
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.String;
public class ShortestWorldDistance {

    public int shortestDistance(String[] words, String word_a, String word_b) {
        int w_p_a = -1;
        int w_p_b = -1;
        int d = words.length;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word_a)) {
                w_p_a = i;
            }
            if (words[i].equals(word_b)) {
                w_p_b = i;
            }

            if (-1 != w_p_a && -1 != w_p_b) {
                d = min(d, abs(w_p_a - w_p_b));
            }
        }
        return d;
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }

    private int abs(int x) {
        return x > 0 ? x : (0 - x);
    }

    public static void main (String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word_a = "coding";
        String word_b = "practice";

        ShortestWorldDistance swd = new ShortestWorldDistance();
        System.out.println(String.valueOf(swd.shortestDistance(words, word_a, word_b)));
    }
}
