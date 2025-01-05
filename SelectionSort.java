
class SelectionSort {
     public static void selectionSort(int[] arr) {  
        int n = arr.length;  
  
        // Iterate through the array  
        for (int i = 0; i < n - 1; i++) {  
            // Find the index of the minimum element in the unsorted portion of the array  
            int minIndex = i;  
            // Search for the minimum element in the unsorted portion  
            
            for (int j = i + 1; j < n; j++) {  
                if (arr[j] < arr[minIndex]) {  
                    minIndex = j;  
                }  
            }  
            // Swap the found minimum element with the first element of the unsorted portion  
            int temp = arr[minIndex];  
            arr[minIndex] = arr[i];  
            arr[i] = temp;  
        }  
    }  
    
    
    
    public static void main(String[] args) {
        int[] arr = {24,5,12,78,90};
        
        selectionSort(arr);
        
        for(int num : arr){
            System.out.print(num+" ");
        }
        
    }
}
