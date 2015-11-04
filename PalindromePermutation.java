/*
 * @author: SFKiller
 *
 * Problem Description:
 * Given a string s, return all the palindromic permutations (without duplicates) of it.
 * Return an empty list if no palindromic permutation could be form.
 * For example:
 *     Given s = "aabb", return ["abba", "baab"].
 *     Given s = "abc", return [].
 */
//package com.sfkiller.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuffer;
import java.util.Map;
import java.util.HashMap;

public class PalindromePermutation {

    private List<String> havePalindromePermutation(String s) {

        List<String> result = new ArrayList<String>();

        if (null == s || 0 == s.length()) return result;

        if (1 == s.length()) {
            result.add(s);
            return result;
        }

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        charMap.put(s.charAt(0),1);

        for (int i = 1; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        String odd_char = "";
        int odd_count = 0;
        int sum = 0;
        for (Character c : charMap.keySet()) {
            //sum += (charMap.get(c) % 2);
            if (0 == charMap.get(c) % 2) {
                continue;
            } else {
                odd_char += c;
                odd_count++;
            }
        }

        if (odd_count <= 1) {
            String originString = generateBaseString(charMap);
            String left = "";
            generatePalindrome(originString, left, originString.length(), odd_char, result);
            //System.out.println("Ready for print*********");
            printResult(result);
            return result;
        }

        System.out.println("The String has no palindromic permutations!");
        return result;

    }

    private void printResult(final List<String> results) {

        if (null != results) {
            //System.out.println("results is not null***********");
            //int s_size = results.size();
            //System.out.println(Integer.toString(s_size));
            for (int i = 0; i < results.size(); i++) {
                //System.out.println("In the for block***************");
                String s = results.get(i);
                System.out.println(s);
            }
        } else {
            //System.out.println("results is null***********");
        }
    }

    private String generateBaseString(final Map<Character, Integer> map) {

        String originS = "";
        for (Character c : map.keySet()) {
            for (int i = 0; i < (map.get(c) / 2); i++) {
                originS += c;
            }
        }

        return originS;

    }

    private String reverseString(String origin) {

        if (null == origin) {
            return "";
        }

        StringBuffer sb = new StringBuffer(origin);

        int length = origin.length();
        for (int i = 0; i < length / 2; i++) {
            sb.setCharAt(i, (char)(sb.charAt(i) ^ sb.charAt(length - i - 1)));
            sb.setCharAt(length - i - 1, (char)(sb.charAt(i) ^ sb.charAt(length - i - 1)));
            sb.setCharAt(i, (char)(sb.charAt(i) ^ sb.charAt(length - i - 1)));
        }
        return sb.toString();
    }

    private void generatePalindrome(String s, String leftPart, int length, String odd_char, List<String> result) {

        if (length == leftPart.length()) {
            result.add(leftPart + odd_char + reverseString(leftPart));
        }

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) continue;

            generatePalindrome(s.substring(0, i) + s.substring(i + 1), leftPart + s.charAt(i), length, odd_char, result);
        }
    }

    public static void main(String[] args) {

        String input = args[0];
        System.out.println("Input string is: " + args[0]);
        PalindromePermutation pp = new PalindromePermutation();
        List<String> result = new ArrayList<String>();

        result = pp.havePalindromePermutation(input);
    }
}
