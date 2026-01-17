public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber){
        
        return (int) (firstNumber * 1000) == (int)(secondNumber * 1000);
        
        //Alternative Approach using Math class.
        //return Math.abs(num1*1000 - num2*1000) < 1;
        
    }
}