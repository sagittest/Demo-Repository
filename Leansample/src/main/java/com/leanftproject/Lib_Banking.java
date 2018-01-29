package com.leanftproject;

import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.virtusa.isq.vtaf.runtime.LeanFTTestBase;
import com.virtusa.isq.vtaf.runtime.pages.lankaws;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;

import com.virtusa.isq.vtaf.utils.PropertyHandler;

/**
 *  Class Lib_Banking contains reusable business components 
 *  Each method in this class correspond to a reusable business component.
 */
public class Lib_Banking {

    /**
     *  Business component bc_Login.
     * 
     */
	public final static void testwebs(final LeanFTTestBase caller,String val)
	{
		caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent",val.toString()); 
	}
	
    public final static void bc_Login(final LeanFTTestBase caller, final String prm_UserName, final String prm_Password) throws Exception {
        //bc_Login
    	
    	caller.open("http://lanka.ws/banking","3000");
     
        caller.checkElementPresent("lankaws.tf_UserName", false, "dsfsdf"); 
       // caller.checkElementNotPresent("lankaws.tf_UserName","UserName","true",false, "dsfsdf");
       
       caller.type("lankaws.tf_UserName",prm_UserName);
       //caller.type("lankaws.tf_Password",prm_Password);
       //caller.click("lankaws.btn_Login");
       //caller.mouseMoveAndClick("700,800", "0,0", "2000");
       
       caller.clickAt("lankaws.btn_Login", "0,0");//("lankaws.btn_Login");
       caller.pause("5000", "test");
       
       
       //caller.closeWindow();
       caller.select("lankaws.ele_ddTransferFrom","Money Market Account");
       caller.type("lankaws.tf_date", "26/12/2017");
       caller.type("lankaws.tf_rcvDate","27/12/2017");
       caller.type("lankaws.tf_transAmount","10.00");
       caller.pause("3000", "test");
       caller.click("lankaws.btn_Transfer");
       /*
    	//checking double click
    	caller.open("http://unixpapa.com/js/testmouse.html","3000");
    	caller.doubleClickAt("lankaws.tf_doubleclick","0,0");
    	Thread.sleep(10000);
    	
    	//check Fire Event
    	caller.open("http://www.google.lk","3000");
    	//caller.fireEvent("KEY%type=automatio","2000"); 
    	//caller.fireEvent("MOUSE%Move=0,10","2000");
    	caller.fireEvent("VERIFY%https://www.google.lk/", "2000");
    	Thread.sleep(10000);*/
    	
    	//check Element Not Present
    	//caller.open("http://www.google.lk","3000");
    	//caller.checkElementPresent("lankaws.tf_checkElementnotpresent");
    	//caller.checkElementPresent("lankaws.tf_checkElementnotpresent", true, "");
    	//caller.checkElementNotPresent("lankaws.tf_checkElementnotpresent", "a", "true", true,"Error");
    	
    	
    	//caller.open("http://unixpapa.com/js/testmouse.html","3000");
    	//caller.store("mailcount", "String", lankaws.tf_doubleclick);
    	//caller.retrieve("mailcount", "String");
    	
    	//caller.store("mailcount", "Int", 10);
    	//caller.retrieve("mailcount", "Int");
    	
    	//caller.store("mailcount", "Double", 10.0111333332220);
    	//caller.retrieve("mailcount", "Double");
    	
    	//caller.store("mailcount", "float", 10.00);
    	//caller.retrieve("mailcount", "float");
    	
    	//caller.store("mailcount", "Boolean", true);
    	//caller.retrieve("mailcount", "Boolean");
    	
    	//caller.open("http://www.google.lk","3000");
    	//caller.fail("Failtest");
    	//caller.waitForElement("lankaws.tf_checkElementnotpresent", "2000");
    	
    	
    	//caller.checkTextPresent("//table/tbody/tr/td[1]/a[1]", true, "error");
    	//caller.checkTextPresent(objSearchText, stopOnFailure, customError);
    	//caller.open("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox", "2000");
    	//Thread.sleep(10000);
    	//caller.click("lankaws.ele_linkcheckbox");
    	//caller.check("lankaws.ele_linkcheckbox", true);
    	
    	//caller.getObjectCount("lankaws.tf_checkElementnotpresent");
    	//Thread.sleep(5000);
    	//caller.goBack("2000");
    	//caller.mouseOver("lankaws.tf_checkElementnotpresent");
    	
    	//caller.getStringProperty("lankaws.tf_checkElementnotpresent", "TEXT:");
    	//caller.getStringProperty("lankaws.btn_Transfer", "VALUE:");
        //Thread.sleep(5000);
    	//caller.type("lankaws.tf_rcvDate","200");
      	
    	//caller.getDoubleProperty("lankaws.tf_checkElementnotpresent","", "TEXT:");
    	//caller.getBooleanProperty("lankaws.tf_checkElementnotpresent","", "TEXT:");
    	//Thread.sleep(5000);
    	//caller.handlePopup("ok", "2000", false);
     	//Thread.sleep(5000);     	
     	//caller.checkObjectProperty("lankaws.tf_date", "class", "hasDatepicker", false, "Error");
     	//Thread.sleep(3000);
     	//caller.click("lankaws.btn_Transfer");
       
        caller.type("lankaws.tfcomment","test comment");
     	caller.pause("2000", "test");
     	caller.click("lankaws.btn_confirm");
     	caller.pause("4000", "test");     	
     	
     	Robot robot = new Robot();
	    //robot.keyPress(KeyEvent.VK_TAB);
	    
	    //robot.keyPress(KeyEvent.VK_ENTER);
	    //caller.pause("2000", "test");
	    robot.keyPress(KeyEvent.VK_ENTER);	    
	   // caller.createDBConnection("mssql", "SQLEXPRESS", url, "", );
     // caller.checkChartContent(chartName, identifire, vendor, type, lData, stopOnFailure, customError);
      //Thread.sleep(4000);
    	//caller.checkPattern("lankaws.tf_checkElementnotpresent", "ss1", false, "Error");
    	
     	//DB
    	//caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa", "1qaz2wsx@");
    	//caller.getStringDBResult("SQLEXPRESS", "select * from Test");    	
    	//caller.checkDBResults("SQLEXPRESS", "select name from Test where id = 1", "aaa", false, "Error");
     	//caller.getIntDBResult("SQLEXPRESS", "select id from Test where name = 'aaa'");
    	//caller.putLeanFTInstances("SQLEXPRESS", caller.getBrowser());
    	//caller.switchUser("SQLEXPRESS");
    	//caller.createUser("SQLEXPRESS", "chrome", "");
    	//caller.getBooleanDBResult("SQLEXPRESS", "select boolvalue from Test where name = 'aaa'");
    	//Thread.sleep(5000);
    	//caller.checkImagePresent("img[@src='images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']",false);
    	//img[@src='images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']"
    	//Thread.sleep(5000);
    	//caller.screenShot("aaa");
    	//caller.getElementInfo("lankaws.tf_checkElementnotpresent", "");
    	//caller.rightClick("lankaws.tf_checkElementnotpresent");
    	//caller.resizeApplication("MAXIMIZE", "700");
    	//Thread.sleep(5000);
    	//caller.resizeApplication("RESIZE", "700,800");
    	//Thread.sleep(5000);
    	//caller.checkTextValue("lankaws.btn_Transfer", "bbb");
    	//caller.checkDocument(docType, filePath, pageNumberRange, verifyType, inputString, stopOnFaliure, customError);
    	//caller.checkDocument("pdf", "C:\\Users\\CMDVTAFRND02\\Desktop\\testpdf.pdf", "1-1", "EXISTS","The pdf995 suite of products ", false, "error");
    	//String a = caller.generateData("String", 3);
    	//caller.generateData("Alphanumeric", 3);
    	//caller.type("lankaws.tf_checkElementnotpresent",a);
    	//caller.checkFileInfo("C:\\Users\\CMDVTAFRND02\\Desktop\\testpdf.pdf", "EXIST", false, "Error");
    	//caller.checkImagePresent("test.png", false);
    	//caller.open("http://www.javascripter.net/faq/confirm.htm", "2000");
       //Thread.sleep(5000);
    	//caller.rightClick("lankaws.elelblTitle");
       //caller.handlePopup("action=cancel", "2000", false);
    	//caller.open("http://tablesorter.com/docs/", "2000");
       //Thread.sleep(5000);
       //caller.checkSorting(objectName, type, pattern, order, stopOnFailure, customError);
       //caller.checkSorting("lankaws.ele_table", "string", "Aa1", "ascending", false, "Error");
       //caller.handlePopup("action=ok", "2000", false);
    	    	
       //caller.open("https://canvasjs.com/html5-javascript-line-chart/","2000");
       //Thread.sleep(5000);
       //caller.checkTextPresent("lankaws.tf_checkElementnotpresent", false, "Error");
       //caller.elementChartElementPresent("\\div[@id='chartContainer']");
       //caller.sendEmail("sanirm@gmail.com", "sanirm@gmail.com", "test", "test");       
       //Thread.sleep(10000);   	    	
    	//Excel Verification    	
    	//Object a = null;
    	//Object[] b = null;
        //caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","ROWCOUNT", 5, false,b);
        //caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","COLCOUNT", 1, false,b);
        //caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","TABLEDATA", "Test|Test1|Test2|Test|Test4", false,b);
        //caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","RELATIVE", "Test,1,Test1,Test4,Test2", false,b);
        //caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","TABLECELL", "0,0,Test", false,b);
    	
	    //Thread.sleep(10000);
    }
    
