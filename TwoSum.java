

public class TwoSum{
    
    
  
    static boolean twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
                
            }
        }
        return false;
    }
   
       
      
    public static void main(String[] args){
        
        
        int [] arr = {1,2,4,3};
        int target = 11;
        System.out.println(twoSum(arr,target));
        
    }
}
