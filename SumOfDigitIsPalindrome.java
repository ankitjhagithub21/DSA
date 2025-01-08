

class Main {
    
    static int sumOfDigit(int n){
        int sum = 0;
        int rem=0;
        
        while(n>0){
            rem = n%10;
            sum += rem;
            n = n/10;
        }

           return sum;
        
    }
    
    static boolean isPalindrome(int n){
        int org = n;
        int rev=0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        
        if(org==rev){
            return true;
        }
        
        return false;
        
        
    }
    
    public static void main(String[] args) {
      
        int num = 65;
        
        int sum = sumOfDigit(num);
        
        System.out.println(isPalindrome(sum));
    
    }
}
