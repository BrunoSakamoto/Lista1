public class Main {
    public static int binarySearch(int[] array, int target, int left, int right) {
        if (left > right) {
            return -1; // Element not found
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return mid;
        }
        if (array[mid] < target) {
            return binarySearch(array, target, mid + 1, right);
        } else {
            return binarySearch(array, target, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = binarySearch(array, target, 0, array.length - 1);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
