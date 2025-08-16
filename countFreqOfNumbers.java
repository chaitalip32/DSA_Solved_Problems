public class countFreqOfNumbers {
    
    public static void main(String[] args){
        int[] arr={10,20,70,70,10,30,70};

        int target,i,j,count;
        for(i=0;i<arr.length;i++){
            target=arr[i];
            count=0;
            if(target==-1)
                continue;
            for(j=0;j<arr.length;j++){
                if(arr[j]==target){
                   ++count;
                   arr[j]=-1;
                }
            }
            System.out.println("Freq of "+target+" is "+count);
        }
    }
}
