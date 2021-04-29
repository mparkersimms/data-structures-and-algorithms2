package utilities.blogChallengeTester;

import org.junit.Test;
import utilities.FizzBuzzTree;
import utilities.blogChallenges.InsertSort;
import utilities.blogChallenges.MergeSort;
import utilities.blogChallenges.QuickSort;
import utilities.tree.BinarySearchTree;
import utilities.tree.Node;
import utilities.tree.Tree;
import org.junit.*;
import static org.junit.Assert.*;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class BlogChallengeTester {

    @Test public void insertSortedArrayTester(){
        InsertSort insertSort = new InsertSort();
        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(8, 4, 23, 42, 16, 15));
        ArrayList actual = insertSort.insertSortArray(newArray);
        System.out.println(actual);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 8, 15, 16, 23, 42));

       assertArrayEquals(expected.toArray(), actual.toArray());


//  Reversed Array Test

        ArrayList<Integer> newArray2 = new ArrayList<Integer>(Arrays.asList(20,18,12,8,5,-2));
        ArrayList actual2 = insertSort.insertSortArray(newArray2);
        ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(-2,5,8,12,18,20));
        System.out.println(actual2);

        assertArrayEquals(expected2.toArray(), actual2.toArray());

//        Duplicates Array Test

        ArrayList<Integer> newArray3 = new ArrayList<Integer>(Arrays.asList(5,12,7,5,5,7));
        ArrayList actual3 = insertSort.insertSortArray(newArray3);
        ArrayList<Integer> expected3 = new ArrayList<Integer>(Arrays.asList(5,5,5,7,7,12));
        System.out.println(actual3);

        assertArrayEquals(expected3.toArray(), actual3.toArray());

//        Nearly sorted Array test


        ArrayList<Integer> newArray4 = new ArrayList<Integer>(Arrays.asList(2,3,5,7,13,11));
        ArrayList actual4 = insertSort.insertSortArray(newArray4);
        ArrayList<Integer> expected4 = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13));
        System.out.println(actual4);

        assertArrayEquals(expected4.toArray(), actual4.toArray());

    }

    @Test
    public void mergeSortTester(){
        MergeSort mergeSort = new MergeSort();
        ArrayList<Integer> newArray = new ArrayList<Integer>(Arrays.asList(8, 4, 23, 42, 16, 15));
        ArrayList actual = mergeSort.mergeSortArrayRecursive(newArray);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4, 8, 15, 16, 23, 42));

        System.out.println(mergeSort.mergeSortArrayRecursive(newArray));
        assertArrayEquals(expected.toArray(), actual.toArray());


        //  Reversed Array Test

        ArrayList<Integer> newArray2 = new ArrayList<Integer>(Arrays.asList(20,18,12,8,5,-2));
        ArrayList actual2 = mergeSort.mergeSortArrayRecursive(newArray2);
        ArrayList<Integer> expected2 = new ArrayList<Integer>(Arrays.asList(-2,5,8,12,18,20));
        System.out.println(actual2);

        assertArrayEquals(expected2.toArray(), actual2.toArray());

//        Duplicates Array Test

        ArrayList<Integer> newArray3 = new ArrayList<Integer>(Arrays.asList(5,12,7,5,5,7));
        ArrayList actual3 = mergeSort.mergeSortArrayRecursive(newArray3);
        ArrayList<Integer> expected3 = new ArrayList<Integer>(Arrays.asList(5,5,5,7,7,12));
        System.out.println(actual3);

        assertArrayEquals(expected3.toArray(), actual3.toArray());

//        Nearly sorted Array test


        ArrayList<Integer> newArray4 = new ArrayList<Integer>(Arrays.asList(2,3,5,7,13,11));
        ArrayList actual4 = mergeSort.mergeSortArrayRecursive(newArray4);
        ArrayList<Integer> expected4 = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13));
        System.out.println(actual4);

        assertArrayEquals(expected4.toArray(), actual4.toArray());
    }

    @Test
    public void quickSortTester(){
        int arr[]={8,4,23,42,16,15};
        int left = 0;
        int right = arr.length -1;
        QuickSort quickSortClass = new QuickSort();
        int actual[] = quickSortClass.quickSort(arr, left, right);
        System.out.println(Arrays.toString(arr));
        int expected[] = {4,8,15,16,23,42};
        assertArrayEquals(expected, actual);

        int arr2[] = {20,18,12,8,5,-2};
        int actual2[] = quickSortClass.quickSort(arr2, left, right);
        int expected2[] = {-2,5,8,12,18,20};
        System.out.println(Arrays.toString(actual2));
        assertArrayEquals(expected2, actual2);

        int arr3[] = {5,12,7,5,5,7};
        int actual3[] = quickSortClass.quickSort(arr3, left, right);
        int expected3[] = {5,5,5,7,7,12};
        System.out.println(Arrays.toString(actual3));
        assertArrayEquals(expected3, actual3);

        int arr4[] = {2,3,5,7,13,11};
        int actual4[] = quickSortClass.quickSort(arr4, left, right);
        int expected4[] = {2,3,5,7,11,13};
        System.out.println(Arrays.toString(actual4));
        assertArrayEquals(expected4, actual4);
    }


}
