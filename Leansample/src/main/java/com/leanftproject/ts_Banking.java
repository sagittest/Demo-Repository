package com.leanftproject;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

import com.gargoylesoftware.htmlunit.javascript.host.Map;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.apitesting.uft.APITestResult;
import com.hp.lft.sdk.apitesting.uft.APITestRunner;
import com.virtusa.isq.vtaf.aspects.VTAFRecoveryMethods;
import com.virtusa.isq.vtaf.runtime.LeanFTTestBase;
import org.testng.annotations.Test;
import org.aspectj.weaver.ast.Var;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import com.virtusa.isq.vtaf.runtime.VTAFTestListener;
import com.virtusa.isq.vtaf.utils.PropertyHandler;


/**
 *  Class ts_Banking implements corresponding test suite
 *  Each test case is a test method in this class.
 */

@Listeners (VTAFTestListener.class)
public class ts_Banking extends LeanFTTestBase {



    /**
     * Data provider for Test case tc_TransferMoney.
     * @return data table
     */
    @DataProvider(name = "tc_TransferMoney")//,parallel = true)
    public Object[][] dataTable_tc_TransferMoney() {     	
    	return this.getDataTable("dt_TransferMoney");
    }

    /**
     * Data driven test case tc_TransferMoney.
     *
     * @throws Exception the exception
     */
    @VTAFRecoveryMethods(onerrorMethods = {}, recoveryMethods = {}) 
    //@Test (dataProvider = "tc_TransferMoney")
    public final void tc_TransferMoney(final String dt_TransferMoney_userName, final String dt_TransferMoney_password) throws Exception {
    	
    	//tc_TransferMoney
    	Lib_Banking.bc_Login(this, dt_TransferMoney_userName,dt_TransferMoney_password);
    	//select("lankaws.ele_ddTransferFrom","Money Market Account");
    	//Lib_Banking.verify(this);
    	
    } 
    
    @Test
    public void testwebservice() throws GeneralLeanFtException
    {    	
    	try {
    		HashMap<String,Object> inParams = new HashMap<>();
    		//Dictionary<String, Object> inParams;
    		//inParams.put("start", "aaa");
    		inParams.put("Suffix", "aaa");
    		//inParams.put("To", "bbb");
			//APITestResult result = APITestRunner.run("C:\\Users\\CMDVTAFRND02\\workspaceNeontest\\TestWebService",inParams);
    		APITestResult result = APITestRunner.run("C:\\Users\\CMDVTAFRND02\\Downloads\\newgitproject\\APITest2",inParams);
    		//APITestResult result = APITestRunner.run("http://localhost:8080/webserviceleanFtTestClient/sampleWebserviceTestProxy/TestClient.jsp?endpoint=http://localhost:11050/webserviceleanFtTest/services/WebserviceTest",inParams);
    		String a = result.toString();
    		Lib_Banking.testwebs(this, result.toString());
    	
    	} catch (GeneralLeanFtException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    
    @Test 
    public final void tc_verifyType() throws Exception {
    	
    	Lib_Banking.bc_verify(this);    	
    } 
    
    @Test
    public final void tc_verifyOpen() throws Exception {
    	
    	Lib_Banking.bc_verifyOpen(this);
    } 
    
    @Test
    public final void tc_verifySelect() throws Exception {
    	
    	Lib_Banking.bc_verifySelect(this);
    } 
    
    @Test
    public final void tc_verifyClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyclickAt(this);
    } 
    
    @Test
    public final void tc_verifyClick() throws Exception {
    	
    	Lib_Banking.bc_verifyclick(this);
    }
    
    @Test
    public final void tc_verifycheckElementPresent() throws Exception {
    	
    	Lib_Banking.bc_verifycheckElementPresent(this);
    }
    
    @Test
    public final void tc_verifygetDoubleProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetDoubleProperty(this);
    }
    
