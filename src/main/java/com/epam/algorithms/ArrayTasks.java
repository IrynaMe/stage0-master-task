package com.epam.algorithms;



/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("wrong length");
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Wrong input");
        }
        int sum = 0;
        if (arr.length>0){
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }
    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int newLen = 0;
        for (int number : arr) {
            if (number > 0) {
                newLen++;
            }
        }
        int[] result = new int[newLen];
        int i = 0;
        for (int number : arr) {
            if (number > 0) {
                result[i++] = number;
            }
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        sortOuter(arr);
        for (int[] innerArray : arr) {
            sortInner(innerArray);
        }
        return arr;
    }
    private void sortOuter(int[][] arr) {
        int len = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (arr[i - 1].length > arr[i].length) {
                    int[] temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            len--;
        } while (swapped);
    }

    private void sortInner(int[] innerArray) {
        int len = innerArray.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < len; i++) {
                if (innerArray[i - 1] > innerArray[i]) {
                    int temp = innerArray[i - 1];
                    innerArray[i - 1] = innerArray[i];
                    innerArray[i] = temp;
                    swapped = true;
                }
            }
            len--;
        } while (swapped);
    }


}
