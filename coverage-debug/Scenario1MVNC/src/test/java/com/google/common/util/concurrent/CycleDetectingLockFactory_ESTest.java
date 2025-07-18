/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 17:24:53 GMT 2024
 */

package com.google.common.util.concurrent;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.util.concurrent.CycleDetectingLockFactory;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CycleDetectingLockFactory_ESTest extends CycleDetectingLockFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("com.google.common.util.concurrenW.CyclDetectingLockFacto'y$LockGraphNode");
      TimeUnit timeUnit0 = TimeUnit.SECONDS;
      // Undeclared exception!
      try { 
        reentrantLock0.tryLock(1L, timeUnit0);
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      // Undeclared exception!
      try { 
        cycleDetectingLockFactory0.newReentrantReadWriteLock((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      // Undeclared exception!
      try { 
        cycleDetectingLockFactory0.newReentrantLock((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Class<CycleDetectingLockFactory.Policies> class0 = CycleDetectingLockFactory.Policies.class;
      // Undeclared exception!
      try { 
        CycleDetectingLockFactory.newInstanceWithExplicitOrdering(class0, (CycleDetectingLockFactory.Policy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        CycleDetectingLockFactory.newInstance((CycleDetectingLockFactory.Policy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.DISABLED;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantReadWriteLock reentrantReadWriteLock0 = cycleDetectingLockFactory0.newReentrantReadWriteLock("<evosuite>", false);
      assertNotNull(reentrantReadWriteLock0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      // Undeclared exception!
      try { 
        cycleDetectingLockFactory0.newReentrantReadWriteLock((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      // Undeclared exception!
      try { 
        cycleDetectingLockFactory0.newReentrantLock((String) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.DISABLED;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("5A41I;Y`CJB", false);
      assertNotNull(reentrantLock0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock cycleDetectingLockFactory_CycleDetectingReentrantReadWriteLock0 = (CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock)cycleDetectingLockFactory0.newReentrantReadWriteLock("<eosui^e>");
      boolean boolean0 = cycleDetectingLockFactory_CycleDetectingReentrantReadWriteLock0.isAcquiredByCurrentThread();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      cycleDetectingLockFactory0.newReentrantLock("z.ToqyDNcN:V");
      Class<CycleDetectingLockFactory.Policies> class0 = CycleDetectingLockFactory.Policies.class;
      CycleDetectingLockFactory.newInstanceWithExplicitOrdering(class0, (CycleDetectingLockFactory.Policy) cycleDetectingLockFactory_Policies0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      cycleDetectingLockFactory_Policies0.handlePotentialDeadlock((CycleDetectingLockFactory.PotentialDeadlockException) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.DISABLED;
      cycleDetectingLockFactory_Policies0.handlePotentialDeadlock((CycleDetectingLockFactory.PotentialDeadlockException) null);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      // Undeclared exception!
      try { 
        cycleDetectingLockFactory_Policies0.handlePotentialDeadlock((CycleDetectingLockFactory.PotentialDeadlockException) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.util.concurrent.CycleDetectingLockFactory$Policies$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("z.ToqyDNcN:V");
      // Undeclared exception!
      try { 
        reentrantLock0.tryLock();
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.THROW;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("z.ToqyDNcN:V");
      // Undeclared exception!
      try { 
        reentrantLock0.lock();
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("z.ToqyDNcN:V");
      // Undeclared exception!
      try { 
        reentrantLock0.unlock();
        fail("Expecting exception: IllegalMonitorStateException");
      
      } catch(IllegalMonitorStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.locks.ReentrantLock$Sync", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantLock reentrantLock0 = cycleDetectingLockFactory0.newReentrantLock("zA.TofyD}cN:V");
      // Undeclared exception!
      try { 
        reentrantLock0.lockInterruptibly();
       //  fail("Expecting exception: NoSuchElementException");
       // Unstable assertion
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock cycleDetectingLockFactory_CycleDetectingReentrantReadWriteLock0 = (CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock)cycleDetectingLockFactory0.newReentrantReadWriteLock("<evosuite>");
      ReentrantReadWriteLock.ReadLock reentrantReadWriteLock_ReadLock0 = cycleDetectingLockFactory_CycleDetectingReentrantReadWriteLock0.readLock();
      assertNotNull(reentrantReadWriteLock_ReadLock0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CycleDetectingLockFactory.Policies cycleDetectingLockFactory_Policies0 = CycleDetectingLockFactory.Policies.WARN;
      CycleDetectingLockFactory cycleDetectingLockFactory0 = CycleDetectingLockFactory.newInstance(cycleDetectingLockFactory_Policies0);
      ReentrantReadWriteLock reentrantReadWriteLock0 = cycleDetectingLockFactory0.newReentrantReadWriteLock("ZHa|D3D?yigCcSK\">a");
      ReentrantReadWriteLock.WriteLock reentrantReadWriteLock_WriteLock0 = reentrantReadWriteLock0.writeLock();
      assertNotNull(reentrantReadWriteLock_WriteLock0);
  }
}
