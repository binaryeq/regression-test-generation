/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 08 03:01:16 GMT 2024
 */

package com.google.common.truth;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class IterableSubject_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.truth.IterableSubject"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation-NON-SOURCE-EQUIV/find-diff-classes/testgen/mvnc/com/google/truth/truth/1.1.3"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(IterableSubject_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.truth.Subject$2",
      "com.google.common.collect.BiMap",
      "com.google.common.base.Function",
      "com.google.common.base.Java8Usage",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.ListMultimap",
      "com.google.common.truth.Subject$1",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.truth.IterableSubject$UsingCorrespondence",
      "com.google.common.truth.Ordered",
      "com.google.common.collect.Multimap",
      "com.google.common.truth.Subject",
      "com.google.common.collect.SetMultimap",
      "com.google.common.truth.Correspondence",
      "com.google.common.truth.IterableSubject$3",
      "com.google.common.truth.IterableSubject$PairwiseChecker",
      "com.google.common.truth.IterableSubject$UsingCorrespondence$Pairer",
      "com.google.common.truth.IterableSubject",
      "com.google.common.truth.IterableSubject$4",
      "com.google.common.truth.FailureStrategy",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSetMultimap"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(IterableSubject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.truth.Subject$1",
      "com.google.common.truth.Subject$2",
      "com.google.common.truth.Subject",
      "com.google.common.truth.IterableSubject$3",
      "com.google.common.truth.IterableSubject$4",
      "com.google.common.truth.IterableSubject",
      "com.google.common.truth.IterableSubject$2",
      "com.google.common.truth.IterableSubject$1",
      "com.google.common.truth.IterableSubject$5",
      "com.google.common.truth.IterableSubject$6",
      "com.google.common.truth.IterableSubject$UsingCorrespondence",
      "com.google.common.truth.IterableSubject$UsingCorrespondence$1",
      "com.google.common.truth.IterableSubject$UsingCorrespondence$2",
      "com.google.common.truth.IterableSubject$ElementFactGrouping",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableList$Itr",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.truth.Correspondence",
      "com.google.common.truth.Correspondence$Equality",
      "com.google.common.truth.FailureMetadata",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableSortedMultisetFauxverideShim",
      "com.google.common.collect.ImmutableSortedMultiset",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.ImmutableSortedMultiset$Builder",
      "com.google.common.base.Java8Usage",
      "com.google.common.base.Preconditions",
      "org.checkerframework.framework.qual.LiteralKind",
      "com.google.common.truth.Correspondence$FromBinaryPredicate",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.collect.RegularImmutableSortedMultiset",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.collect.ObjectCountHashMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.truth.Correspondence$FormattingDiffs",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.truth.Correspondence$TolerantNumericEquality",
      "com.google.common.truth.ComparableSubject",
      "com.google.common.truth.DoubleSubject",
      "com.google.common.base.Strings",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.truth.Correspondence$Transforming",
      "com.google.common.base.Functions",
      "com.google.common.base.Functions$IdentityFunction",
      "com.google.common.truth.Fact",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.RegularImmutableMultiset$ElementSet",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.common.collect.ObjectCountLinkedHashMap",
      "com.google.common.collect.ConcurrentHashMultiset",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.AbstractSortedMultiset",
      "com.google.common.collect.TreeMultiset",
      "com.google.common.collect.GeneralRange",
      "com.google.common.collect.TreeMultiset$AvlNode",
      "com.google.common.collect.TreeMultiset$Reference",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.TreeMultiset$2",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Platform",
      "com.google.common.collect.EnumMultiset",
      "com.google.common.collect.Lists",
      "com.google.common.collect.HashMultiset",
      "com.google.common.collect.Multisets$MultisetIteratorImpl",
      "com.google.common.collect.AbstractMapBasedMultiset$Itr",
      "com.google.common.collect.AbstractMapBasedMultiset$2"
    );
  }
}
