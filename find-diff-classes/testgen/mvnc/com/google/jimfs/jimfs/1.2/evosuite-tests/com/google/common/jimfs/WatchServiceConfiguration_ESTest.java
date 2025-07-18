/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 18:47:50 GMT 2024
 */

package com.google.common.jimfs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.jimfs.WatchServiceConfiguration;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WatchServiceConfiguration_ESTest extends WatchServiceConfiguration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        WatchServiceConfiguration.polling(0L, timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // interval (java.lang.Long@0000000002) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      WatchServiceConfiguration watchServiceConfiguration0 = WatchServiceConfiguration.polling(1642L, timeUnit0);
      assertNotNull(watchServiceConfiguration0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
      // Undeclared exception!
      try { 
        WatchServiceConfiguration.polling((-2447L), timeUnit0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // interval (java.lang.Long@0000000002) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        WatchServiceConfiguration.polling(2095L, (TimeUnit) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
