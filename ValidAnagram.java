/**
 * @author SFKiller
 *
 * Problem Description:
 *     Given two strings s and t, write a function to determine
 *     if t is an anagram of s.
 *
 * For example,
 *
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
import java.lang.StringBuilder;
import java.lang.String;
class ValidAngaram {

    public boolean isAngaram(String s, String t) {
        if (null == s && null == t) return true;
        if (null == s || null == t) return false;
        if (s.length() != t.length()) return false;
        if (0 == s.length() && 0 == t.length()) return true;

        int find = 0;
        StringBuilder sb_t = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            find = 0;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) == sb_t.charAt(j)) {
                    find = 1;
                    if (i != j) {
                        char temp = sb_t.charAt(i);
                        sb_t.setCharAt(i, sb_t.charAt(j));
                        sb_t.setCharAt(j, temp);
                    }
                    break;
                } else {
                    continue;
                }
            }
            if (1 == find) continue;
            else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAngaram va = new ValidAngaram();
        if (va.isAngaram(s, t)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
