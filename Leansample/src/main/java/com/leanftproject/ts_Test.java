package com.leanftproject;

import org.testng.annotations.Test;
import com.virtusa.isq.vtaf.runtime.LeanFTTestBase;

public class ts_Test extends LeanFTTestBase{
	
	
	
	@Test 
    public final void tc_verify100stepTestcase() throws Exception {
		//tc_TransferMoney
		
    	Lib_Banking.bc_verify100stepTestcase(this);
    	//select("lankaws.ele_ddTransferFrom","Money Market Account");
    	//Lib_Banking.verify(this);
    	
    } 

}
