/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 08 03:40:17 GMT 2024
 */

package io.restassured.assertion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import groovy.lang.MissingMethodException;
import io.restassured.assertion.StreamVerifier;
import io.restassured.internal.ResponseParserRegistrar;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.internal.path.xml.XMLAssertion;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StreamVerifier_ESTest extends StreamVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      RestAssuredResponseImpl restAssuredResponseImpl0 = new RestAssuredResponseImpl();
      restAssuredResponseImpl0.setContentType(restAssuredResponseImpl0);
      // Undeclared exception!
      try { 
        StreamVerifier.newAssertion(restAssuredResponseImpl0, restAssuredResponseImpl0, responseParserRegistrar0);
        fail("Expecting exception: MissingMethodException");
      
      } catch(MissingMethodException e) {
         //
         // No signature of method: static org.apache.commons.lang3.StringUtils.isBlank() is applicable for argument types: (io.restassured.internal.RestAssuredResponseImpl) values: [io.restassured.internal.RestAssuredResponseImpl@1]
         // Possible solutions: isBlank(java.lang.CharSequence), isAllBlank([Ljava.lang.CharSequence;), isAnyBlank([Ljava.lang.CharSequence;), isNotBlank(java.lang.CharSequence), isAlpha(java.lang.CharSequence), isNoneBlank([Ljava.lang.CharSequence;)
         //
         verifyException("groovy.lang.MetaClassImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      Parser parser0 = Parser.TEXT;
      responseParserRegistrar0.registerDefaultParser(parser0);
      RestAssuredResponseImpl restAssuredResponseImpl0 = new RestAssuredResponseImpl();
      Object object0 = StreamVerifier.newAssertion(restAssuredResponseImpl0, restAssuredResponseImpl0, responseParserRegistrar0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamVerifier.newAssertion((Response) null, (Object) null, (ResponseParserRegistrar) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method getContentType() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        StreamVerifier.createAssertionForCustomParser((ResponseParserRegistrar) null, "/G;mr!", (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method getNonDefaultParser() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      RestAssuredResponseImpl restAssuredResponseImpl0 = new RestAssuredResponseImpl();
      Parser parser0 = Parser.HTML;
      responseParserRegistrar0.registerDefaultParser(parser0);
      Object object0 = StreamVerifier.createAssertionForCustomParser(responseParserRegistrar0, "T_SHORT", restAssuredResponseImpl0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      Parser parser0 = Parser.XML;
      responseParserRegistrar0.registerDefaultParser(parser0);
      XMLAssertion xMLAssertion0 = (XMLAssertion)StreamVerifier.createAssertionForCustomParser(responseParserRegistrar0, "Type meta-data for this Type (", (Object) null);
      assertNull(xMLAssertion0.getKey());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      Parser parser0 = Parser.JSON;
      responseParserRegistrar0.registerDefaultParser(parser0);
      Object object0 = StreamVerifier.createAssertionForCustomParser(responseParserRegistrar0, "Expected response body to be verified as JSON, HTML or XML but content-type '", responseParserRegistrar0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      Object object0 = StreamVerifier.createAssertionForCustomParser(responseParserRegistrar0, "binary", responseParserRegistrar0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      Parser parser0 = Parser.XML;
      responseParserRegistrar0.registerDefaultParser(parser0);
      RestAssuredResponseImpl restAssuredResponseImpl0 = new RestAssuredResponseImpl();
      Object object0 = StreamVerifier.newAssertion(restAssuredResponseImpl0, responseParserRegistrar0, responseParserRegistrar0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ResponseParserRegistrar responseParserRegistrar0 = new ResponseParserRegistrar();
      RestAssuredResponseImpl restAssuredResponseImpl0 = new RestAssuredResponseImpl();
      // Undeclared exception!
      try { 
        StreamVerifier.newAssertion(restAssuredResponseImpl0, restAssuredResponseImpl0, responseParserRegistrar0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StreamVerifier streamVerifier0 = new StreamVerifier();
  }
}
