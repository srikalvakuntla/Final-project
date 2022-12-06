
package projectGradle.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class EasyModelTesting{
	
	// testing if we get the degrees 
    @Test 
    public void easyDegreeTest() {
        EasyModel e = new EasyModel();
		assertNotNull("it should return the arraylist of degrees", e.easyDegree());
    }
	
	// checking the length of the arraylist
    @Test 
    public void easyDegreeTestSize() {
        EasyModel e = new EasyModel();
		assertEquals("size of the array is 4",e.easyDegree().size(),4);
    }
    
	// checking the degree is 0 of the arraylist
     @Test 
    public void easyDegreeTest0Degrees() {
        EasyModel e = new EasyModel();
		assertEquals("check if the degrees is 0 ",e.easyDegree().get(2),0);
    }
    
    // check if we get the boolean arraylist
    @Test
    public void easyBooleanTest(){
		EasyModel e = new EasyModel();
		assertNotNull("it should return the arraylist of booleans", e.easyBoolean());
	}
	
	// check if we get the boolean true 
    @Test
    public void easyBooleanTestTrue(){
		EasyModel e = new EasyModel();
		assertEquals("it should return the booleans true", e.easyBoolean().get(0),true);
	}
	
	// check if we get the boolean false 
    @Test
    public void easyBooleanTestFalse(){
		EasyModel e = new EasyModel();
		assertEquals("it should return the booleans false", e.easyBoolean().get(2),false);
	}
	
	// check if get the JLabel ArrayList
    @Test
    public void easyLableTest(){
		EasyModel e = new EasyModel();
		assertNotNull("get the image icon arraylist", e.easyLabel());
	}
	
}
