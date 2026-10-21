package Top75problem.BinarySearch;
public class FindPeakEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if ((m == 0 || arr[m - 1] < arr[m]) && (m == n - 1 || arr[m] > arr[m + 1])) {
                return m;
            } else if (m == 0 || arr[m - 1] > arr[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return 1;

    }
}
