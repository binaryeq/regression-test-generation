/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 18:16:54 GMT 2024
 */

package com.google.inject.servlet;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ServletScopes_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.inject.servlet.ServletScopes"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/inject/extensions/guice-servlet/6.0.0"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ServletScopes_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.Hashing",
      "com.google.inject.Scopes$1",
      "com.google.inject.Scopes$2",
      "com.google.inject.Scopes$3",
      "com.google.inject.Key",
      "com.google.inject.spi.ElementVisitor",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "com.google.inject.internal.SingletonScope",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "com.google.inject.servlet.DefaultFilterPipeline",
      "com.google.inject.Key$AnnotationStrategy",
      "com.google.inject.servlet.FilterPipeline",
      "com.google.common.collect.LinkedHashMultimap$ValueSetLink",
      "com.google.inject.servlet.ServletScopes$RequestScope",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.base.Converter",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Maps$8",
      "com.google.inject.servlet.RequestScoper$CloseableScope",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Platform",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.inject.servlet.GuiceFilter",
      "com.google.inject.ConfigurationException",
      "com.google.common.collect.CollectPreconditions",
      "com.google.inject.Binding",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.inject.spi.Element",
      "com.google.inject.servlet.GuiceFilter$Context",
      "com.google.inject.TypeLiteral",
      "com.google.inject.spi.BindingScopingVisitor",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies",
      "com.google.inject.OutOfScopeException",
      "com.google.inject.spi.BindingTargetVisitor",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.errorprone.annotations.CheckReturnValue",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.Multimap",
      "com.google.inject.internal.MoreTypes",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.inject.servlet.ServletScopes",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.inject.Binder",
      "com.google.common.collect.ImmutableList",
      "com.google.inject.servlet.RequestScoper",
      "com.google.inject.servlet.ServletScopes$SessionScope",
      "com.google.inject.servlet.RequestScoped",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.inject.Key$NullAnnotationStrategy",
      "com.google.inject.internal.CycleDetectingLock",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.inject.Scope",
      "com.google.inject.Scopes",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.SetMultimap",
      "com.google.inject.Injector",
      "com.google.common.collect.MapDifference",
      "com.google.inject.Provider",
      "com.google.inject.servlet.ScopingException",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "jakarta.inject.Provider",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.inject.internal.CycleDetectingLock$CycleDetectingLockFactory",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.inject.Binding", false, ServletScopes_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ServletScopes_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.inject.servlet.ServletScopes$RequestScope",
      "com.google.inject.servlet.ServletScopes$SessionScope",
      "com.google.inject.servlet.ServletScopes",
      "com.google.inject.servlet.ServletScopes$1",
      "com.google.inject.servlet.ServletScopes$Context",
      "com.google.inject.servlet.ServletScopes$2",
      "com.google.inject.servlet.ServletScopes$Context$1",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "com.google.inject.servlet.ServletScopes$NullObject",
      "com.google.inject.Key$NullAnnotationStrategy",
      "com.google.inject.servlet.DefaultFilterPipeline",
      "com.google.inject.servlet.GuiceFilter",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.inject.internal.Messages$Converter",
      "com.google.inject.internal.Messages$1",
      "com.google.inject.internal.Messages$2",
      "com.google.inject.internal.Messages$3",
      "com.google.common.collect.ObjectArrays",
      "com.google.inject.internal.Messages",
      "com.google.inject.RestrictedBindingSource$RestrictionLevel",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "org.checkerframework.framework.qual.LiteralKind",
      "org.checkerframework.checker.units.qual.Prefix",
      "org.checkerframework.framework.qual.TypeKind",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.Platform",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.inject.internal.CycleDetectingLock$CycleDetectingLockFactory",
      "com.google.inject.internal.SingletonScope",
      "com.google.inject.Scopes$1",
      "com.google.inject.Scopes$2",
      "com.google.inject.Scopes",
      "com.google.inject.Scopes$3",
      "com.google.inject.OutOfScopeException",
      "com.google.inject.servlet.GuiceFilter$Context",
      "com.google.inject.Key",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.cache.CacheLoader",
      "com.google.inject.internal.Annotations$1",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.cache.LocalCache",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.base.Joiner",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.inject.internal.Annotations$AnnotationToStringConfig",
      "com.google.inject.internal.Annotations$AnnotationChecker",
      "com.google.inject.internal.Annotations$AnnotationChecker$1",
      "com.google.inject.internal.Annotations",
      "com.google.common.base.Strings",
      "com.google.inject.TypeLiteral",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.inject.internal.MoreTypes"
    );
  }
}
