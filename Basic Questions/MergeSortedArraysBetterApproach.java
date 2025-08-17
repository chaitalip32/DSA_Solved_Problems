import java.util.Arrays;

public class MergeSortedArraysBetterApproach{

    public static void mergeSortedArrays(int[] arr1,int[] arr2,int n, int m){
        int temp=0;
        int left=n-1;
        int right=0;

        while(left>=0 && right<m){
            if(arr1[left]>arr2[right])
            {
                temp= arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
            }
            left--;right++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Array 1: ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println("\nArray 2: ");
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr1={1,2,4,7};
        int[] arr2={5,6,8,9,10};
        int n=arr1.length;
        int m=arr2.length;
        mergeSortedArrays(arr1,arr2,n,m);
    }
}