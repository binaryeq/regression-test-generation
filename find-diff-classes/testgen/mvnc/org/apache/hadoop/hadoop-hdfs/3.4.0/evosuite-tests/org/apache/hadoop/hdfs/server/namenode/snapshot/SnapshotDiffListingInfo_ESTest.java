/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 11 00:15:59 GMT 2024
 */

package org.apache.hadoop.hdfs.server.namenode.snapshot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.fs.permission.PermissionStatus;
import org.apache.hadoop.hdfs.protocol.SnapshotDiffReportListing;
import org.apache.hadoop.hdfs.server.namenode.INodeDirectory;
import org.apache.hadoop.hdfs.server.namenode.snapshot.DirectoryWithSnapshotFeature;
import org.apache.hadoop.hdfs.server.namenode.snapshot.Snapshot;
import org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SnapshotDiffListingInfo_ESTest extends SnapshotDiffListingInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", (String) null, fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      byte[][] byteArray1 = new byte[1][9];
      snapshotDiffListingInfo0.addDirDiff(18, byteArray1, directoryWithSnapshotFeature_ChildrenDiff0);
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff(10, byteArray1, directoryWithSnapshotFeature_ChildrenDiff0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot(10, iNodeDirectory0, iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, snapshot0, 10);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(2147483646, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The argument object is NULL
         //
         verifyException("org.apache.hadoop.util.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[1];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      byte[][] byteArray1 = new byte[0][3];
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      snapshotDiffListingInfo0.setLastIndex(18);
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(59L, byteArray1, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 18, Size: 0
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-483));
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(10, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.DFSUtilClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", (String) null, fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      boolean boolean0 = snapshotDiffListingInfo0.isFromEarlier();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[1];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      Snapshot snapshot0 = snapshotDiffListingInfo0.getLater();
      assertNull(snapshot0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot(18, "fs.permissions.umask-mode", iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, snapshot0, snapshot0, 3362);
      Snapshot snapshot1 = snapshotDiffListingInfo0.getEarlier();
      assertEquals(2147483646, Snapshot.CURRENT_STATE_ID);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo((INodeDirectory) null, (INodeDirectory) null, (Snapshot) null, (Snapshot) null, (-1678));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      byte[][] byteArray1 = new byte[8][3];
      snapshotDiffListingInfo0.setLastPath(byteArray1);
      assertEquals(8, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[1];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      Snapshot snapshot0 = new Snapshot(235, "MPTz.Z2q", iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, snapshot0, (Snapshot) null, 10);
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(18, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // The argument object is NULL
         //
         verifyException("org.apache.hadoop.util.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      Snapshot snapshot0 = snapshotDiffListingInfo0.getEarlier();
      assertNull(snapshot0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 2);
      byte[][] byteArray1 = new byte[1][7];
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      snapshotDiffListingInfo0.setLastIndex((-1428));
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(0L, byteArray1, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1428, Size: 0
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[1];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      INodeDirectory iNodeDirectory1 = new INodeDirectory(300000L, byteArray0, permissionStatus0, 2);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory1, (Snapshot) null, (Snapshot) null, 89);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.util.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[6];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.util.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[1];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
      SnapshotDiffReportListing snapshotDiffReportListing0 = snapshotDiffListingInfo0.generateReport();
      assertFalse(snapshotDiffReportListing0.getIsFromEarlier());
      assertEquals((-1), snapshotDiffReportListing0.getLastIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[0];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 0L);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 0);
      byte[][] byteArray1 = new byte[3][0];
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff(0L, byteArray1, (DirectoryWithSnapshotFeature.ChildrenDiff) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FsPermission fsPermission0 = FsPermission.getFileDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      byte[] byteArray0 = new byte[12];
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 0);
      snapshotDiffListingInfo0.setLastIndex(0);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff(0L, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
      assertTrue(boolean0);
  }
}
