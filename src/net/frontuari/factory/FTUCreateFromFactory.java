package net.frontuari.factory;

import org.compiere.grid.ICreateFrom;
import org.compiere.grid.ICreateFromFactory;
import org.compiere.model.GridTab;
import org.compiere.model.I_C_Order;

import net.frontuari.webui.apps.form.WCreateFromRequisitionUI;

/**
 * 
 * @author Carlos Vargas cvargas@frontuari.net
 *
 */
public class FTUCreateFromFactory implements ICreateFromFactory {
	@Override
	public ICreateFrom create(GridTab mTab) 
	{
		String tableName = mTab.getTableName();
		if (tableName.equals(I_C_Order.Table_Name))
			return new WCreateFromRequisitionUI(mTab);
		
		return null;
	}
}

