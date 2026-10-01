package Top75problem;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int num[]= {1,2,3,4,5};
        System.out.println(isSorted(num));

    }
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
