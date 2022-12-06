package projectGradle.model;

public class GameEndModel{


	public static boolean easyGameEnd(boolean easyGame){
		return !easyGame;
	}
	
	public static boolean mediumGameEnd(boolean mediumGame){
		return !mediumGame;
	}
	
	public static boolean hardGameEnd(boolean hardGame){
		return !hardGame;
	}
	public static boolean endGame(boolean easyGame ,boolean hardGame ,boolean mediumGame){
		
		return (!easyGame & !hardGame & !mediumGame);
	}
}
