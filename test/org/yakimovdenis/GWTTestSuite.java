package org.yakimovdenis;

import org.yakimovdenis.client.GWTTestTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class GWTTestSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for GWTTest");
    suite.addTestSuite(GWTTestTest.class);
    return suite;
  }
}
