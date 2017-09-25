package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
        
  public void testNegative() {
		
		String[] s= {"star", "planet", "sky", "earth"};
		App a= new App();
		String temp=s[1];
		a.change(s,1,-3);
		assertFalse(!temp.equals(s[1])); }
	
	public void testBigNum() {
		
		String[] s= {"star", "planet", "sky", "earth"};
		App a= new App();
		String temp=s[1];
		a.change(s,1,20);
		assertFalse(!temp.equals(s[1])); }
	
	public void testAp() {
		
		String[] s= {"star", "planet", "sky", "earth"};
		App a= new App();
		String temp=s[1];
		a.change(s,1,3);
		assertFalse(temp.equals(s[1])); }
	
}
