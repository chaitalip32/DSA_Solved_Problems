import java.util.*;
public class mergeTwoSortedArraysinSingleArrayinSingleArray {
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int i;
        int sortArray_size=arr1.length+arr2.length;
        int[] sortArray=new int[sortArray_size];

        for(i=0;i<arr1.length;i++){
            sortArray[i]=arr1[i];
        }

        for(i=0;i<arr2.length;i++){
            sortArray[arr1.length+i]=arr2[i];
        }

        System.out.println(Arrays.toString(sortArray));
    }
}
