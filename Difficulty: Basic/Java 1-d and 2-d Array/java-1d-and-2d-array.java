class Complete {
    public static ArrayList<Integer> array(int a[][], int b[], int n) {
        // Complete the function
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];  
        }

        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(sum);
        res.add(max);

        return res;

    }
}
