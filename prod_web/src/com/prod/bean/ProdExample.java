package com.prod.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public ProdExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	protected ProdExample(ProdExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table prod
	 * @ibatorgenerated  Tue Dec 29 15:51:20 CST 2015
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return this;
		}

		public Criteria andIdIn(List values) {
			addCriterion("id in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
			addCriterion("id not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return this;
		}

		public Criteria andTypeidIsNull() {
			addCriterion("typeid is null");
			return this;
		}

		public Criteria andTypeidIsNotNull() {
			addCriterion("typeid is not null");
			return this;
		}

		public Criteria andTypeidEqualTo(Integer value) {
			addCriterion("typeid =", value, "typeid");
			return this;
		}

		public Criteria andTypeidNotEqualTo(Integer value) {
			addCriterion("typeid <>", value, "typeid");
			return this;
		}

		public Criteria andTypeidGreaterThan(Integer value) {
			addCriterion("typeid >", value, "typeid");
			return this;
		}

		public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
			addCriterion("typeid >=", value, "typeid");
			return this;
		}

		public Criteria andTypeidLessThan(Integer value) {
			addCriterion("typeid <", value, "typeid");
			return this;
		}

		public Criteria andTypeidLessThanOrEqualTo(Integer value) {
			addCriterion("typeid <=", value, "typeid");
			return this;
		}

		public Criteria andTypeidIn(List values) {
			addCriterion("typeid in", values, "typeid");
			return this;
		}

		public Criteria andTypeidNotIn(List values) {
			addCriterion("typeid not in", values, "typeid");
			return this;
		}

		public Criteria andTypeidBetween(Integer value1, Integer value2) {
			addCriterion("typeid between", value1, value2, "typeid");
			return this;
		}

		public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
			addCriterion("typeid not between", value1, value2, "typeid");
			return this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return this;
		}

		public Criteria andNameIn(List values) {
			addCriterion("name in", values, "name");
			return this;
		}

		public Criteria andNameNotIn(List values) {
			addCriterion("name not in", values, "name");
			return this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return this;
		}

		public Criteria andProducerIsNull() {
			addCriterion("producer is null");
			return this;
		}

		public Criteria andProducerIsNotNull() {
			addCriterion("producer is not null");
			return this;
		}

		public Criteria andProducerEqualTo(String value) {
			addCriterion("producer =", value, "producer");
			return this;
		}

		public Criteria andProducerNotEqualTo(String value) {
			addCriterion("producer <>", value, "producer");
			return this;
		}

		public Criteria andProducerGreaterThan(String value) {
			addCriterion("producer >", value, "producer");
			return this;
		}

		public Criteria andProducerGreaterThanOrEqualTo(String value) {
			addCriterion("producer >=", value, "producer");
			return this;
		}

		public Criteria andProducerLessThan(String value) {
			addCriterion("producer <", value, "producer");
			return this;
		}

		public Criteria andProducerLessThanOrEqualTo(String value) {
			addCriterion("producer <=", value, "producer");
			return this;
		}

		public Criteria andProducerLike(String value) {
			addCriterion("producer like", value, "producer");
			return this;
		}

		public Criteria andProducerNotLike(String value) {
			addCriterion("producer not like", value, "producer");
			return this;
		}

		public Criteria andProducerIn(List values) {
			addCriterion("producer in", values, "producer");
			return this;
		}

		public Criteria andProducerNotIn(List values) {
			addCriterion("producer not in", values, "producer");
			return this;
		}

		public Criteria andProducerBetween(String value1, String value2) {
			addCriterion("producer between", value1, value2, "producer");
			return this;
		}

		public Criteria andProducerNotBetween(String value1, String value2) {
			addCriterion("producer not between", value1, value2, "producer");
			return this;
		}

		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return this;
		}

		public Criteria andAddressIsNotNull() {
			addCriterion("address is not null");
			return this;
		}

		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return this;
		}

		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return this;
		}

		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return this;
		}

		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "address");
			return this;
		}

		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return this;
		}

		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return this;
		}

		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return this;
		}

		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return this;
		}

		public Criteria andAddressIn(List values) {
			addCriterion("address in", values, "address");
			return this;
		}

		public Criteria andAddressNotIn(List values) {
			addCriterion("address not in", values, "address");
			return this;
		}

		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return this;
		}

		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return this;
		}

		public Criteria andPriceEqualTo(Long value) {
			addCriterion("price =", value, "price");
			return this;
		}

		public Criteria andPriceNotEqualTo(Long value) {
			addCriterion("price <>", value, "price");
			return this;
		}

		public Criteria andPriceGreaterThan(Long value) {
			addCriterion("price >", value, "price");
			return this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(Long value) {
			addCriterion("price >=", value, "price");
			return this;
		}

		public Criteria andPriceLessThan(Long value) {
			addCriterion("price <", value, "price");
			return this;
		}

		public Criteria andPriceLessThanOrEqualTo(Long value) {
			addCriterion("price <=", value, "price");
			return this;
		}

		public Criteria andPriceIn(List values) {
			addCriterion("price in", values, "price");
			return this;
		}

		public Criteria andPriceNotIn(List values) {
			addCriterion("price not in", values, "price");
			return this;
		}

		public Criteria andPriceBetween(Long value1, Long value2) {
			addCriterion("price between", value1, value2, "price");
			return this;
		}

		public Criteria andPriceNotBetween(Long value1, Long value2) {
			addCriterion("price not between", value1, value2, "price");
			return this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return this;
		}

		public Criteria andCodeIn(List values) {
			addCriterion("code in", values, "code");
			return this;
		}

		public Criteria andCodeNotIn(List values) {
			addCriterion("code not in", values, "code");
			return this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return this;
		}
	}
}