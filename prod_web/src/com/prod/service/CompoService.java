package com.prod.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prod.bean.Component;
import com.prod.bean.ComponentExample;
import com.prod.bean.ComponentExample.Criteria;
import com.prod.dao.ComponentDAO;


@Service
public class CompoService {
	@Resource
	private ComponentDAO compoDao;

	public List<Component> getAll() {
		ComponentExample example = new ComponentExample();
		List<Component> compoList = compoDao.selectByExample(example);
		return compoList;
	}

	@Transactional
	public void add(Component compo) {
		compoDao.insertSelective(compo);
		
	}

	public Component getById(int compoId) {
		return compoDao.selectByPrimaryKey(compoId);
		
	}

	@Transactional
	public void delete(Integer prodId) {
		compoDao.deleteByPrimaryKey(prodId);
		
	}

	@Transactional
	public void update(Component compo) {
		compoDao.updateByPrimaryKey(compo);
	}

	public List<Component> getByCondition(String condition) {
		ComponentExample example = new ComponentExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike("%"+condition+"%");
		return compoDao.selectByExample(example);
		
	}
}

