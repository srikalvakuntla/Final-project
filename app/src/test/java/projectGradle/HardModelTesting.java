package projectGradle.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class HardModelTesting{
	
	// testing if we get the degrees 
    @Test 
    public void hardDegreeTest() {
        HardModel h = new HardModel();
		assertNotNull("it should return the arraylist of degrees", h.hardDegree());
    }
    
    // checking the length of the arraylist
    @Test 
    public void hardDegreeTestSize() {
        HardModel h = new HardModel();
		assertEquals("size of the array is 15",h.hardDegree().size(),15);
    }
	
	// checking the degree is 90 of the arraylist
     @Test 
    public void hardDegreeTest90Degrees() {
        HardModel h = new HardModel();
		assertEquals("check if the degree is 90 degrees ",h.hardDegree().get(6),90);
    }
    
    // checking the degree is 0 of the arraylist
     @Test 
    public void hardDegreeTest0Degrees() {
        HardModel h = new HardModel();
		assertEquals("check if the degrees is 0 ",h.hardDegree().get(4),0);
    }
    
    // check if we get the boolean arraylist
    @Test
    public void hardBooleanTest(){
		HardModel h = new HardModel();
		assertNotNull("it should return the arraylist of booleans", h.hardBoolean());
	}
	
	// check if we get the boolean true 
    @Test
    public void hardBooleanTestTrue(){
		HardModel h = new HardModel();
		assertEquals("it should return the booleans true", h.hardBoolean().get(4),true);
	}
	
	// check if we get the boolean false 
    @Test
    public void hardBooleanTestFalse(){
		HardModel h = new HardModel();
		assertEquals("it should return the booleans false", h.hardBoolean().get(3),false);
	}
    
    // check if get the imageIcons ArrayList
    @Test
    public void hardImageIconTest(){
		HardModel h = new HardModel();
		assertNotNull("get the image icon arraylist", h.hardImageIcon());
	}
}
