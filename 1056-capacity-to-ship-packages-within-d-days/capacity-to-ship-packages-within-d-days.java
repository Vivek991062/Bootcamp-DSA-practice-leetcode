class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        // Minimum capacity = heaviest package
        // Maximum capacity = total weight
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canShip(weights, days, mid)) {
                // mid works, so try smaller capacity
                right = mid;
            } else {
                // mid doesn't work, need bigger capacity
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int daysUsed = 1;
        int currentWeight = 0;

        for (int weight : weights) {

            if (currentWeight + weight > capacity) {
                daysUsed++;
                currentWeight = 0;
            }

            currentWeight += weight;

            if (daysUsed > days) {
                return false;
            }
        }

        return true;
    }
}