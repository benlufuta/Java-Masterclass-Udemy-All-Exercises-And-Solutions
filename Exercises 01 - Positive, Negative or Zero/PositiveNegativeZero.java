public class PositiveNegativeZero {
    
    public static void checkNumber(int number){
      
     //1st Approach: 
     String numType = number > 0 ? "positive" : number < 0 ? "negative" : "zero";
	 
     System.out.println(numType);
     
     //2n Approach
     /*if (number > 0) {
         
         System.out.println("positive");
         
     } else if (number < 0){
         
        System.out.println("negative");
        
     } else {
         
         System.out.println("zero");
     }*/
     
    }
}