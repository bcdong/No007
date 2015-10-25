package po;

import typeDefinition.LogisticState;
import typeDefinition.myTime;

public class LogisticPO {

	private String orderNum;
	private myTime arrivalTime;
	private LogisticState state;
	
	public LogisticPO(String orderNum,myTime arrivalTime,
			LogisticState state){
		this.setOrderNum(orderNum);
		this.setArrivalTime(arrivalTime);
		this.state=state;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public myTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(myTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LogisticState getState() {
		return state;
	}

}
