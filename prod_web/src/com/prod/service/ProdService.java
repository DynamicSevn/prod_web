package com.prod.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prod.bean.Prod;
import com.prod.bean.ProdExample;
import com.prod.bean.ProdExample.Criteria;
import com.prod.dao.ProdDAO;


@Service
public class ProdService {
	@Resource
	private ProdDAO prodDao;

	public List<Prod> getAll() {
		ProdExample example = new ProdExample();
		List<Prod> prodList = prodDao.selectByExample(example);
		return prodList;
	}

	@Transactional
	public void add(Prod prod) {
		prodDao.insertSelective(prod);
		
	}

	public Prod getById(int prodId) {
		return prodDao.selectByPrimaryKey(prodId);
		
	}

	@Transactional
	public void delete(Integer prodId) {
		prodDao.deleteByPrimaryKey(prodId);
		
	}

	@Transactional
	public void update(Prod prod) {
		prodDao.updateByPrimaryKey(prod);
	}

	public List<Prod> getByCondition(String condition) {
		ProdExample example = new ProdExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andNameLike("%"+condition+"%");
		return prodDao.selectByExample(example);
	}

	public List<Prod> getByType(Integer id) {
		ProdExample example = new ProdExample();
		Criteria criteria = example.createCriteria();
		criteria.andTypeidEqualTo(id);
		return  prodDao.selectByExample(example);
		
	}
}
