/* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r */
import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;
        while (i < w1.length && j < w2.length) {
            result.append(w1[i++]);// result.append(w1.charAt(i++)); only if not converted to char array globally.
            result.append(w2[j++]);// result.append(w2.charAt(j++));
        }

        while (i < w1.length) {
            result.append(w1[i++]);
        }

        while (j < w2.length) {
            result.append(w2[j++]);
        }

        return result.toString();
    }
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("word1: ");
        String word1=sc.nextLine();
        System.out.print("word2: ");
        String word2=sc.nextLine();
        System.out.println(mergeAlternately(word1,word2));
    }
}
