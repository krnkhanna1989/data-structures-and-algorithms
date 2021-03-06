package org.spituk.study.algorithms.sorting;

/**
 * The HelloWorld program implements an application that simply displays "Hello World!" to the standard output.
 *
 * @author Karan Khanna
 * @version 1.0
 * @since 12/9/2018
 */
public class BubbleSortTest {

    public static void main(String[] args) {
        int[] array = {2, 1, 5, 6, 19, 10, 7, 2};
        BubbleSort.sort(array);
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
