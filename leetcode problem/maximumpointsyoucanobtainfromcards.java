class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int windowSize = n - k;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cardPoints[i];
        }

        if (windowSize == 0) {
            return sum;
        }

        int left = 0;
        int windowSum = 0;
        int minWindowSum = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {

            windowSum += cardPoints[right];

            if (right - left + 1 > windowSize) {
                windowSum -= cardPoints[left];
                left++;
            }

            if (right - left + 1 == windowSize) {
                minWindowSum = Math.min(minWindowSum, windowSum);
            }
        }

        return sum - minWindowSum;
    }
}