package utilities.blogChallenges;


import java.util.ArrayList;

public class InsertSort {

    public ArrayList insertSortArray(ArrayList<Integer> arr){
        for(int i = 1; i < arr.size(); i ++){
            int j = i - 1;
            int temp = arr.get(i);

            while(j >= 0 && temp < arr.get(j)){
                System.out.println("temp = " + temp);
                System.out.println("arr[j] = " + arr.get(j));
                arr.set(j + 1, arr.get(j));
                j = j-1;

            }
            arr.set(j+1, temp);
        }
        return arr;
    }
}
