package com.quest.all;

/**
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 */
public class MergeTwoStrings {
    public static void main(String[] args) {
        String word1 = "apr";
        String word2 = "srt";
        mergeStrings(word1, word2);
    }

    private static void mergeStrings(String e1, String e2) {
        var l1 = e1.length();
        var l2 = e2.length();
        var builder = new StringBuilder();
        int i = 0;
        while (l1 > i || l2 > i) {
            if (l1 > i) builder.append(e1.charAt(i));
            if (l2 > i) builder.append(e2.charAt(i));
            i++;
        }
        System.out.println(builder);
    }
}
