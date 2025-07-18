/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 14:49:21 GMT 2024
 */

package com.google.common.collect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.BoundType;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableSortedMultiset;
import com.google.common.collect.RegularImmutableSortedSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConcurrentHashMultiset_ESTest extends ConcurrentHashMultiset_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ConcurrentHashMultiset<Multisets.ImmutableEntry<Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      boolean boolean0 = concurrentHashMultiset0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ConcurrentHashMultiset<BoundType> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      BoundType boundType0 = BoundType.CLOSED;
      int int0 = concurrentHashMultiset0.setCount(boundType0, 1365);
      assertEquals(0, int0);
      
      boolean boolean0 = concurrentHashMultiset0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConcurrentHashMultiset<Comparable<BoundType>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      Iterator<Multiset.Entry<Comparable<BoundType>>> iterator0 = (Iterator<Multiset.Entry<Comparable<BoundType>>>)concurrentHashMultiset0.entryIterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      ConcurrentHashMap<AtomicInteger, Object> concurrentHashMap0 = new ConcurrentHashMap<AtomicInteger, Object>();
      int int0 = concurrentHashMultiset0.setCount(concurrentHashMap0, 159);
      ConcurrentHashMultiset<Object> concurrentHashMultiset1 = ConcurrentHashMultiset.create((Iterable<?>) concurrentHashMultiset0);
      int int1 = concurrentHashMultiset1.distinctElements();
      assertTrue(concurrentHashMultiset0.contains(concurrentHashMap0));
      assertFalse(int1 == int0);
      assertEquals(1, int1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ConcurrentHashMap<AtomicInteger, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<AtomicInteger, AtomicInteger>();
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<AtomicInteger, AtomicInteger>) concurrentHashMap0);
      AtomicInteger atomicInteger0 = new AtomicInteger((-1390));
      concurrentHashMultiset0.add(atomicInteger0);
      int int0 = concurrentHashMultiset0.add(atomicInteger0, 1627);
      assertFalse(concurrentHashMap0.isEmpty());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      AtomicInteger atomicInteger0 = new AtomicInteger(3850);
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.setCount(atomicInteger0, (-1568), (-3371));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // oldCount cannot be negative but was: -1568
         //
         verifyException("com.google.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ConcurrentHashMultiset<Multisets.ImmutableEntry<Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.setCount((Multisets.ImmutableEntry<Object>) null, (-946));
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
      BoundType boundType0 = BoundType.CLOSED;
      ConcurrentHashMultiset<Object> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.setCount((Object) boundType0, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // count cannot be negative but was: -1
         //
         verifyException("com.google.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ConcurrentHashMultiset.create((ConcurrentMap<Object, AtomicInteger>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ConcurrentHashMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ConcurrentHashMap<Map.Entry<Object, Object>, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<Map.Entry<Object, Object>, AtomicInteger>();
      ConcurrentHashMultiset<Map.Entry<Object, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<Map.Entry<Object, Object>, AtomicInteger>) concurrentHashMap0);
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.add((Map.Entry<Object, Object>) null, (-338));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ConcurrentSkipListMap<AtomicInteger, AtomicInteger> concurrentSkipListMap0 = new ConcurrentSkipListMap<AtomicInteger, AtomicInteger>();
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<AtomicInteger, AtomicInteger>) concurrentSkipListMap0);
      AtomicInteger atomicInteger0 = new AtomicInteger((-643));
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.add(atomicInteger0, (-4516));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // occurrences must be positive but was: -4516
         //
         verifyException("com.google.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = null;
      try {
        concurrentHashMultiset0 = new ConcurrentHashMultiset<AtomicInteger>((ConcurrentMap<AtomicInteger, AtomicInteger>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ConcurrentHashMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ConcurrentHashMap<AtomicInteger, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<AtomicInteger, AtomicInteger>();
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = new ConcurrentHashMultiset<AtomicInteger>(concurrentHashMap0);
      int int0 = concurrentHashMultiset0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      ConcurrentHashMap<AtomicInteger, Object> concurrentHashMap0 = new ConcurrentHashMap<AtomicInteger, Object>();
      boolean boolean0 = concurrentHashMultiset0.setCount(concurrentHashMap0, 159, 2188);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      AtomicInteger atomicInteger0 = new AtomicInteger(1365);
      concurrentHashMultiset0.add(atomicInteger0, 1365);
      int int0 = concurrentHashMultiset0.setCount(atomicInteger0, 0);
      assertFalse(concurrentHashMultiset0.contains(atomicInteger0));
      assertEquals(1365, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ConcurrentHashMultiset<Object> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      AtomicInteger atomicInteger0 = new AtomicInteger(0);
      boolean boolean0 = concurrentHashMultiset0.removeExactly(atomicInteger0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ConcurrentHashMap<Map.Entry<Object, Object>, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<Map.Entry<Object, Object>, AtomicInteger>();
      ConcurrentHashMultiset<Map.Entry<Object, Object>> concurrentHashMultiset0 = new ConcurrentHashMultiset<Map.Entry<Object, Object>>(concurrentHashMap0);
      AtomicInteger atomicInteger0 = new AtomicInteger((-256));
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.removeExactly(atomicInteger0, (-256));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // occurrences must be positive but was: -256
         //
         verifyException("com.google.common.collect.CollectPreconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ConcurrentHashMultiset<Object> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      AtomicInteger atomicInteger0 = new AtomicInteger(0);
      int int0 = concurrentHashMultiset0.remove((Object) atomicInteger0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<AtomicInteger> linkedList0 = new LinkedList<AtomicInteger>();
      AtomicInteger atomicInteger0 = new AtomicInteger(0);
      linkedList0.add(atomicInteger0);
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create((Iterable<? extends AtomicInteger>) linkedList0);
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.toArray((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      Object object0 = new Object();
      int int0 = concurrentHashMultiset0.count(object0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ConcurrentSkipListMap<ConcurrentHashMap<Object, Object>, AtomicInteger> concurrentSkipListMap0 = new ConcurrentSkipListMap<ConcurrentHashMap<Object, Object>, AtomicInteger>();
      ConcurrentHashMultiset<ConcurrentHashMap<Object, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<ConcurrentHashMap<Object, Object>, AtomicInteger>) concurrentSkipListMap0);
      Set<Multiset.Entry<ConcurrentHashMap<Object, Object>>> set0 = (Set<Multiset.Entry<ConcurrentHashMap<Object, Object>>>)concurrentHashMultiset0.createEntrySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Stack<BoundType> stack0 = new Stack<BoundType>();
      ConcurrentHashMultiset<BoundType> concurrentHashMultiset0 = ConcurrentHashMultiset.create((Iterable<? extends BoundType>) stack0);
      // Undeclared exception!
      try { 
        concurrentHashMultiset0.elementIterator();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // should never be called
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      Iterator<AtomicInteger> iterator0 = concurrentHashMultiset0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      ConcurrentHashMultiset<Object> concurrentHashMultiset1 = ConcurrentHashMultiset.create((Iterable<?>) concurrentHashMultiset0);
      AtomicInteger[] atomicIntegerArray0 = new AtomicInteger[6];
      AtomicInteger[] atomicIntegerArray1 = concurrentHashMultiset1.toArray(atomicIntegerArray0);
      assertSame(atomicIntegerArray1, atomicIntegerArray0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      concurrentHashMultiset0.clear();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ConcurrentHashMultiset<ConcurrentHashMap<AtomicInteger, Object>> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      ConcurrentHashMultiset<Object> concurrentHashMultiset1 = ConcurrentHashMultiset.create((Iterable<?>) concurrentHashMultiset0);
      int int0 = concurrentHashMultiset1.distinctElements();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create();
      ConcurrentHashMultiset<Object> concurrentHashMultiset1 = ConcurrentHashMultiset.create((Iterable<?>) concurrentHashMultiset0);
      Object[] objectArray0 = concurrentHashMultiset1.toArray();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ConcurrentHashMap<AtomicInteger, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<AtomicInteger, AtomicInteger>(0);
      ConcurrentHashMultiset<AtomicInteger> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<AtomicInteger, AtomicInteger>) concurrentHashMap0);
      AtomicInteger atomicInteger0 = new AtomicInteger(1235);
      boolean boolean0 = concurrentHashMultiset0.setCount(atomicInteger0, 0, 0);
      assertTrue(concurrentHashMap0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ConcurrentSkipListMap<Comparable<BoundType>, AtomicInteger> concurrentSkipListMap0 = new ConcurrentSkipListMap<Comparable<BoundType>, AtomicInteger>();
      ConcurrentHashMultiset<Comparable<BoundType>> concurrentHashMultiset0 = new ConcurrentHashMultiset<Comparable<BoundType>>(concurrentSkipListMap0);
      Object[] objectArray0 = new Object[9];
      RegularImmutableList<AtomicInteger> regularImmutableList0 = new RegularImmutableList<AtomicInteger>(objectArray0);
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<AtomicInteger> regularImmutableSortedSet0 = new RegularImmutableSortedSet<AtomicInteger>(regularImmutableList0, comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      RegularImmutableSortedMultiset<Object> regularImmutableSortedMultiset0 = new RegularImmutableSortedMultiset<Object>(comparator1);
      boolean boolean0 = concurrentHashMultiset0.retainAll(regularImmutableSortedMultiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ConcurrentHashMap<Object, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<Object, AtomicInteger>();
      ConcurrentHashMultiset<Object> concurrentHashMultiset0 = new ConcurrentHashMultiset<Object>(concurrentHashMap0);
      Set<Object> set0 = concurrentHashMultiset0.createElementSet();
      assertNotNull(set0);
  }
}
