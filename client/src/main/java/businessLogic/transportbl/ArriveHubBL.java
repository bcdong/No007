package businessLogic.transportbl;

import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import businessLogicService.receiptblservice.ReceiptBLService;
import myexceptions.TransportBLException;
import vo.receiptvo.HubArrivalReceiptVO;
import blfactory.BLFactory;;

public class ArriveHubBL{

	public boolean verify(HubArrivalReceiptVO vo) throws TransportBLException{
		String s1=vo.getTransReceiptID();
		if(s1.length()!=19){
			throw new TransportBLException("中转单编号应该为19位！");
		}
		Date date=null;
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		try {
			date=format.parse(s1.substring(4,12));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(date==null){
			throw new TransportBLException("中转单编号应该为4位中转中心编号＋8位日期＋7位数字！");
		}
		return true;	
	}

	public void submit(HubArrivalReceiptVO vo) throws RemoteException {
		ReceiptBLService receiptblservice=BLFactory.getReceiptBLService();
		receiptblservice.createReceipt(vo);
	}
	
}
