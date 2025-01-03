

class LinearSearch{
    
    static int linearSearch(int[] arr, int target){
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
            
        
    }
    public static void main(String[] args){
        
        
        int [] arr = {3,1,2,4};
        int target = 5;
        int index = linearSearch(arr,target);
        if(index == -1){
            System.out.println("Element not found.");
        }else{
            System.out.println("Element found at index :"+index);
        }
        
    }
}
