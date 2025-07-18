/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 18:14:32 GMT 2024
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
public class ManagedFilterPipeline_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.inject.servlet.ManagedFilterPipeline"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.Hashing",
      "com.google.inject.Scopes$1",
      "com.google.inject.Scopes$2",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.inject.spi.ElementVisitor",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "com.google.inject.internal.SingletonScope",
      "com.google.inject.servlet.DefaultFilterPipeline",
      "com.google.inject.spi.ProviderInstanceBinding",
      "com.google.inject.Key$AnnotationStrategy",
      "com.google.common.collect.LinkedHashMultimap$ValueSetLink",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.Platform",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.inject.servlet.GuiceFilter",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.inject.ScopeAnnotation",
      "com.google.inject.TypeLiteral",
      "com.google.inject.servlet.UriPatternMatcher",
      "com.google.inject.servlet.FilterDefinition",
      "com.google.inject.spi.BindingScopingVisitor",
      "com.google.inject.Singleton",
      "com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies",
      "com.google.inject.spi.HasDependencies",
      "com.google.inject.OutOfScopeException",
      "com.google.common.collect.ImmutableAsList",
      "com.google.inject.servlet.ManagedFilterPipeline",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.inject.internal.MoreTypes",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.Lists",
      "com.google.inject.Binder",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.inject.internal.CycleDetectingLock",
      "com.google.common.collect.Sets$4",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.inject.servlet.ServletDefinition",
      "com.google.common.base.Throwables",
      "com.google.inject.Scope",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.inject.servlet.InstanceFilterBinding",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "com.google.inject.internal.CycleDetectingLock$CycleDetectingLockFactory",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.inject.MembersInjector",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList",
      "com.google.common.collect.ImmutableEntry",
      "com.google.inject.Module",
      "com.google.inject.servlet.ServletModuleBinding",
      "com.google.inject.Key",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.inject.servlet.ManagedFilterPipeline$1",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "com.google.inject.servlet.FilterPipeline",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$8",
      "com.google.inject.servlet.RequestScoper$CloseableScope",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.inject.ConfigurationException",
      "com.google.common.collect.CollectPreconditions",
      "com.google.inject.Binding",
      "com.google.common.collect.Sets",
      "com.google.inject.servlet.ManagedServletPipeline",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.inject.spi.Element",
      "com.google.common.collect.Lists$2",
      "com.google.inject.servlet.GuiceFilter$Context",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.Lists$1",
      "com.google.inject.spi.BindingTargetVisitor",
      "com.google.errorprone.annotations.CheckReturnValue",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.google.inject.servlet.LinkedFilterBinding",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableList",
      "com.google.inject.spi.TypeConverterBinding",
      "com.google.inject.servlet.RequestScoper",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.inject.Key$NullAnnotationStrategy",
      "com.google.inject.spi.ProviderWithExtensionVisitor",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.inject.Scopes",
      "com.google.common.collect.SetMultimap",
      "com.google.inject.Injector",
      "com.google.inject.Provider",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.inject.spi.InjectionPoint",
      "jakarta.inject.Provider",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.inject.servlet.FilterChainInvocation"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.inject.Binding", false, ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.inject.Injector", false, ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.google.inject.Provider", false, ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("javax.servlet.FilterChain", false, ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ManagedFilterPipeline_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.inject.TypeLiteral",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.inject.internal.MoreTypes",
      "com.google.inject.servlet.ManagedFilterPipeline",
      "com.google.inject.servlet.ManagedFilterPipeline$1",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "com.google.inject.RestrictedBindingSource$RestrictionLevel",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "org.checkerframework.framework.qual.LiteralKind",
      "org.checkerframework.checker.units.qual.Prefix",
      "org.checkerframework.framework.qual.TypeKind",
      "com.google.inject.servlet.ManagedServletPipeline",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Sets",
      "com.google.common.collect.Maps",
      "com.google.inject.servlet.ManagedServletPipeline$RequestDispatcherRequestWrapper",
      "com.google.inject.servlet.DefaultFilterPipeline",
      "com.google.inject.servlet.GuiceFilter",
      "com.google.inject.Key",
      "com.google.inject.Key$NullAnnotationStrategy",
      "com.google.inject.OutOfScopeException",
      "com.google.inject.internal.Errors",
      "com.google.inject.internal.Messages$Converter",
      "com.google.inject.internal.Messages$1",
      "com.google.inject.internal.Messages$2",
      "com.google.inject.internal.Messages$3",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.inject.internal.Messages",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.base.Strings",
      "com.google.inject.internal.SourceFormatter",
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
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.inject.servlet.FilterChainInvocation",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.inject.servlet.FilterDefinition",
      "com.google.inject.servlet.GuiceFilter$Context",
      "com.google.common.base.Throwables",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.inject.servlet.ServletUtils",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.Platform",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.inject.internal.CycleDetectingLock$CycleDetectingLockFactory",
      "com.google.inject.internal.SingletonScope",
      "com.google.inject.Scopes$1",
      "com.google.inject.Scopes$2",
      "com.google.inject.Scopes",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.hash.Murmur3_128HashFunction",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.AbstractStreamingHasher",
      "com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher",
      "com.google.common.hash.Java8Compatibility",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.primitives.Longs"
    );
  }
}
