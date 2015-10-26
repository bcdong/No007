package businessLogicService;

import java.sql.Time;
import java.util.ArrayList;

import typeDefinition.FeeType;
import typeDefinition.myTime;
import vo.FinanceVO;
import vo.ProfitVO;
import vo.ReceiptVO;

public interface FinanceBLService {

	/**
	 * 在一个付款（收款）回合中，新建付款（收款）单
	 * 并且更新总收入，总支出数据
	 * @param receiptInputVO
	 */
	public void submit(ReceiptVO receiptInputVO);
	
	/**
	 * 期初建账后的账目查询
	 * @param year
	 * @return
	 */
	public FinanceVO getCredit(int year);
	
	/**
	 * 
	 * @param feetype
	 * @param receiptInputVO
	 * @return 计算收款（付款）金额
	 */
	public double calFee(FeeType feetype, ReceiptVO receiptInputVO);

	/**
	 * 
	 * @param fromTime
	 * @param toTime
	 * @return 返回该时间段内的所有入库单和出库单数据列表
	 */
	public ArrayList<ReceiptVO> seeRecord(myTime fromTime, myTime toTime);

	/**
	 * 
	 * @param fromTime
	 * @param toTime
	 * @param StoreNum
	 * @return 返回指定营业厅指定日期的收款单数据列表
	 */
	public ArrayList<ReceiptVO> checkStore(myTime fromTime, myTime toTime, String StoreNum);

	/**
	 * 前置条件：已经获取收款单数据列表
	 * @return 返回所有收款单金额合计
	 */
	public String addUp();
	
	/**
	 * 
	 * @return 返回截止当前日期的总收入、总支出、总利润
	 */
	public ProfitVO checkProfit();
}
