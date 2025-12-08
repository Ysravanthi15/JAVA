// User function template for Java

class Solution {
    static String delAlternate(String S) {
        // code here
        char ch[]=S.toCharArray();
        int newLen = (ch.length + 1) / 2; // count even indices
        char[] newArr = new char[newLen];
        int j=0;
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                newArr[j++]=ch[i];
                
            }
        }
        return new String(newArr);
    }
}