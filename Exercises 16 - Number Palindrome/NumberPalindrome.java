public class NumberPalindrome {
    
    public static boolean isPalindrome (int number){
        
        int tempNum = number;
        int reversed = 0;
        
        while (tempNum != 0) {
            
            reversed = reversed * 10 + (tempNum % 10);
            tempNum = tempNum / 10;
            
        }
        return reversed == number;
    }
    
    /*Another Approach:
    
        public static boolean isPalindrome(int number) {
            
            int reverse = 0;
            
            for (int i = number; i != 0; i /= 10) {
            
            reverse = reverse*10 + i%10;
            
            }
            return reverse == number;
        }
    */
}