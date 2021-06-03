package challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] intArray, int num){
        int newArrayLength = (intArray.length + 1);
        System.out.println(newArrayLength);
        int index = (newArrayLength / 2);
        int[] newArray = new int[newArrayLength];
        System.out.println(index);
        for( int i =0; i < newArray.length; i++){
            if(i< index){
                newArray[i]=intArray[i];

            }else if(i== index){
                newArray[i] = num;
            }else{
                newArray[i] = intArray[i-1];
            }
            System.out.println(newArray[i]);

        }
        System.out.println(newArray);

        System.out.println("this is the middle");
        System.out.println(newArray[index]);

        return newArray;
    }





}