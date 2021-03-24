package challenges2;

public class ArrayReverse {
    public static void main(String[] args){

       int[] numbers = {0,1,1,2,3,5,8,13};
       int[] newArr;
       newArr = new int[8];
       for(int i = 0; i < numbers.length; i++){
           int j = numbers.length-i-1;
           newArr[j] = numbers[i];
       }
       for(int i = 0; i < newArr.length; i++){
           System.out.println(newArr[i]);
       }
    }
}