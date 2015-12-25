/**
 * @author SFKiller
 *
 * This is an java solution for leetcode problem: Excel Sheet Column Number
 *
 * Problem Descreption:
 *    Releted to question Excel Sheet Column Title.
 *
 *    Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 *    For example:
 *
 *        A -> 1
 *        B -> 2
 *        ...
 *
 *        Z -> 26
 *        AA -> 27
 *        AB -> 28
 */

public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        if (null == s || "" == s) return 0;
        if (1 == s.length()) {
            return (s.charAt(0) - 'A' + 1);
        } else {
            return (titleToNumber(s.substring(0, s.length() - 1)) * 26) + 
                    titleToNumber(String.valueOf(s.charAt(s.length() - 1)));
        }
    }

    public static void main(String[] args) {
        String s = "AAA";
        ExcelSheetColumnNumber escn = new ExcelSheetColumnNumber();
        System.out.println(String.valueOf(escn.titleToNumber(s)));
    }

}
