
public class JavaMethods {

	public static void main(String[] args) {
	
		
		
		int levelCompleted = 500;
		calculateScore(true, 800,  700 , 100);
		
		calculateScore(true, 800,  1000 , 100);
		
		

	}	
	
public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
			
	int finalScore = score;
	if(gameOver) {
		finalScore += (levelCompleted * bonus);
				finalScore += 1000;
					System.out.println("Final score: " + finalScore);
	}
	
		
	}

}
