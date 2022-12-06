package projectGradle.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameEndTesting{

	//return false and easy game is ended
	@Test 
    public void easyGameEndTestfalse(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.easyGameEnd(true),false);
	}
	
	//return true and easy game is not ended
	@Test 
    public void easyGameEndTesttrue(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.easyGameEnd(false),true);
	}
	
	//return false and medium game is ended
	@Test 
    public void mediumGameEndTestfalse(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.mediumGameEnd(true),false);
	}
	
	//return true and medium game is not ended
	@Test 
    public void mediumGameEndTesttrue(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.mediumGameEnd(false),true);
	}
	
	//return false and hard game is ended
	@Test 
    public void hardGameEndTestfalse(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.hardGameEnd(true),false);
	}
	
	//return true and hard game is not ended
	@Test 
    public void hardGameEndTesttrue(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.hardGameEnd(false),true);
	}
	
	//return false and all the games or ended 
	@Test 
    public void endGameTestfalse(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.endGame(false,true,true),false);
	}
	
	//return true and no game finished
	@Test 
    public void endGameTesttrue(){
		GameEndModel g = new GameEndModel();
		assertEquals("inverts the boolean value",g.endGame(false,false,false),true);
	}
}
