package Test_Cases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base_Class.Get_Excel;
import Base_Class.WrapperClass;
import Pages.About_Page;
import Pages.AddtoCart_Page;
import Pages.Login_page;

public class Demo_Sauce_testng extends Get_Excel{
	
	 static WebDriver dr;
	 
	 @BeforeClass
	  public void beforeMethod() {
		 get_Excel();
		 // dr=Library.Launch_browser("CHROME","https://www.saucedemo.com/");
		  
	  }
  @Test(dataProvider="logindata")
  public void Logindata(String Username,String Password) throws InterruptedException {
	  System.out.println("rizwana");
	  dr=WrapperClass.Launch_browser("CHROME","https://www.saucedemo.com/");
	 Login_page Ln=new Login_page(dr);
	  System.out.println(Username+" "+Password);
	Ln.Total_Login(Username,Password);
//	searchA2B();
//	AboutPage(); 
  }
  
  @DataProvider(name="logindata")
  public String[][] data_Provider() {
	  System.out.println("return data");
	  return testdata;
  }
  
  
  public void searchA2B()
  {
	  AddtoCart_Page A1=new AddtoCart_Page(dr);
	  A1.SearchA2Z();
	  A1.Addtocart_btn();
  }
  
  
  public void AboutPage() throws InterruptedException
  {
	  About_Page A2=new About_Page(dr);
	  A2.link_for_aboutpage();
	  A2.About_Saucedemo();
	  A2.any_btn();
  }
  
  @AfterMethod()
  public void hd() throws InterruptedException
  {
	  searchA2B();
		AboutPage(); 
		dr.close();
  }
  
  
  
  
  
  
  
  
  
  
  
  

  

}
