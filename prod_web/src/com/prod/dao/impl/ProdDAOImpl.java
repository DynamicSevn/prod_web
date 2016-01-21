package com.prod.dao.impl;

import com.prod.bean.Prod;
import com.prod.bean.ProdExample;
import com.prod.dao.ProdDAO;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class ProdDAOImpl extends SqlMapClientDaoSupport implements ProdDAO {

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public ProdDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int countByExample(ProdExample example) {
		Integer count = (Integer) getSqlMapClientTemplate().queryForObject(
				"prod.ibatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int deleteByExample(ProdExample example) {
		int rows = getSqlMapClientTemplate().delete(
				"prod.ibatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int deleteByPrimaryKey(Integer id) {
		Prod key = new Prod();
		key.setId(id);
		int rows = getSqlMapClientTemplate().delete(
				"prod.ibatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public void insert(Prod record) {
		getSqlMapClientTemplate().insert("prod.ibatorgenerated_insert", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public void insertSelective(Prod record) {
		getSqlMapClientTemplate().insert(
				"prod.ibatorgenerated_insertSelective", record);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public List selectByExample(ProdExample example) {
		List list = getSqlMapClientTemplate().queryForList(
				"prod.ibatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public Prod selectByPrimaryKey(Integer id) {
		Prod key = new Prod();
		key.setId(id);
		Prod record = (Prod) getSqlMapClientTemplate().queryForObject(
				"prod.ibatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int updateByExampleSelective(Prod record, ProdExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"prod.ibatorgenerated_updateByExampleSelective", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int updateByExample(Prod record, ProdExample example) {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = getSqlMapClientTemplate().update(
				"prod.ibatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int updateByPrimaryKeySelective(Prod record) {
		int rows = getSqlMapClientTemplate().update(
				"prod.ibatorgenerated_updateByPrimaryKeySelective", record);
		return rows;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public int updateByPrimaryKey(Prod record) {
		int rows = getSqlMapClientTemplate().update(
				"prod.ibatorgenerated_updateByPrimaryKey", record);
		return rows;
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	private static class UpdateByExampleParms extends ProdExample {
		private Object record;

		public UpdateByExampleParms(Object record, ProdExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}