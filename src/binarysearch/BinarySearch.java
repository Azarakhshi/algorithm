package binarysearch;

public class BinarySearch {

    public int binarySearch(int number, int[] array) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (number == array[mid]) {
                return array[mid];
            } else if (number < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return 0;

    }

}
