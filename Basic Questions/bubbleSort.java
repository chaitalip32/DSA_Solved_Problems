public class bubbleSort {
    public static void BubbleSort(int[] arr){
        int i,j,temp;
        boolean swapped;

        for(i=0;i<arr.length-1;i++){
            swapped=false;
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            if(swapped=false)
                break;
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] ars){
        int[] arr={5,1,6,3,8,4};
        BubbleSort(arr);
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
