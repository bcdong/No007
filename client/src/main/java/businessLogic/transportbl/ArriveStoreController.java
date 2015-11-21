package businessLogic.transportbl;

import businessLogicService.transportblservice.ArriveStoreBLService;
import vo.receiptvo.StoreArrivalReceiptVO;

public class ArriveStoreController implements ArriveStoreBLService{

	ArriveStoreBL arrivestorebl=new ArriveStoreBL();
	
	public boolean verify(StoreArrivalReceiptVO vo) {
		return arrivestorebl.verify(vo);
	}

	public void submit(StoreArrivalReceiptVO vo) {
		arrivestorebl.submit(vo);
	}

}
