public class BarkingDog {
     
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        
        //First Approach:
        return (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23));
        
        //Second Approach: Better and Cleaner.
        /*// validate hour first
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // then the core condition
        return barking && (hourOfDay < 8 || hourOfDay > 22);*/
    }
}