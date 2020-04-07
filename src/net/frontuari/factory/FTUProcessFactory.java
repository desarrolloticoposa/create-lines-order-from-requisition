package net.frontuari.factory;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import net.frontuari.process.RequisitionPOCreate;

public class FTUProcessFactory implements IProcessFactory {

	@Override
	public ProcessCall newProcessInstance(String className) {
		
		/*if(className.equals("net.frontuari.process.ImportPayment"))
			return new ImportPayment();
		
		if(className.equals("net.frontuari.process.ImportProduct"))
			return new ImportProduct();*/
		if(className.equals("net.frontuari.process.RequisitionPOCreate"))
			return new RequisitionPOCreate();
		
		return null;
	}

}
