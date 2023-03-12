
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradeBookTest {
private GradeBook G1;
private GradeBook G2;
	
@BeforeEach
	void setUp() throws Exception 
	{
		/*1.In the setUp method of GradebookTester,
		create at least two objects of Gradebook to hold 5 scores. */ 
		
		G1 = new GradeBook(5);
			G1.addScore(20);
			G1.addScore(80);
		G2 =new GradeBook(5);
			G2.addScore(65);
			G2.addScore(40);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		G1 = null;
		G2=null;
	}

	@Test
	void addScoreTest() {
		assertTrue(G1.toString().equals("20.0 80.0 "));
		assertTrue(G2.toString().equals("65.0 40.0 "));
		
	}
	
	
	@Test
	void minimumTest() {
		assertEquals(20, G1.minimum(), 0.001);
		assertEquals(40, G2.minimum(), 0.001);
		
	}
	@Test
	void SumTest()
	{
		assertEquals(100, G1.sum(),0.001);
		assertEquals(105, G2.sum(),0.001);
		
	}
	@Test
	void finalScoreTest()
	{
		assertEquals(80, G1.finalScore(),0.001);
		assertEquals(65, G2.finalScore(),0.001);
		
	}
	 
}
