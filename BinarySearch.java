

public class BinarySearch{
    
    static int binarySearch(int[] arr, int target){
        
        int n = arr.length;
        int left = 0;
        int right = n-1;
        
        
       while(left<=right){
         int mid = (left+right)/2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target ){
            right = mid-1;
        }else{
            left = mid+1;
        }
        
        
       }
       
        return -1;
            
        
    }
    public static void main(String[] args){
        
        
        int [] arr = {1,2,3,4};
        int target = 2;
        int index = binarySearch(arr,target);
        if(index == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index :"+index);
        }
        
    }
}
