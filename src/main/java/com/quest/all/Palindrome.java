package com.quest.all;

import java.util.Arrays;

/**
 * Find longest palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(getLongestPalindrome(Arrays.toString(args)));
    }

    static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (r >= l) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            r--;
            l++;
        }
        return true;
    }

    /*
    program to get longest palindrome value
     */
    static String getLongestPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        var subString = "";
        while (r >= l) {
            var current = s.substring(l, r);
            if (isPalindrome(current)) {
                subString = current;
                break;
            } else {
                if (isPalindrome(s.substring(l + 1, r))) {
                    subString = s.substring(l + 1, r);
                    break;
                } else if (isPalindrome(s.substring(l, r - 1))) {
                    subString = s.substring(l, r - 1);
                    break;
                }

                l++;
                r--;
            }
        }
        return subString;
    }

}
