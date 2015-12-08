package dataService;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import po.financepo.FinancePO;

public interface FinanceDataService {
	
	/**
	 * 在账目数据库中增加一个持久化对象
	 * @param financePO
	 * @param year 
	 * @throws RemoteException
	 */
	public void add(FinancePO financePO, int year) throws RemoteException;

	/**
	 * 
	 * @param year
	 * @return 根据年份信息返回账目数据库中的一个持久化对象
	 * @throws RemoteException
	 */
	public FinancePO find(int year) throws RemoteException;
	
	/**
	 * 更新数据端的总收入数据
	 * @param income
	 * @throws RemoteException
	 */
	public void addIncome(double income) throws RemoteException;
	
	/**
	 * 初始化数据端的总收入数据
	 * @throws RemoteException
	 */
	public void renewIncome() throws RemoteException;
	
	/**
	 * 
	 * @return 返回账目数据库中的总收入数据
	 * @throws RemoteException
	 */
	public BigDecimal getIncome() throws RemoteException;
	
	/**
	 * 更新数据端的总支出数据
	 * @param outcome
	 * @throws RemoteException
	 */
	public void addOutcome(double outcome) throws RemoteException;

	/**
	 * 初始化账目数据端的总支出数据
	 * @throws RemoteException
	 */
	public void renewOutcome() throws RemoteException;

	/**
	 * 
	 * @return 返回账目数据库中的总支出数据
	 * @throws RemoteException
	 */
	public BigDecimal getOutcome() throws RemoteException;
}

