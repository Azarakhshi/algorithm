import binarysearch.BinarySearch;


public class Main {
    public static void main(String[] args) {

        //binary search
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 5, 9, 10, 55, 59, 97, 102, 555, 1258};
        int number = 555;
        System.out.println("the number found with binary search { " + binarySearch.binarySearch(number, array) + " }");


    }
}