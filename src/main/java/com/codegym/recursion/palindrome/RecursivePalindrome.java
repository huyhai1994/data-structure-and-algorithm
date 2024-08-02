package com.codegym.recursion.palindrome;

public class RecursivePalindrome {

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println("Is moon a palindrome? " + isPalindrome("moon", 0, "moon".length() - 1));
    }
}
