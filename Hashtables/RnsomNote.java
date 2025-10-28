package Hashtables;

import java.util.HashMap;
import java.util.Scanner;

public class RnsomNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the magazine text:");
        String magazine = sc.next();
        System.out.println("Enter the ransomNote text:");
        String ransomNote = sc.next();
        Solution sol = new Solution();
        System.out.println("Is ransomNote can be constructed by using the letters from magazine?");
        Boolean b = sol.canConstruct( ransomNote, magazine); 
        System.out.println(b);
}
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransom = new HashMap<>();
        for(char c : magazine.toCharArray()){
            ransom.put(c,ransom.getOrDefault(c,0)+1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!ransom.containsKey(c) || ransom.get(c)==0) return false;
            ransom.put(c,ransom.get(c)-1);
        }
        return true;
    }
}  
