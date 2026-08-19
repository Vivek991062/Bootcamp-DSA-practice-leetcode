class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int left = 1;
        int right = 0;

        // Find maximum number
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (isPossible(nums, threshold, mid)) {
                // mid works → try smaller divisor
                right = mid;
            } else {
                // mid doesn't work → need bigger divisor
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean isPossible(int[] nums, int threshold, int divisor) {

        int sum = 0;

        for (int num : nums) {

            sum += (num + divisor - 1) / divisor;

            if (sum > threshold) {
                return false;
            }
        }

        return true;
    }
}