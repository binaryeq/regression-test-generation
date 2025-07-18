/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 20:24:20 GMT 2024
 */

package org.apache.commons.io.monitor;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FileAlterationObserver_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.io.monitor.FileAlterationObserver"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/commons-io/commons-io/2.15.0"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FileAlterationObserver_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.monitor.FileEntry",
      "org.apache.commons.io.IOCase",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.commons.io.monitor.FileAlterationObserver",
      "org.apache.commons.io.comparator.AbstractFileComparator",
      "org.apache.commons.io.monitor.FileAlterationListenerAdaptor",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.file.PathVisitor",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.apache.commons.io.monitor.FileAlterationObserver$1",
      "org.apache.commons.io.monitor.FileAlterationListener",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "org.apache.commons.io.monitor.SerializableFileTime",
      "org.apache.commons.io.comparator.ReverseFileComparator",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.io.function.IOSupplier",
      "org.apache.commons.io.comparator.NameFileComparator",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.commons.io.FileExistsException",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.commons.io.file.attribute.FileTimes",
      "org.apache.commons.io.file.PathFilter",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.FileSystem",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.commons.io.filefilter.CanWriteFileFilter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FileAlterationObserver_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.io.monitor.FileAlterationObserver",
      "org.apache.commons.io.FilenameUtils",
      "org.apache.commons.io.FileSystem",
      "org.apache.commons.io.IOCase",
      "org.apache.commons.io.monitor.FileAlterationObserver$1",
      "org.apache.commons.io.comparator.AbstractFileComparator",
      "org.apache.commons.io.comparator.ReverseFileComparator",
      "org.apache.commons.io.comparator.NameFileComparator",
      "org.apache.commons.io.FileUtils",
      "org.apache.commons.io.monitor.FileEntry",
      "org.apache.commons.io.file.attribute.FileTimes",
      "org.apache.commons.io.monitor.SerializableFileTime",
      "org.apache.commons.io.monitor.FileAlterationListenerAdaptor",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "org.apache.commons.io.filefilter.FileEqualsFileFilter",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "org.apache.commons.io.function.Uncheck",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.apache.commons.io.filefilter.SymbolicLinkFileFilter",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "org.apache.commons.io.filefilter.PathEqualsFileFilter",
      "org.apache.commons.io.file.PathUtils",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.commons.io.filefilter.PathVisitorFileFilter",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "org.apache.commons.io.filefilter.CanExecuteFileFilter",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "org.apache.commons.io.file.SimplePathVisitor",
      "org.apache.commons.io.file.CountingPathVisitor",
      "org.apache.commons.io.file.AccumulatorPathVisitor",
      "org.apache.commons.io.file.Counters",
      "org.apache.commons.io.file.Counters$AbstractPathCounters",
      "org.apache.commons.io.file.Counters$LongPathCounters",
      "org.apache.commons.io.file.Counters$LongCounter",
      "org.apache.commons.io.file.NoopPathVisitor",
      "org.apache.commons.io.file.CleaningPathVisitor",
      "org.apache.commons.io.file.Counters$BigIntegerPathCounters",
      "org.apache.commons.io.file.Counters$BigIntegerCounter",
      "org.apache.commons.io.file.StandardDeleteOption",
      "org.apache.commons.io.StandardLineSeparator",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.filefilter.PathMatcherFileFilter",
      "org.apache.commons.io.file.Counters$NoopCounter",
      "org.apache.commons.io.file.Counters$NoopPathCounters",
      "org.apache.commons.io.file.DeletingPathVisitor",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Strings",
      "org.apache.commons.io.RandomAccessFileMode",
      "org.apache.commons.io.RandomAccessFiles",
      "com.google.common.base.Converter$1",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.base.Converter$ReverseConverter"
    );
  }
}
