package database;

import java.util.ArrayList;

import po.receiptpo.ReceiptPO;
import po.receiptpo.SendReceiptPO;
import typeDefinition.Date;

public class SendReceiptDBManager extends DBManager{

	public ArrayList<SendReceiptPO> getList(Date fromtime, Date toTime){
		ArrayList<SendReceiptPO> po=new ArrayList<SendReceiptPO>();
		String sendReceipt="SELECT * FROM SendReceipt WHERE time = '"+fromtime+"'";
		
		return po;
	}
	
	public void addItem(ReceiptPO item){
		
	}
	
	public void deleteAll(){
		
	}
	
}
