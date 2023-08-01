import java.util.Arrays;
public class arraysort {
    public static void main(String args[]){
        int arr[]={2,5,6,4,8,9,1,3};
        //before sorting
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr, 0, 8);   //function used for sorting arrays
        //after sorting 
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    
}
