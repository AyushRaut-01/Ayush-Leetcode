class Solution {
    public boolean uniformArray(int[] nums1) {
 boolean hasOdd = false;
        boolean hasEven = false;
        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int num : nums1) {
            if (num % 2 == 0) {
                hasEven = true;
                minEven = Math.min(minEven, num);
            } else {
                hasOdd = true;
                minOdd = Math.min(minOdd, num);
            }
        }

        // Already uniform parity
        if (!hasOdd || !hasEven) {
            return true;
        }

        // Need an odd number smaller than every even number.
        return minOdd < minEven;
    }
}