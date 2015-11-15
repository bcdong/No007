package businessLogic.transportbl;

import businessLogicService.transportblservice.TransportBLService;
import typeDefinition.ReceiptType;
import vo.receiptvo.ReceiptVO;

public class TransportController implements TransportBLService{

	ReceiptType type;
	TransportBL transportBL;
	
	public void judgeType(ReceiptType type){
		switch(type){
		case SEND:
			transportBL=new SendBL();
			break;
		case DESPATCH:
			transportBL=new DespatchBL();
			break;
		case ENTRUCK:
			transportBL=new EntruckBL();
			break;
		case TRANSFER:
			transportBL=new TransferBL();
			break;
		case STOREARRIVAL:
			transportBL=new ArriveStoreBL();
			break;
		case HUBARRIVAL:
			transportBL=new ArriveHubBL();
			break;
		case RECEIVE:
			transportBL=new ReceiveBL();
			break;
		default:
			transportBL=null;
			break;
		}
	}
	
	public boolean verify(ReceiptVO vo) {
		// TODO Auto-generated method stub
		
		type=vo.getType();
		judgeType(type);
		if(transportBL==null){
			return false;
		}
		else{
			return transportBL.verify(vo);
		}
		
	}

	/*
	 *先检查再提交
	 */
	public void submit(ReceiptVO vo) {
		// TODO Auto-generated method stub
		
		new TransportBL().submit(vo);
		
	}

	public double calFee(ReceiptVO vo) {
		// TODO Auto-generated method stub
		
		type=vo.getType();
		if(type==ReceiptType.SEND||type==ReceiptType.TRANSFER||type==ReceiptType.ENTRUCK){
			judgeType(type);
			return transportBL.calFee(vo);
		}		
		else{
			return 0;
		}
	}

}
