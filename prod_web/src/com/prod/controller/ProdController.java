package com.prod.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prod.bean.Prod;
import com.prod.service.ProdService;
import com.prod.service.TypeService;

@Controller
@RequestMapping("/prod")
public class ProdController {
	@Autowired
	private ProdService prodService;
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public String index(Model model){
		List<Prod> prodList = prodService.getAll();
		for(Prod prod:prodList){
			prod.setType(typeService.getById(prod.getTypeid()));
		}
		model.addAttribute("prodList", prodList);
		model.addAttribute("typeList", typeService.getAll());
		return "prod/index";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(Model model,Prod prod){
		try{
			prodService.add(prod);
			model.addAttribute("msg", "添加成功");
		}catch(Exception e){
			System.out.println(e);
			model.addAttribute("msg", "添加失败");
		}
		return "redirect:index";
	}
	
	
	@ResponseBody
	@RequestMapping(value="get_by_id",method = RequestMethod.GET)	
	public Prod getById(Model model,Integer prodId,HttpServletResponse response){
		return prodService.getById(prodId);
		
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String delete(Model model,Integer prodId){
		try{
			prodService.delete(prodId);
			model.addAttribute("msg", "删除成功");
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "删除失败");
		}
		return "redirect:index";
		
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(Model model,Prod prod)
	{
		try{
			prodService.update(prod);
			model.addAttribute("msg", "更新成功");
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "更新失败");
			
		}
		return "redirect:index";
	}
	
	
	@RequestMapping(value="search",method=RequestMethod.POST)
	public String search(Model model,String condition){
		List<Prod> prodList = prodService.getByCondition(condition);
		model.addAttribute("prodList", prodList);
		if(prodList.isEmpty()){
			model.addAttribute("msg", "搜不到名称中有'"+condition+"'的产品");
		}else model.addAttribute("msg", "搜索名称中有'"+condition+"'的结果为：");
		return "prod/search";
	}
}
