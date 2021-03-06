package com.prod.dao;

import com.prod.bean.Prod;
import com.prod.bean.ProdExample;
import java.util.List;

public interface ProdDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int countByExample(ProdExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int deleteByExample(ProdExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	void insert(Prod record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	void insertSelective(Prod record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	List selectByExample(ProdExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	Prod selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int updateByExampleSelective(Prod record, ProdExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int updateByExample(Prod record, ProdExample example);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int updateByPrimaryKeySelective(Prod record);

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	int updateByPrimaryKey(Prod record);
}