
public class JavaMethods {

	public static void main(String[] args) {
	
		
		
		
		calculateScore(true, 800,  700 , 100);		
		
		
		System.out.println("Final score: " + calculateScore(true, 800,  1000 , 100));
		
		
	 } // Main method end



	
public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
			
	int finalScore = score;
	if(gameOver) {
		finalScore += (levelCompleted * bonus);
				finalScore += 1000;	} // If statement end	
	
	return finalScore;	
		
	} // Method end

} // Class end