    public final static void bc_verify(final LeanFTTestBase caller){
    	
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent","second Test Case");   	
	    
    }
    
    public final static void bc_verifyOpen(final LeanFTTestBase caller)
    {  	
    	
    	caller.open("http://lanka.ws/banking","3000");
    }
    
    public final static void bc_verifySelect(final LeanFTTestBase caller)
    {
       caller.open("http://lanka.ws/banking","3000");
        
       caller.type("lankaws.tf_UserName","Test");
       caller.clickAt("lankaws.btn_Login", "0,0");//("lankaws.btn_Login");
       caller.pause("5000", "test");
       caller.select("lankaws.ele_ddTransferFrom","Money Market Account");
      
     	
     }
    
    public final static void bc_verifyclickAt(final LeanFTTestBase caller)
    {
    	caller.open("http://lanka.ws/banking","3000");
        
    	caller.type("lankaws.tf_UserName","Test");
    	caller.clickAt("lankaws.btn_Login", "0,0");
    	caller.pause("5000", "test");        
        caller.select("lankaws.ele_ddTransferFrom","Money Market Account");
        
     }
    
    public final static void bc_verifyclick(final LeanFTTestBase caller)
    {
    	caller.open("http://lanka.ws/banking","3000");
        
    	caller.type("lankaws.tf_UserName","Test");
    	try {
			caller.click("lankaws.btn_Login");
		} catch (GeneralLeanFtException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
     }
    
    public final static void bc_verifycheckElementPresent(final LeanFTTestBase caller)
    {
    	caller.open("http://lanka.ws/banking","3000");
        
    	caller.type("lankaws.tf_UserName","Test");
    	try {
			caller.click("lankaws.btn_Login");
		} catch (GeneralLeanFtException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
     }
    
    public final static void bc_verifygetDoubleProperty(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent",10.25);
    	caller.pause("3000", "test");  
    	caller.getDoubleProperty("lankaws.tf_checkElementnotpresent","", "TEXT:");
    	         
       
     }
    
    public final static void bc_verifygetStringProperty(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent","aaa");
    	caller.pause("3000", "test"); 
    	caller.getStringProperty("lankaws.tf_checkElementnotpresent", "TEXT:");
    	
    }
    
    public final static void bc_verifyFail(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent","aaa");
    	caller.getStringProperty("lankaws.tf_checkElementnotpresent", "TEXT:");
    	caller.getStringProperty("lankaws.btn_Transfer", "VALUE:");
    	caller.pause("5000", "test");  
    	caller.fail("Test Fail");
    }
    
    public final static void bc_verifygetIntegerProperty(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent",10);
    	caller.pause("3000", "test"); 
    	caller.getIntegerProperty("lankaws.tf_checkElementnotpresent", "TEXT:");    	   
    }
    
    public final static void bc_verifygetBooleanProperty(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent",true);
    	caller.pause("3000", "test"); 
    	caller.getBooleanProperty("lankaws.tf_checkElementnotpresent", "TEXT:");    	   
    }
    
    public final static void bc_verifyPause(final LeanFTTestBase caller)
    {
    	caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent",true);
    	caller.pause("3000", "test");   	   
    }
    
    public final static void bc_verifyDoubleClick(final LeanFTTestBase caller)
    {
    	//checking double click
    	caller.open("http://unixpapa.com/js/testmouse.html","3000");
    	caller.doubleClickAt("lankaws.tf_doubleclick","0,0");
    	caller.pause("5000", "test"); 
    }
    
    public final static void bc_verifyDoubleClickAt(final LeanFTTestBase caller)
    {
    	//checking double click
    	caller.open("http://unixpapa.com/js/testmouse.html","3000");
    	caller.doubleClickAt("lankaws.tf_doubleclick","0,0");
    	caller.pause("5000", "test");   
    }
    
    public final static void bc_verifycheckObjectProperty(final LeanFTTestBase caller)
    {
    	caller.open("http://lanka.ws/banking","3000");
        caller.type("lankaws.tf_UserName","test");
        caller.clickAt("lankaws.btn_Login", "0,0");
        caller.pause("5000", "test");
        caller.select("lankaws.ele_ddTransferFrom","Money Market Account");
    	caller.checkObjectProperty("lankaws.tf_date", "class", "hasDatepicker", false, "Error");
    }
    
    public final static void bc_verifygetObjectCount(final LeanFTTestBase caller)
    {
    	caller.open("http://lanka.ws/banking","3000");
        caller.pause("3000", "test");
        caller.getObjectCount("lankaws.tf_checkElementnotpresent");
    }
    
	public final static void bc_verifygoBack(final LeanFTTestBase caller)
    {
		caller.open("http://lanka.ws/banking","3000");
	    
		caller.type("lankaws.tf_UserName","Test");
		caller.clickAt("lankaws.btn_Login", "0,0");
		caller.pause("5000", "test");
		caller.goBack("3000");
    }
	
	public final static void bc_verifyRetriveString(final LeanFTTestBase caller)
    {
		caller.open("http://unixpapa.com/js/testmouse.html","3000");
		caller.store("mailcount", "String", lankaws.tf_doubleclick);
    	caller.retrieve("mailcount", "String");    	
    	
    }
	
	public final static void bc_verifyRetriveInt(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.store("mailcount", "Int", 10);
    	caller.retrieve("mailcount", "Int");
    }
	
	public final static void bc_verifyRetriveDouble(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		
    	caller.store("mailcount", "Double", 10.0111333332220);
    	caller.retrieve("mailcount", "Double");
    	
    }
	
	public final static void bc_verifyRetriveFloat(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.store("mailcount", "float", 10.00);
    	caller.retrieve("mailcount", "float");    	
    	
    }
	
	public final static void bc_verifyRetriveBoolean(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");    	
    	
    	caller.store("mailcount", "Boolean", true);
    	caller.retrieve("mailcount", "Boolean");
    }
	
	public final static void bc_verifyHandlePopup(final LeanFTTestBase caller)
    {
		caller.open("http://www.javascripter.net/faq/confirm.htm", "2000");
		caller.pause("3000", "test");
		try {
			caller.click("lankaws.btntry");
		} catch (GeneralLeanFtException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		caller.pause("5000", "test");
		try {
			caller.handlePopup("action=cancel", "2000", false);
			caller.pause("2000", "test");
			caller.handlePopup("action=ok", "2000", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
    }
	
	public final static void bc_verifyKeyPress(final LeanFTTestBase caller)
    {
		try {
			caller.open("http://lanka.ws/banking","3000");
	        
	        caller.type("lankaws.tf_UserName","test");	       
	       
	        caller.clickAt("lankaws.btn_Login", "0,0");
	        caller.pause("5000", "test");
	       
	       caller.select("lankaws.ele_ddTransferFrom","Money Market Account");
	       caller.type("lankaws.tf_date", "26/12/2017");
	       caller.type("lankaws.tf_rcvDate","27/12/2017");
	       caller.type("lankaws.tf_transAmount","10.00");
	       caller.pause("3000", "test");
	       caller.click("lankaws.btn_Transfer");
	    	
		} catch (GeneralLeanFtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
        caller.type("lankaws.tfcomment","test comment");
     	caller.pause("2000", "test");
     	
     	Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);		    
		    robot.keyPress(KeyEvent.VK_ENTER);
		    caller.pause("2000", "test");
		    robot.keyPress(KeyEvent.VK_ENTER);	
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
    }
	
	public final static void bc_verifycheckPattern(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
    	caller.type("lankaws.tf_checkElementnotpresent","SS1");
    	caller.pause("3000", "test"); 
    	caller.checkPattern("lankaws.tf_checkElementnotpresent", "SS1", false, "Error");
		
    }
	
	public final static void bc_verifyCreateDBConnection(final LeanFTTestBase caller)
    {
		caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa", "1qaz2wsx@");
    	
    }
	
	public final static void bc_verifyCheckDBResults(final LeanFTTestBase caller)
    {
		caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa", "1qaz2wsx@");
    	caller.checkDBResults("SQLEXPRESS", "select name from Test where id = 1", "aaa", false, "Error");
     	
		
    }
	
	public final static void bc_verifygetStringDBResults(final LeanFTTestBase caller)
    {
		caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa", "1qaz2wsx@");
		caller.getStringDBResult("SQLEXPRESS", "select * from Test");      	
		
    }
	
	public final static void bc_verifygetBooleanDBResults(final LeanFTTestBase caller)
    {
		caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa", "1qaz2wsx@");
		caller.getBooleanDBResult("SQLEXPRESS", "select boolvalue from Test where name = 'aaa'");
		
    }
	
	public final static void bc_verifyCretaeUser(final LeanFTTestBase caller)
    {
		caller.createUser("SQLEXPRESS", "explorer", "");		
    }
	
	public final static void bc_verifySwitchUser(final LeanFTTestBase caller)
    {
		caller.switchUser("SQLEXPRESS");		
    }
	
	public final static void bc_verifyCheckImagePresent(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.pause("5000", "test");
		caller.checkImagePresent("img[@src='images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']",true);
		caller.pause("3000", "test");
    }
	
	public final static void bc_verifyScreenshot(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.pause("5000", "test");
		try {
			caller.screenShot("aaa");
		} catch (GeneralLeanFtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		caller.pause("3000", "test");
    }
	
	public final static void bc_verifycheckDocument(final LeanFTTestBase caller)
    {
		caller.checkDocument("pdf", "C:\\Users\\CMDVTAFRND02\\Desktop\\testpdf.pdf", "1-1", "EXISTS","The pdf995 suite of products ", false, "error");
    }
	
	public final static void bc_verifygenerateData(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.pause("3000", "test");
		String a = caller.generateData("String", 3);
		caller.type("lankaws.tf_checkElementnotpresent",a);
    }
	
	public final static void bc_checkFileInfo(final LeanFTTestBase caller)
    {
		caller.checkFileInfo("C:\\Users\\CMDVTAFRND02\\Desktop\\testpdf.pdf", "EXIST", false, "Error");
    }
	
	public final static void bc_verifyResizeApplication(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.resizeApplication("RESIZE", "700,800");
    }
	
	public final static void bc_verifygetElementInfo(final LeanFTTestBase caller)
    {
		caller.open("http://www.google.lk","3000");
		caller.getElementInfo("lankaws.tf_checkElementnotpresent", "");
    }
	
	public final static void bc_verifyExcel(final LeanFTTestBase caller)
    {
		Object a = null;
    	Object[] b = null;
        caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","ROWCOUNT", 5, false,b);
        caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","COLCOUNT", 1, false,b);
        caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","TABLEDATA", "Test|Test1|Test2|Test|Test4", false,b);
        caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","RELATIVE", "Test,1,Test1,Test4,Test2", false,b);
        caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1","TABLECELL", "0,0,Test", false,b);
    }
	
	public final static void bc_verifyCloseWindow(final LeanFTTestBase caller)
    {
		caller.open("http://lanka.ws/banking","3000");
	     
        caller.type("lankaws.tf_UserName","test");
        caller.clickAt("lankaws.btn_Login", "0,0");//("lankaws.btn_Login");
        caller.pause("5000", "test");      
       
        caller.closeWindow();
    }
	
	public final static void bc_verifyWriteToReport(final LeanFTTestBase caller)
    {
		caller.open("http://lanka.ws/banking","3000");
	     
        caller.type("lankaws.tf_UserName","test");
        caller.clickAt("lankaws.btn_Login", "0,0");//("lankaws.btn_Login");
        caller.pause("5000", "test");      
        caller.writeToReport("Test Write to report");
        caller.closeWindow();
    }
	
	public final static void bc_verify100stepTestcase(final LeanFTTestBase caller) throws Exception
	{
		
		caller.open("http://lanka.ws/banking", "3000");
		caller.checkElementPresent("lankaws.tf_UserName", false, "dsfsdf");
		caller.type("lankaws.tf_UserName", "test");
		caller.clickAt("lankaws.btn_Login", "0,0");
		caller.pause("5000", "test");
		caller.select("lankaws.ele_ddTransferFrom", "Money Market Account");
		caller.type("lankaws.tf_date", "26/12/2017");
		caller.type("lankaws.tf_rcvDate", "27/12/2017");
		caller.type("lankaws.tf_transAmount", "10.00");
		caller.pause("3000", "test");
		caller.checkObjectProperty("lankaws.tf_date", "class", "hasDatepicker", false, "Error");
		caller.getStringProperty("lankaws.btn_Transfer", "VALUE:");
		caller.click("lankaws.btn_Transfer");
		caller.pause("2000", "test");
		caller.type("lankaws.tfcomment", "test comment");
		caller.pause("2000", "test");
		caller.click("lankaws.btn_confirm");
		caller.pause("4000", "test");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		caller.goBack("2000");
		//caller.closeWindow();

		// checking double click
		//caller.open("http://unixpapa.com/js/testmouse.html", "3000");
		//caller.pause("5000", "test");
		//caller.doubleClick("lankaws.tf_doubleclick", "");
		//caller.pause("5000", "test");

		caller.open("http://unixpapa.com/js/testmouse.html", "3000");
		caller.doubleClickAt("lankaws.tf_doubleclick", "0,0");
		//caller.closeWindow();

		// check Fire Event
		caller.open("http://www.google.lk", "3000");
		caller.fireEvent("KEY%type=https://www.google.lk/", "2000");
		caller.fireEvent("MOUSE%Move=0,10", "2000");
		caller.fireEvent("VERIFY%https://www.google.lk/", "2000");
		//caller.closeWindow();

		caller.open("http://unixpapa.com/js/testmouse.html", "3000");
		caller.store("mailcount", "String", lankaws.tf_doubleclick);
		caller.retrieve("mailcount", "String");
		caller.pause("5000", "test");

		caller.store("mailcount", "Int", 10);
		caller.retrieve("mailcount", "Int");

		caller.store("mailcount", "Double", 10.0111333332220);
		caller.retrieve("mailcount", "Double");

		caller.store("mailcount", "float", 10.00);
		caller.retrieve("mailcount", "float");

		caller.store("mailcount", "Boolean", true);
		caller.retrieve("mailcount", "Boolean");

		caller.open("http://www.google.lk", "3000");
		caller.waitForElement("lankaws.tf_checkElementnotpresent", "2000");

		caller.open("http://lanka.ws/banking", "3000");
		caller.checkTextPresent("//table/tbody/tr/td[1]/a[1]", true, "error");

		caller.open("http://www.google.lk", "3000");
		caller.getObjectCount("lankaws.tf_checkElementnotpresent");
		caller.pause("2000", "test");

		caller.mouseOver("lankaws.tf_checkElementnotpresent");

		caller.type("lankaws.tf_checkElementnotpresent", "aaa");
		caller.pause("3000", "test");
		caller.getStringProperty("lankaws.tf_checkElementnotpresent", "TEXT:");

		caller.open("http://www.google.lk", "3000");
		caller.type("lankaws.tf_checkElementnotpresent", 10.25);
		caller.getDoubleProperty("lankaws.tf_checkElementnotpresent", "", "TEXT:");

		caller.open("http://www.google.lk", "3000");
		caller.type("lankaws.tf_checkElementnotpresent", true);
		caller.getBooleanProperty("lankaws.tf_checkElementnotpresent", "", "TEXT:");
		caller.pause("5000", "test");

		caller.open("http://www.google.lk", "3000");
		caller.type("lankaws.tf_checkElementnotpresent", "SS1");
		caller.checkPattern("lankaws.tf_checkElementnotpresent", "SS1", false, "Error");

		// DB
		caller.createDBConnection("mssql", "SQLEXPRESS", "jdbc:sqlserver://localhost:59637;databaseName=Test1", "sa","1qaz2wsx@");
		caller.getStringDBResult("SQLEXPRESS", "select * from Test");
		caller.checkDBResults("SQLEXPRESS", "select name from Test where id = 1", "aaa", false, "Error");
		caller.getIntDBResult("SQLEXPRESS", "select id from Test where name = 'aaa'");
		//caller.createUser("SQLEXPRESS", "explorer", "");
		//caller.switchUser("SQLEXPRESS");		

		caller.open("http://www.google.lk", "3000");
		caller.checkImagePresent("img[@src='images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']", false);

		caller.screenShot("aaa");
		caller.getElementInfo("lankaws.tf_checkElementnotpresent", "");

		
		//caller.closeWindow();

		caller.checkDocument("pdf", "C:\\Users\\CMDVTAFRND02\\Desktop\\testpdf.pdf", "1-1", "EXISTS","The pdf995 suite of products ", false, "error");

		caller.open("http://www.google.lk", "3000");
		String a = caller.generateData("String", 3);
		caller.generateData("Alphanumeric", 3);
		caller.type("lankaws.tf_checkElementnotpresent", a);

		caller.open("http://www.javascripter.net/faq/confirm.htm", "2000");
		caller.click("lankaws.btntry");
		caller.pause("5000", "test");
		caller.handlePopup("action=cancel", "2000", false);
		caller.pause("3000", "test");
		caller.handlePopup("action=ok", "2000", false);

		// caller.sendEmail("sanirm@gmail.com", "sanirm@gmail.com", "test","test");
		// Thread.sleep(10000);
		
		// Excel Verification
		Object a1 = null;
		Object[] b = null;
		caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1", "ROWCOUNT", 5, false, b);
		caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1", "COLCOUNT", 1, false, b);
		caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1", "TABLEDATA","Test|Test1|Test2|Test|Test4", false, b);
		caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1", "RELATIVE","Test,1,Test1,Test4,Test2", false, b);
		caller.verifyExcel("C:\\Users\\CMDVTAFRND02\\Desktop\\Testexcel.xlsx", "Sheet1", "TABLECELL", "0,0,Test", false,b);

		
		
		caller.open("http://lanka.ws/banking", "3000");

		caller.type("lankaws.tf_UserName", "test");
		caller.clickAt("lankaws.btn_Login", "0,0");
		caller.pause("5000", "test");
		caller.writeToReport("Test Write to report");
		caller.resizeApplication("MAXIMIZE", "700");
		caller.resizeApplication("RESIZE", "700,800");
		
		
	}
	
}