    @Test
    public final void tc_verifygetStringProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetStringProperty(this);
    }
    
    
    @Test
    public final void tc_verifygetIntegerProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetIntegerProperty(this);
    }
    
    @Test
    public final void tc_verifygetBooleanProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetBooleanProperty(this);
    }
    
    @Test
    public final void tc_verifypause() throws Exception {
    	
    	Lib_Banking.bc_verifyPause(this);
    }
    
    @Test
    public final void tc_verifyDoubleClick() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClick(this);
    }
    
    @Test
    public final void tc_verifyDoubleClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClickAt(this);
    }
    
    @Test
    public final void tc_verifyCheckObjectProperty() throws Exception {
    	
    	Lib_Banking.bc_verifycheckObjectProperty(this);
    }

    @Test
    public final void tc_verifygetObjectCount() throws Exception {
    	
    	Lib_Banking.bc_verifygetObjectCount(this);
    }
    
    @Test
    public final void tc_verifygoBack() throws Exception {
    	
    	Lib_Banking.bc_verifygoBack(this);
    }
    
    @Test
    public final void tc_verifyRetrieveString() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveString(this);
    }
    
    @Test
    public final void tc_verifyRetrieveInt() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveInt(this);
    }
    
    @Test
    public final void tc_verifyRetrieveDouble() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveDouble(this);
    }
    
    @Test
    public final void tc_verifyRetrieveFloat() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveFloat(this);
    }
    
    @Test
    public final void tc_verifyRetrieveBoolean() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveBoolean(this);
    }
    
       
    @Test
    public final void tc_verifyHandlePopup() throws Exception {
    	
    	Lib_Banking.bc_verifyHandlePopup(this);
    }
    
    @Test
    public final void tc_verifyKeyPress() throws Exception {
    	
    	Lib_Banking.bc_verifyKeyPress(this);
    }
    
    @Test
    public final void tc_verifycheckPattern() throws Exception {
    	
    	Lib_Banking.bc_verifycheckPattern(this);
    }
    
    @Test
    public final void tc_verifycreateDBConection() throws Exception {
    	
    	Lib_Banking.bc_verifyCreateDBConnection(this);
    }
    
    @Test
    public final void tc_verifyCheckDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifyCheckDBResults(this);
    }
    
    @Test
    public final void tc_verifygetStringDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifygetStringDBResults(this);
    }
    
    @Test
    public final void tc_verifygetBooleanDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifygetBooleanDBResults(this);
    }
    
    //@Test
    public final void tc_verifyCretaeUser() throws Exception {
    	
    	Lib_Banking.bc_verifyCretaeUser(this);
    }
    
    //@Test
    public final void tc_verifySwitchUser() throws Exception {
    	
    	Lib_Banking.bc_verifySwitchUser(this);
    }
    
    @Test
    public final void tc_verifyCheckImagePresent() throws Exception {
    	
    	Lib_Banking.bc_verifyCheckImagePresent(this);
    }    
  
    @Test
    public final void tc_verifyScreenshot() throws Exception {
    	
    	Lib_Banking.bc_verifyScreenshot(this);
    } 
    
    @Test
    public final void tc_verifyCheckDocument() throws Exception {
    	
    	Lib_Banking.bc_verifycheckDocument(this);
    }
    
   
    @Test
    public final void tc_verifygenerateData() throws Exception {
    	
    	Lib_Banking.bc_verifygenerateData(this);
    }
    
    @Test
    public final void tc_verifyCheckFileInfo() throws Exception {
    	
    	Lib_Banking.bc_checkFileInfo(this);
    }
    
    //@Test
    public final void tc_verifyresizeApplication() throws Exception {
    	
    	Lib_Banking.bc_verifyResizeApplication(this);
    }
    
    @Test
    public final void tc_verifygetElementInfo() throws Exception {
    	
    	Lib_Banking.bc_verifygetElementInfo(this);
    }
    
    @Test
    public final void tc_verifyExcel() throws Exception {
    	
    	Lib_Banking.bc_verifyExcel(this);
    }
    
    @Test
    public final void tc_verifyCloseWindow() throws Exception {
    	
    	Lib_Banking.bc_verifyCloseWindow(this);
    }
    
    @Test
    public final void tc_verifyCheckElementPresent() throws Exception {
    	
    	Lib_Banking.bc_verifyCloseWindow(this);
    }
    
    @Test
    public final void tc_verifyWriteToReport() throws Exception {
    	
    	Lib_Banking.bc_verifyWriteToReport(this);
    }
    
    //Second set of Test cases
    
    @Test 
    public final void vtc_verifyType() throws Exception {
    	
    	Lib_Banking.bc_verify(this);    	
    } 
    
    @Test
    public final void vtc_verifyOpen() throws Exception {
    	
    	Lib_Banking.bc_verifyOpen(this);
    } 
    
    @Test
    public final void vtc_verifySelect() throws Exception {
    	
    	Lib_Banking.bc_verifySelect(this);
    } 
    
    @Test
    public final void vtc_verifyClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyclickAt(this);
    } 
    
    @Test
    public final void vtc_verifyClick() throws Exception {
    	
    	Lib_Banking.bc_verifyclick(this);
    }
    
    @Test
    public final void vtc_verifycheckElementPresent() throws Exception {
    	
    	Lib_Banking.bc_verifycheckElementPresent(this);
    }
    
    @Test
    public final void vtc_verifygetDoubleProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetDoubleProperty(this);
    }
    
    @Test
    public final void vtc_verifygetStringProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetStringProperty(this);
    }
    
    
    @Test
    public final void vtc_verifygetIntegerProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetIntegerProperty(this);
    }
    
    @Test
    public final void vtc_verifygetBooleanProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetBooleanProperty(this);
    }
    
    @Test
    public final void vtc_verifypause() throws Exception {
    	
    	Lib_Banking.bc_verifyPause(this);
    }
    
    @Test
    public final void vtc_verifyDoubleClick() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClick(this);
    }
    
    @Test
    public final void vtc_verifyDoubleClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClickAt(this);
    }
    
    @Test
    public final void vtc_verifyCheckObjectProperty() throws Exception {
    	
    	Lib_Banking.bc_verifycheckObjectProperty(this);
    }

    @Test
    public final void vtc_verifygetObjectCount() throws Exception {
    	
    	Lib_Banking.bc_verifygetObjectCount(this);
    }
    
    @Test
    public final void vtc_verifygoBack() throws Exception {
    	
    	Lib_Banking.bc_verifygoBack(this);
    }
    
    @Test
    public final void vtc_verifyRetrieveString() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveString(this);
    }
    
    @Test
    public final void vtc_verifyRetrieveInt() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveInt(this);
    }
    
    @Test
    public final void vtc_verifyRetrieveDouble() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveDouble(this);
    }
    
    @Test
    public final void vtc_verifyRetrieveFloat() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveFloat(this);
    }
    
    @Test
    public final void vtc_verifyRetrieveBoolean() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveBoolean(this);
    }
    
       
    @Test
    public final void vtc_verifyHandlePopup() throws Exception {
    	
    	Lib_Banking.bc_verifyHandlePopup(this);
    }
    
    @Test
    public final void vtc_verifyKeyPress() throws Exception {
    	
    	Lib_Banking.bc_verifyKeyPress(this);
    }
    
    @Test
    public final void vtc_verifycheckPattern() throws Exception {
    	
    	Lib_Banking.bc_verifycheckPattern(this);
    }
    
    @Test
    public final void vtc_verifycreateDBConection() throws Exception {
    	
    	Lib_Banking.bc_verifyCreateDBConnection(this);
    }
    
    @Test
    public final void vtc_verifyCheckDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifyCheckDBResults(this);
    }
    
    @Test
    public final void vtc_verifygetStringDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifygetStringDBResults(this);
    }
    
    @Test
    public final void vtc_verifygetBooleanDBResults() throws Exception {
    	
    	Lib_Banking.bc_verifygetBooleanDBResults(this);
    }
    
    
    //@Test
    public final void vtc_verifySwitchUser() throws Exception {
    	
    	Lib_Banking.bc_verifySwitchUser(this);
    }
    
    @Test
    public final void vtc_verifyCheckImagePresent() throws Exception {
    	
    	Lib_Banking.bc_verifyCheckImagePresent(this);
    }    
  
    @Test
    public final void vtc_verifyScreenshot() throws Exception {
    	
    	Lib_Banking.bc_verifyScreenshot(this);
    } 
    
    @Test
    public final void vtc_verifyCheckDocument() throws Exception {
    	
    	Lib_Banking.bc_verifycheckDocument(this);
    }
    
   
    @Test
    public final void vtc_verifygenerateData() throws Exception {
    	
    	Lib_Banking.bc_verifygenerateData(this);
    }
    
    @Test
    public final void vtc_verifyCheckFileInfo() throws Exception {
    	
    	Lib_Banking.bc_checkFileInfo(this);
    }
    
    //@Test
    public final void vtc_verifyresizeApplication() throws Exception {
    	
    	Lib_Banking.bc_verifyResizeApplication(this);
    }
    
    @Test
    public final void vtc_verifygetElementInfo() throws Exception {
    	
    	Lib_Banking.bc_verifygetElementInfo(this);
    }
    
    @Test
    public final void vtc_verifyExcel() throws Exception {
    	
    	Lib_Banking.bc_verifyExcel(this);
    }
    
    @Test
    public final void vtc_verifyCloseWindow() throws Exception {
    	
    	Lib_Banking.bc_verifyCloseWindow(this);
    }
    
    @Test
    public final void vtc_verifyCheckElementPresent() throws Exception {
    	
    	Lib_Banking.bc_verifyCloseWindow(this);
    }
    
    @Test
    public final void vtc_verifyWriteToReport() throws Exception {
    	
    	Lib_Banking.bc_verifyWriteToReport(this);
    }
    
    //Last set
    
    @Test 
    public final void ytc_verifyType() throws Exception {
    	
    	Lib_Banking.bc_verify(this);    	
    } 
    
    @Test
    public final void ytc_verifyOpen() throws Exception {
    	
    	Lib_Banking.bc_verifyOpen(this);
    } 
    
    @Test
    public final void ytc_verifySelect() throws Exception {
    	
    	Lib_Banking.bc_verifySelect(this);
    } 
    
    @Test
    public final void ytc_verifyClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyclickAt(this);
    } 
    
    @Test
    public final void ytc_verifyClick() throws Exception {
    	
    	Lib_Banking.bc_verifyclick(this);
    }
    
    @Test
    public final void ytc_verifycheckElementPresent() throws Exception {
    	
    	Lib_Banking.bc_verifycheckElementPresent(this);
    }
    
    @Test
    public final void ytc_verifygetDoubleProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetDoubleProperty(this);
    }
    
    @Test
    public final void ytc_verifygetStringProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetStringProperty(this);
    }
    
    
    @Test
    public final void ytc_verifygetIntegerProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetIntegerProperty(this);
    }
    
    @Test
    public final void ytc_verifygetBooleanProperty() throws Exception {
    	
    	Lib_Banking.bc_verifygetBooleanProperty(this);
    }
    
    @Test
    public final void ytc_verifypause() throws Exception {
    	
    	Lib_Banking.bc_verifyPause(this);
    }
    
    @Test
    public final void ytc_verifyDoubleClick() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClick(this);
    }
    
    @Test
    public final void ytc_verifyDoubleClickAt() throws Exception {
    	
    	Lib_Banking.bc_verifyDoubleClickAt(this);
    }
    
    @Test
    public final void ytc_verifyCheckObjectProperty() throws Exception {
    	
    	Lib_Banking.bc_verifycheckObjectProperty(this);
    }

    @Test
    public final void ytc_verifygetObjectCount() throws Exception {
    	
    	Lib_Banking.bc_verifygetObjectCount(this);
    }
    
    @Test
    public final void ytc_verifygoBack() throws Exception {
    	
    	Lib_Banking.bc_verifygoBack(this);
    }
    
    @Test
    public final void ytc_verifyRetrieveString() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveString(this);
    }
    
    @Test
    public final void ytc_verifyRetrieveInt() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveInt(this);
    }
    
    @Test
    public final void ytc_verifyRetrieveDouble() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveDouble(this);
    }
    
    @Test
    public final void ytc_verifyRetrieveFloat() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveFloat(this);
    }
    
    @Test
    public final void ytc_verifyRetrieveBoolean() throws Exception {
    	
    	Lib_Banking.bc_verifyRetriveBoolean(this);
    }
    
    @Test
    public final void ytc_verifyHandlePopup() throws Exception {
    	
    	Lib_Banking.bc_verifyHandlePopup(this);
    }
    
    @Test
    public final void ytc_verifyKeyPress() throws Exception {
    	
    	Lib_Banking.bc_verifyKeyPress(this);
    }
    
    @Test
    public final void ytc_verifycheckPattern() throws Exception {
    	
    	Lib_Banking.bc_verifycheckPattern(this);
    }
    
    
    public final Object[][] getDataTable(final String... tableNames) {
        String[] tables = tableNames;
        return this.getTableArray(getVirtualDataTable(tables));
    }

}