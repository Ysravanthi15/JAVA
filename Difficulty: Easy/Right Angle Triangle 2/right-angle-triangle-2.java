// User function Template for Java
class Solution {
    public static void triangle(int s) {

        // Write your code here
       for (int i = 1; i <= s; i++) {

            if (i == 1) {
                System.out.println("*");
            }
            else if (i == s) {
                for (int j = 1; j <= s; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                System.out.print("* ");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
        }
    }
}