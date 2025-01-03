

public class MissingNumber{
  
    
  
    static int missingNumber(int[] arr){
        int n = arr.length;
        int sum =0;
        int largest = arr[0];
        for(int i=0;i<n;i++){
            sum += arr[i]; 
        }
        
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        
        int son = largest * (largest+1)/2;
        
        return son-sum;
        
        
        
    }
   
       
      
    public static void main(String[] args){
        
        
        int [] arr = {1,3,4,6,7,5};
        
        System.out.println(missingNumber(arr));
        
    }
}
