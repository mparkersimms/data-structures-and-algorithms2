package utilities.blogChallenges;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> mergeSortArrayRecursive(ArrayList<Integer> arr){
        int n = arr.size();
        ArrayList<Integer> newArrayList = new ArrayList<>();
        ArrayList<Integer> leftArr = new ArrayList<>();
        ArrayList<Integer> rightArr = new ArrayList<>();
        System.out.println("n = " + n);
        if(n > 1) {
            int mid = n / 2;
            for (int i = 0; i < mid; i++) {
                leftArr.add(arr.get(i));
                System.out.println("leftArr = " + leftArr);
            }
            for (int j = mid; j < n; j++) {
                rightArr.add(arr.get(j));
                System.out.println("rightArr = " + rightArr);
            }
            mergeSortArrayRecursive(leftArr);
            mergeSortArrayRecursive(rightArr);
            newArrayList.addAll(arrayMerge(leftArr, rightArr, arr));
        }
        return newArrayList;
    }

    public ArrayList<Integer> arrayMerge(ArrayList<Integer> leftArr, ArrayList<Integer> rightArr, ArrayList<Integer> arr ) {
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < leftArr.size() && j < rightArr.size()){
            if(leftArr.get(i) < rightArr.get(j)){
                arr.set(k, leftArr.get(i));
                i++;
                k++;
            }else{
                arr.set(k, rightArr.get(j));
                j++;
                k++;
            }
        }
        while(j < rightArr.size()){
            arr.set(k, rightArr.get(j));
            j++;
            k++;
        }
        while(i < leftArr.size()){
            arr.set(k, leftArr.get(i));
            i++;
            k++;
        }
        return arr;

    }
}
