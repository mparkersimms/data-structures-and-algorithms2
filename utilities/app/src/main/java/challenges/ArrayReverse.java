package challenges;

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
    public static void reverseTwo(){
        int[] var1 = new int[]{0, 1, 1, 2, 3, 5, 8, 13};
        int[] var2 = new int[8];

        int var3;
        for(var3 = 0; var3 < var1.length; ++var3) {
            int var4 = var1.length - var3 - 1;
            var2[var4] = var1[var3];
        }

        for(var3 = 0; var3 < var2.length; ++var3) {
            System.out.println(var2[var3]);
        }
    }
}