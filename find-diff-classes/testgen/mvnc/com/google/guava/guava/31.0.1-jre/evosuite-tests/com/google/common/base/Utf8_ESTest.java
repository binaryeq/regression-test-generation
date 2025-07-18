/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 14:21:43 GMT 2024
 */

package com.google.common.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Utf8;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Utf8_ESTest extends Utf8_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-1);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-19);
      byteArray0[1] = (byte) (-69);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-65);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[4] = (byte) (-18);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-16);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte) (-62);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte) (-51);
      byteArray0[3] = (byte) (-125);
      byteArray0[5] = (byte)54;
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)54;
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[0] = '\u0088';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = Utf8.encodedLength(charBuffer0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.flip();
      int int0 = Utf8.encodedLength(charBuffer0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.isWellFormed((byte[]) null, (-1962), (-1962));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        Utf8.isWellFormed(byteArray0, 12, 12);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.String@0000000001 (java.lang.Integer@0000000002) must not be greater than size (java.lang.Integer@0000000003)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.isWellFormed((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(57343);
      // Undeclared exception!
      Utf8.encodedLength(charBuffer0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Utf8.encodedLength((CharSequence) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Utf8", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(257);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.put('V');
      // Undeclared exception!
      try { 
        Utf8.encodedLength(charBuffer1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-63);
      boolean boolean0 = Utf8.isWellFormed(byteArray0, 1, 3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = Utf8.isWellFormed(byteArray0, 1, 3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[21];
      byteArray0[0] = (byte) (-15);
      byteArray0[1] = (byte) (-126);
      byteArray0[2] = (byte) (-126);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[12];
      byteArray0[0] = (byte) (-13);
      byteArray0[1] = (byte) (-107);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-11);
      byteArray0[1] = (byte) (-87);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte) (-14);
      byteArray0[1] = (byte) (-127);
      byteArray0[2] = (byte) (-73);
      byteArray0[3] = (byte) (-128);
      byteArray0[4] = (byte) (-14);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-19);
      byteArray0[1] = (byte) (-103);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-19);
      byteArray0[1] = (byte) (-96);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-103);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-32);
      byteArray0[1] = (byte) (-96);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-28);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte) (-36);
      byteArray0[1] = (byte) (-65);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-39);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-21);
      byteArray0[1] = (byte) (-86);
      byteArray0[2] = (byte) (-65);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-17);
      byteArray0[1] = (byte) (-73);
      byteArray0[2] = (byte) (-73);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-32);
      boolean boolean0 = Utf8.isWellFormed(byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      char[] charArray0 = new char[3];
      charArray0[0] = '\u0080';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      int int0 = Utf8.encodedLength(charBuffer0);
      assertEquals(4, int0);
  }
}
