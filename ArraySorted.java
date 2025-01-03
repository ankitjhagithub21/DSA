

public class ArraySorted{
    
    
    static boolean isArraySorted(int[] arr){
        int n = arr.length;
        
        for(int i = 0;i < n-1;i++){
            if(arr[i+1] < arr[i] ){
                return false;
            }    
        }
        return true;
        
    }
   
       
      
    public static void main(String[] args){
        
        
        int [] arr = {1,2,4,3};
       
       System.out.println(isArraySorted(arr));
        
    }
}
