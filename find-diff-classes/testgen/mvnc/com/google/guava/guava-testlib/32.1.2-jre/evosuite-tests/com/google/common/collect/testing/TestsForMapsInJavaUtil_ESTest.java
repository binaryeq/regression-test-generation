/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:42:06 GMT 2024
 */

package com.google.common.collect.testing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.collect.testing.TestsForMapsInJavaUtil;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Comparator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TestsForMapsInJavaUtil_ESTest extends TestsForMapsInJavaUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForTreeMapWithComparator();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForHashMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForTreeMapNatural();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForConcurrentHashMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comparator<Object> comparator0 = TestsForMapsInJavaUtil.arbitraryNullFriendlyComparator();
      assertNotNull(comparator0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForCheckedMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForEnumMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForUnmodifiableSortedMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForHashtable();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForCheckedNavigableMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForSynchronizedNavigableMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForLinkedHashMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForEmptyMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForConcurrentSkipListMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForCheckedSortedMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForSingletonMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForUnmodifiableNavigableMap();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestsForMapsInJavaUtil testsForMapsInJavaUtil0 = new TestsForMapsInJavaUtil();
      Collection<Method> collection0 = testsForMapsInJavaUtil0.suppressForUnmodifiableMap();
      assertNotNull(collection0);
  }
}
