import java.util.*;
class secondLargestTwoPassSearch{

    public static int getSecondLargest(int[] arr){
        int largest=-1, second_largest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args){
        int[] arr={34,67,78,32,11,45};

        System.out.print(getSecondLargest(arr));
    }
}