public class PlayingCat {
    
    public static boolean isCatPlaying(boolean summer, int temperature){
        
        return (summer & (temperature >= 25 && temperature <= 45)) || (!summer & (temperature >= 25 && temperature <= 35));
        
        //Better Alternative using terinary
        //return temperature >= 25 && temperature <= (summer ? 45 : 35);
    }
}