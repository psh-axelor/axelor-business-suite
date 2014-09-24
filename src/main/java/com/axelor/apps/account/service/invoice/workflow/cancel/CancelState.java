/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2014 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.apps.account.service.invoice.workflow.cancel;

import com.axelor.apps.account.db.Invoice;
import com.axelor.apps.account.service.invoice.InvoiceService;
import com.axelor.apps.account.service.invoice.workflow.WorkflowInvoice;
import com.axelor.exception.AxelorException;

public class CancelState extends WorkflowInvoice {
	
	public CancelState(Invoice invoice){ super(invoice); }
	
	@Override
	public void process() throws AxelorException {
		
		setStatus(invoice);
		
	}
	
	protected void setStatus( Invoice invoice ){
		invoice.setStatusSelect(InvoiceService.STATUS_CANCELED);
	}
	
}