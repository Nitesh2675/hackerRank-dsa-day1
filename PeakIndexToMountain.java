public class PeakIndexToMountain {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            return binarySearch(arr, 0, arr.length - 1);
        }
        private int binarySearch(int[] arr, int low, int high) {
            if (low == high) {
                return low;
            }
            int mid = low + (high - low) / 2;
            if (arr[mid] < arr[mid + 1]) {
                return binarySearch(arr, mid + 1, high);
            } else {
                return binarySearch(arr, low, mid);
            }
        }
    }

}
