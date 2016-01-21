package com.prod.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prod.bean.Type;
import com.prod.bean.TypeExample;
import com.prod.bean.TypeExample.Criteria;
import com.prod.dao.TypeDAO;


@Service
public class TypeService {
	@Resource
	private TypeDAO typeDAO;

	public List<Type> getAll() {
		return typeDAO.selectByExample(new TypeExample());
	}

	@Transactional
	public void add(Type type) {
		typeDAO.insert(type);
		
	}
	
	@Transactional
	public int delete(Integer type_id){
		return typeDAO.deleteByPrimaryKey(type_id);
	}
	
	@Transactional
	public int update(Type type){
		return typeDAO.updateByPrimaryKeySelective(type);
	}

	public Type getById(Integer type_id) {
		return typeDAO.selectByPrimaryKey(type_id);
	}

	public List<Type> getByCondition(String condition) {
		TypeExample example = new TypeExample();
		Criteria criteria =  example.createCriteria();
		criteria.andNameLike("%"+condition+"%");
		return typeDAO.selectByExample(example);
	}
	
}
