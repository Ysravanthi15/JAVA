// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String s=S1.concat(S2);
        return new StringBuilder(s).reverse().toString();
        
    }
}