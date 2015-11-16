package po.receiptpo;

import typeDefinition.PackArrivalState;
import typeDefinition.ReceiptType;
import typeDefinition.myTime;
import vo.receiptvo.StoreArrivalReceiptVO;

public class StoreArrivalReceiptPO extends ReceiptPO{

    private myTime arriveTime;
    private String transReceiptID;
    private String fromPosition;
    private PackArrivalState arriveState;

    public StoreArrivalReceiptPO(myTime time, String transID, String fromPosi, PackArrivalState state) {
        super(ReceiptType.STOREARRIVAL);
        this.arriveTime=time;
        this.transReceiptID=transID;
        this.fromPosition=fromPosi;
        this.arriveState=state;
    }

    public StoreArrivalReceiptPO(StoreArrivalReceiptVO vo){
        this(vo.getArriveTime(),vo.getTransReceiptID(),vo.getFromPosition(),vo.getArriveState());
    }

    public myTime getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(myTime arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getTransReceiptID() {
        return transReceiptID;
    }

    public void setTransReceiptID(String transReceiptID) {
        this.transReceiptID = transReceiptID;
    }

    public String getFromPosition() {
        return fromPosition;
    }

    public void setFromPosition(String fromPosition) {
        this.fromPosition = fromPosition;
    }

    public PackArrivalState getArriveState() {
        return arriveState;
    }

    public void setArriveState(PackArrivalState arriveState) {
        this.arriveState = arriveState;
    }
}
