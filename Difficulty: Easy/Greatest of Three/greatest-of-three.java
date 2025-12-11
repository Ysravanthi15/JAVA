// User function Template for Java
import java.util.*;
class Solution {

    public static int find_greatest_number(int a, int b, int c) {
        // Write your code here..
        if(a>b){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}