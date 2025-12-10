// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        int x = 0;
        for (char c : s1.toCharArray()) x ^= c;
        for (char c : s2.toCharArray()) x ^= c;
        
        return (char)x;
        
        
    }
}
