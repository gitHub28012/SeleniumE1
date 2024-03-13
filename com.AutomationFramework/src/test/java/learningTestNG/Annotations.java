package learningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void test1() {
	  Reporter.log("This is @Test 1", true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("This is BeforeMethod", true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("This is AfterMethod", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("This is BeforeClass", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("This is AfterClass", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("This is BeforeTest", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("This is AfterTest", true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("This is BeforeSuite", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("This is AfterSuite", true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("This is @Test 2", true);
  }

}
