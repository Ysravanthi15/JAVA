// User function Template for Java
class Solution {
    public static int LCM(int a, int b) {

        // write your code here
        int x=a,y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        return(a*b)/gcd;

        // return LCM of a and b
    }
}