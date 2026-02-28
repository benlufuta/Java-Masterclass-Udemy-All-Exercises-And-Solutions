public class EvenDigitSum {
    
    public static int getEvenDigitSum(int number){
        
        if (number < 0){
            
            return -1;
        }
        
        int totalSum = 0;
        
        while (number != 0) {
            
            int digit = number % 10;
            
            if (digit % 2 == 0) {
                
                totalSum += digit;
                
            }
            number /= 10;
        }
        return totalSum;
    }
}