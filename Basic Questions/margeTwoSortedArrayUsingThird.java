
import java.util.Arrays;

public class margeTwoSortedArrayUsingThird {
    public static void mergeArray(int[] arr1, int[] arr2, int n, int m) {
        int left = 0;
        int right = 0;
        int index = 0;
        int[] arr3 = new int[n + m];

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                index++;
                right++;
            }
        }

        while (left < n) {
            arr3[index++] = arr1[left++];
        }
        while (right < m) {
            arr3[index++] = arr2[right++];
        }
        for (int i = 0; i < n + m; i++) {
            if (i < n) {
                arr1[i] = arr3[i];
            } else {
                arr2[i - n] = arr3[i];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 0, 2, 6, 8, 9 };
        int n = arr1.length;
        int m = arr2.length;
        mergeArray(arr1, arr2, n, m);
    }
}
