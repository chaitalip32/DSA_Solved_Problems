import java.util.*;
class Main {
    
    public static int getlargest(int[] arr){
        int second_largest=0;
        int largest=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
            }
            if(arr[i]<largest && arr[i]>second_largest){
                second_largest=arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        
        int[] arr={45,23,56,43,67,45,23,87};
        System.out.print(getlargest(arr));
    }
}