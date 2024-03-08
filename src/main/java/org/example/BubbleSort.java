import java.util.Arrays;

public class BubbleSort {
    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     *
     * @param nums An array of unsorted numbers.
     * @return A sorted array containing the values of nums.
     */
    public static int[] sortArray(int[] nums) {
        int n = nums.length;

        // Perform n-1 passes
        for (int i = 0; i < n - 1; i++) {
            // Flag to optimize if no swaps occur in a pass
            boolean swapped = false;

            // Compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap elements
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return nums;
    }

    /** Merge Sort algorithm, which has a time complexity of O(n log n).
     * Merge Sort is a divide-and-conquer algorithm that efficiently sorts an array by dividing it into
     * smaller subarrays, sorting them, and then merging them back together.*/
    public static int[] mergeSort(int[] nums) {
        if (nums.length <= 1) {
            return nums; // Base case: already sorted or empty array
        }

        // Divide the array into two halves
        int mid = nums.length / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        System.arraycopy(nums, 0, left, 0, mid);
        System.arraycopy(nums, mid, right, 0, nums.length - mid);

        // Recursively sort each half
        left = sortArray(left);
        right = sortArray(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Helper method to merge two sorted arrays
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }


    public static void main(String[] args) {
        BubbleSort b1 = new BubbleSort();
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Initial Array: " + Arrays.toString(unsortedArray));

        int[] sortedArrayBubble = sortArray(unsortedArray);
        System.out.println("Bubble Sort: " + Arrays.toString(sortedArrayBubble));

        int[] sortedArrayMerge = mergeSort(unsortedArray);
        System.out.println("Merge Sort: " + Arrays.toString(sortedArrayMerge));

    }
}