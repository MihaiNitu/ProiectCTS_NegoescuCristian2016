package Teste;

import Clase.Furnizor;
import Clase.Model;
import Clase.incorectException;
import java.io.IOException;
import junit.framework.TestCase;

public class Teste extends TestCase  {
	public Teste(String string) {
		super(string);
	}
	
	
	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("Before");
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("After");
	}
	
	@Test
	public void test_metoda1() throws incorectException{
		Model m=new Model();
		m.setTip("Cutezator");
		assertEquals("Cutezator",m.getTip());
	}
	
	
	@Test
	public void test_metoda2() throws incorectException{
		Model m=new Model();
		m.setTip("Cutezator");
		assertEquals("Cutezator",m.getTip());
	}
	
	@Test
	public void test_metoda3() throws incorectException{
		Model m=new Model();
		m.setTip("Cutezator");
		assertEquals("Cutezator",m.getTip());
	}
	
	@Test
	public void test_metoda4() throws incorectException{
		Model m=new Model();
		assertNotNull(m); 
	}
	
	@Test
	public void test_metoda5() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		assertTrue(f.getId()==1234);
	}

	@Test
	public void test_metoda6() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		assertFalse(f.getId()!= 1234);
	}
	

	@Test
	public void test_metoda7() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		assertFalse(f.getAdresa()=="Baneasa");
	}
	

	@Test
	public void test_metoda8() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		Furnizor f1= Furnizor.PreiaInstanta();
		assertEquals(f,f1);
	}
	
	@Test
	public void test_metoda9() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		assertEquals(f.getAdresa(),"Piata Romana nr 9");
	}
	
	@Test
	public void test_metoda10() throws incorectException{
		Furnizor f= Furnizor.PreiaInstanta();
		assertEquals(f.getId(),1234);
	}
	
	
}
