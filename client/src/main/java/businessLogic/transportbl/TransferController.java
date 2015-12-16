package businessLogic.transportbl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;

import businessLogicService.transportblservice.TransferBLService;
import myexceptions.TransportBLException;
import vo.receiptvo.TransferReceiptVO;

public class TransferController implements TransferBLService{

	TransferBL transferbl=new TransferBL();
	public boolean verify(TransferReceiptVO vo) throws TransportBLException {
		return transferbl.verify(vo);
	}

	public void submit(TransferReceiptVO vo) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
		transferbl.submit(vo);
	}

	public double calFee(TransferReceiptVO vo) throws SQLException, NotBoundException, FileNotFoundException, ClassNotFoundException, IOException{
		return transferbl.calFee(vo);
	}

}
