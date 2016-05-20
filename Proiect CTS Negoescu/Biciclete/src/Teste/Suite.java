package Teste;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
public class Suite extends TestCase {
	public static Test suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new Teste("test_metoda1"));
		suite.addTest(new Teste("test_metoda5"));
		suite.addTestSuite(Teste.class);
		
		return suite;
	}

}
