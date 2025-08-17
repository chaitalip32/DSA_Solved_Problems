import java.util.stream.*;

public class missingNumberInSeries {

    static int missingNum(int[] arr, int n) {
        int minNum = IntStream.of(arr).min().getAsInt();
        int arrSum = IntStream.of(arr).sum();
        int rangeSum = (minNum + minNum + n) * (n + 1) / 2;

        return rangeSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = { 13, 11, 12, 15 };

        int n = arr.length;
        System.out.println("Missing number is " + missingNum(arr, n));
    }
}
