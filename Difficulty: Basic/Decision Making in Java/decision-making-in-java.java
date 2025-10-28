// User function Template for Java
class Solution {
    public static String compareNM(int n, int m) {
        // code here
        if(n<m){
            String l="lesser";
            return l;
        }
        else if(n>m){
            String g="greater";
            return g;
        }
        else{
            String e="equal";
            return e;
        }
    }
}