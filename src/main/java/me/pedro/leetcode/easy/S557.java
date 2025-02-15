package me.pedro.leetcode.easy;


public class S557 {
    public static void main(String[] args) {

        String reverseWords = reverseWords("Let's take LeetCode contest");

        String outputExpected = "s'teL ekat edoCteeL tsetnoc";

        System.out.println(reverseWords);
        System.out.println(outputExpected);

    }

    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = 0;
        int rigthCopy = 0;

        while (right < charArray.length) {
            if (charArray[right] != ' ' && right != charArray.length - 1) {
                right ++;
                rigthCopy++;
            } else {
                if (right == charArray.length - 1) {
                    right++;
                    rigthCopy++;
                }
                char leftChar = charArray[left];
                char rightChar = charArray[right - 1];
                charArray[left] = rightChar;
                charArray[right - 1] = leftChar;
                left++;
                rigthCopy--;
                while (left != right && rigthCopy > left) {
                    leftChar = charArray[left];
                    rightChar = charArray[rigthCopy - 1];
                    charArray[left] = rightChar;
                    charArray[rigthCopy - 1] = leftChar;
                    rigthCopy--;
                    left++;
                }
                right++;
                left = right;
                rigthCopy = right;
            }
        }
        return String.valueOf(charArray);
    }
}
