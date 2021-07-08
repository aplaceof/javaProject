package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Test Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 2, 2021</pre> 
* @version 1.0 
*/ 
public class TestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(int a, int b) 
* 
*/

@Test
public void testAdd() throws Exception {
    int a = 1;

    int b = 2;
    TT tt = new TT();
    int res = tt.add( a,b);
    Assert.assertEquals(res, 3);
    a = 3 ;
    res = tt.add(a, b);
//    Assert.assertEquals(res, 3);
//TODO: Test goes here...
} 

/** 
* 
* Method: main(String [] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
