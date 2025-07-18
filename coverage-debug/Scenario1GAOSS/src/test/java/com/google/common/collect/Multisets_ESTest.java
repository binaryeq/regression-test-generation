/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 15:30:41 GMT 2024
 */

package com.google.common.collect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.BoundType;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.DescendingImmutableSortedMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultimap;
import com.google.common.collect.TreeMultiset;
import com.google.common.collect.UnmodifiableSortedMultiset;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Multisets_ESTest extends Multisets_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        Multisets.removeOccurrences((Multiset<?>) null, (Multiset<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Multisets.iteratorImpl((Multiset<DescendingImmutableSortedMultiset<DescendingImmutableSortedMultiset>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Multisets.UnmodifiableMultiset<Comparable<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Comparable<Object>>((Multiset<? extends Comparable<Object>>) null);
      Multisets.MultisetIteratorImpl<Comparable<Object>> multisets_MultisetIteratorImpl0 = new Multisets.MultisetIteratorImpl<Comparable<Object>>(multisets_UnmodifiableMultiset0, (Iterator<Multiset.Entry<Comparable<Object>>>) null);
      // Undeclared exception!
      try { 
        multisets_MultisetIteratorImpl0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$MultisetIteratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMultiset<Object> hashMultiset0 = HashMultiset.create();
      boolean boolean0 = Multisets.setCountImpl((Multiset<Object>) hashMultiset0, (Object) null, 1, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object object0 = new Object();
      ImmutableMultiset<Object> immutableMultiset0 = ImmutableMultiset.of(object0);
      // Undeclared exception!
      try { 
        Multisets.removeAllImpl(immutableMultiset0, immutableMultiset0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      Multisets.ImmutableEntry<Locale.FilteringMode> multisets_ImmutableEntry0 = new Multisets.ImmutableEntry<Locale.FilteringMode>(locale_FilteringMode0, 2658);
      boolean boolean0 = multisets_ImmutableEntry0.equals(locale_FilteringMode0);
      assertFalse(boolean0);
      assertEquals(2658, multisets_ImmutableEntry0.getCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Comparable<Object>> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Comparable<Object>>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      TreeMultiset<Object> treeMultiset0 = new TreeMultiset<Object>(comparator1);
      boolean boolean0 = Multisets.removeOccurrences((Multiset<?>) treeMultiset0, (Multiset<?>) treeMultiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      ImmutableSortedMultiset<Locale.FilteringMode> immutableSortedMultiset0 = ImmutableSortedMultiset.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
      UnmodifiableSortedMultiset<Locale.FilteringMode> unmodifiableSortedMultiset0 = new UnmodifiableSortedMultiset<Locale.FilteringMode>(immutableSortedMultiset0);
      LinkedHashMultiset<Comparable<Locale.FilteringMode>> linkedHashMultiset0 = LinkedHashMultiset.create((Iterable<? extends Comparable<Locale.FilteringMode>>) unmodifiableSortedMultiset0);
      Iterator<Multiset.Entry<Comparable<Locale.FilteringMode>>> iterator0 = (Iterator<Multiset.Entry<Comparable<Locale.FilteringMode>>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      Multisets.MultisetIteratorImpl<Comparable<Locale.FilteringMode>> multisets_MultisetIteratorImpl0 = new Multisets.MultisetIteratorImpl<Comparable<Locale.FilteringMode>>(linkedHashMultiset0, iterator0);
      // Undeclared exception!
      try { 
        multisets_MultisetIteratorImpl0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$MultisetIteratorImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparable0).compareTo(any());
      doReturn((String) null, (String) null, (String) null, (String) null).when(comparable0).toString();
      ImmutableSortedMultiset<Comparable<Object>> immutableSortedMultiset0 = ImmutableSortedMultiset.of(comparable0, comparable0, comparable0);
      Multisets.UnmodifiableMultiset<Comparable<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Comparable<Object>>(immutableSortedMultiset0);
      multisets_UnmodifiableMultiset0.stream();
      multisets_UnmodifiableMultiset0.spliterator();
      assertTrue(multisets_UnmodifiableMultiset0.contains(comparable0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
      ImmutableSortedMultiset<Locale.FilteringMode> immutableSortedMultiset0 = ImmutableSortedMultiset.of(locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0, locale_FilteringMode0);
      Multiset<Locale.FilteringMode> multiset0 = Multisets.union((Multiset<? extends Locale.FilteringMode>) immutableSortedMultiset0, (Multiset<? extends Locale.FilteringMode>) immutableSortedMultiset0);
      boolean boolean0 = Multisets.containsOccurrences(multiset0, multiset0);
      assertTrue(multiset0.contains(locale_FilteringMode0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0).when(comparable0).compareTo(any());
      ImmutableSortedMultiset<Comparable<Object>> immutableSortedMultiset0 = ImmutableSortedMultiset.of(comparable0, comparable0, comparable0);
      Multisets.UnmodifiableMultiset<Comparable<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Comparable<Object>>(immutableSortedMultiset0);
      // Undeclared exception!
      try { 
        multisets_UnmodifiableMultiset0.remove((Object) immutableSortedMultiset0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$UnmodifiableMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comparator<Comparable<Locale.Category>> comparator0 = (Comparator<Comparable<Locale.Category>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeMultimap<Locale.Category, Comparable<Locale.Category>> treeMultimap0 = new TreeMultimap<Locale.Category, Comparable<Locale.Category>>((Comparator<? super Locale.Category>) null, comparator0);
      Multiset<Locale.Category> multiset0 = treeMultimap0.createKeys();
      Multiset<Locale.Category> multiset1 = Multisets.unmodifiableMultiset((Multiset<? extends Locale.Category>) multiset0);
      // Undeclared exception!
      try { 
        Multisets.retainAllImpl(multiset1, multiset1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$UnmodifiableCollection", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparable0).compareTo(any());
      ImmutableSortedMultiset<Comparable<Object>> immutableSortedMultiset0 = ImmutableSortedMultiset.of(comparable0, comparable0, comparable0, comparable0);
      UnmodifiableSortedMultiset<Comparable<Object>> unmodifiableSortedMultiset0 = new UnmodifiableSortedMultiset<Comparable<Object>>(immutableSortedMultiset0);
      Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        unmodifiableSortedMultiset0.add(comparable1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$UnmodifiableMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedHashMultiset<Comparable<Object>> linkedHashMultiset0 = LinkedHashMultiset.create();
      Multisets.UnmodifiableMultiset<Comparable<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Comparable<Object>>(linkedHashMultiset0);
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        multisets_UnmodifiableMultiset0.add(comparable0, 3221);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$UnmodifiableMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ConcurrentSkipListMap<Object, AtomicInteger> concurrentSkipListMap0 = new ConcurrentSkipListMap<Object, AtomicInteger>();
      ConcurrentHashMultiset<Object> concurrentHashMultiset0 = ConcurrentHashMultiset.create((ConcurrentMap<Object, AtomicInteger>) concurrentSkipListMap0);
      Multisets.UnmodifiableMultiset<Object> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Object>(concurrentHashMultiset0);
      Iterator<Object> iterator0 = multisets_UnmodifiableMultiset0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashMultiset<AbstractMap.SimpleEntry<Object, Object>> linkedHashMultiset0 = LinkedHashMultiset.create();
      ImmutableMultimap<Object, Object> immutableMultimap0 = ImmutableMultimap.copyOf((Iterable<? extends Map.Entry<?, ?>>) linkedHashMultiset0);
      ImmutableMultimap.Keys immutableMultimap_Keys0 = immutableMultimap0.new Keys();
      Multisets.UnmodifiableMultiset<Comparable<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<Comparable<Object>>(immutableMultimap_Keys0);
      // Undeclared exception!
      try { 
        multisets_UnmodifiableMultiset0.removeAll(linkedHashMultiset0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Multisets$UnmodifiableMultiset", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Comparable<Object>> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Comparable<Object>>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      PriorityQueue<Object> priorityQueue0 = new PriorityQueue<Object>(comparator1);
      // Undeclared exception!
      try { 
        Multisets.cast((Iterable<Object>) priorityQueue0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.PriorityQueue cannot be cast to com.google.common.collect.Multiset
         //
         verifyException("com.google.common.collect.Multisets", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Comparator<Comparable<Locale.Category>> comparator0 = (Comparator<Comparable<Locale.Category>>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      TreeMultimap<Locale.Category, Comparable<Locale.Category>> treeMultimap0 = new TreeMultimap<Locale.Category, Comparable<Locale.Category>>((Comparator<? super Locale.Category>) null, comparator0);
      Multimaps.Keys<Locale.Category, Comparable<Locale.Category>> multimaps_Keys0 = new Multimaps.Keys<Locale.Category, Comparable<Locale.Category>>(treeMultimap0);
      Iterator<Locale.Category> iterator0 = Multisets.iteratorImpl((Multiset<Locale.Category>) multimaps_Keys0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoundType[] boundTypeArray0 = new BoundType[1];
      BoundType boundType0 = BoundType.CLOSED;
      boundTypeArray0[0] = boundType0;
      ImmutableSortedMultiset<BoundType> immutableSortedMultiset0 = ImmutableSortedMultiset.copyOf(boundTypeArray0);
      Multiset.Entry<BoundType> multiset_Entry0 = immutableSortedMultiset0.firstEntry();
      assertEquals(1, multiset_Entry0.getCount());
      assertTrue(immutableSortedMultiset0.contains(boundType0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedHashMultiset<Comparable<Object>> linkedHashMultiset0 = LinkedHashMultiset.create();
      Multiset<Comparable<Object>> multiset0 = Multisets.difference((Multiset<Comparable<Object>>) linkedHashMultiset0, (Multiset<?>) linkedHashMultiset0);
      Iterator<Comparable<Object>> iterator0 = Multisets.iteratorImpl(multiset0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0, 0, 0).when(comparable0).compareTo(any());
      ImmutableSortedMultiset<Comparable<Object>> immutableSortedMultiset0 = ImmutableSortedMultiset.of(comparable0, comparable0, comparable0, comparable0);
      SortedMultiset<Comparable<Object>> sortedMultiset0 = Multisets.unmodifiableSortedMultiset((SortedMultiset<Comparable<Object>>) immutableSortedMultiset0);
      assertTrue(sortedMultiset0.contains(comparable0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedListMultimap<Object, Comparable<Object>> linkedListMultimap0 = new LinkedListMultimap<Object, Comparable<Object>>();
      Multiset<Object> multiset0 = linkedListMultimap0.createKeys();
      boolean boolean0 = Multisets.retainOccurrences(multiset0, multiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Function<Object, Object> function0 = Function.identity();
      ToIntFunction<Object> toIntFunction0 = (ToIntFunction<Object>) mock(ToIntFunction.class, new ViolatedAssumptionAnswer());
      Supplier<HashMultiset<Object>> supplier0 = (Supplier<HashMultiset<Object>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Collector<Object, ?, HashMultiset<Object>> collector0 = Multisets.toMultiset((Function<? super Object, Object>) function0, (ToIntFunction<? super Object>) toIntFunction0, supplier0);
      assertNotNull(collector0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Comparable<Object>> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Comparable<Object>>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      ImmutableSortedMultiset<HashMultiset<Object>> immutableSortedMultiset0 = ImmutableSortedMultiset.emptyMultiset((Comparator<? super HashMultiset<Object>>) comparator1);
      Multiset<HashMultiset<Object>> multiset0 = Multisets.unmodifiableMultiset((ImmutableMultiset<HashMultiset<Object>>) immutableSortedMultiset0);
      assertNotNull(multiset0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ConcurrentHashMap<DescendingImmutableSortedMultiset<Object>, AtomicInteger> concurrentHashMap0 = new ConcurrentHashMap<DescendingImmutableSortedMultiset<Object>, AtomicInteger>();
      ConcurrentHashMultiset<DescendingImmutableSortedMultiset<Object>> concurrentHashMultiset0 = new ConcurrentHashMultiset<DescendingImmutableSortedMultiset<Object>>(concurrentHashMap0);
      Multisets.UnmodifiableMultiset<DescendingImmutableSortedMultiset<Object>> multisets_UnmodifiableMultiset0 = new Multisets.UnmodifiableMultiset<DescendingImmutableSortedMultiset<Object>>(concurrentHashMultiset0);
      Multiset<Object> multiset0 = Multisets.union((Multiset<?>) multisets_UnmodifiableMultiset0, (Multiset<?>) concurrentHashMultiset0);
      assertNotNull(multiset0);
  }
}
