/**
 * @author: SFKiller
 *
 * Problem Description:
 *     You are playing the following Flip Game with your friend: 
 *     Given a string that contains only these two characters: + and -, 
 *     you and your friend take turns to flip two consecutive "++" into "--". 
 *     The game ends when a person can no longer make a move and therefore 
 *     the other person will be the winner.
 *
 *     Write a function to compute all possible states of the string after one valid move.
 *
 *     For example, given s = "++++", after one move, it may become one of the following states:
 *
 *     [
 *         "--++",
 *         "+--+",
 *         "++--"
 *     ]
 *     If there is no valid move, return an empty list [].
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.String;

public class FlipGame {

    private List<String> generatePossibleNextMoves(String s) {

        List<String> results = new ArrayList<String>();

        if (null == s || 1 == s.length() || s == "")
            return results;

        String plus = "++";
        String minus = "--";

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (s.charAt(i) == '+') {
                    results.add(s.substring(0, i - 1) + minus +  s.substring(i + 1));
                } else {
                    results.add(s.substring(0, i - 1) + plus +  s.substring(i + 1));
                }
            } else {
                continue;
            }
        }

        return results;
    }

    public static void main(String[] args) {

        String input = "++++";

        FlipGame fg = new FlipGame();
        List<String> s = null;
        s = fg.generatePossibleNextMoves(input);
        if (null != s) {
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i));
            }
        }
    }

}
