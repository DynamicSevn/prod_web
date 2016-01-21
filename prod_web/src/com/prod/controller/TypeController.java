package com.prod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prod.bean.Type;
import com.prod.service.TypeService;


@Controller
@RequestMapping("/type")
public class TypeController {
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value="index",method = RequestMethod.GET)
	public String index(Model model){
		List<Type> typeList = typeService.getAll();
		model.addAttribute("typeList", typeList);
		return "type/index";
	}
	
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(Model model,Type type){
		try{
			typeService.add(type);
			model.addAttribute("msg", "添加成功");
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "添加失败");
		}
		return "redirect:index";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)	
	public String update(Model model,Type type){
		try{
			if(typeService.update(type)>0)
					model.addAttribute("msg", "更新成功");
			else model.addAttribute("msg", "更新失败");
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "更新失败");
		}
		return "redirect:index";
	}
	
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String delete(Model model,Integer typeId){
		try{
		    if(typeService.delete(typeId)>0){
		    	model.addAttribute("msg", "删除成功");
		    }else {
		    	model.addAttribute("msg", "删除失败");
		    }
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "删除失败");
		}
		return "redirect:index";
	}
	
	@ResponseBody
	@RequestMapping(value="get_by_id",method=RequestMethod.GET)
	public Type getById(Model model,Integer typeId){
		return typeService.getById(typeId);
		
	}
	
	
	@RequestMapping(value="search",method=RequestMethod.POST)
	public String search(Model model,String condition){
		List<Type> typeList =typeService.getByCondition(condition);
		model.addAttribute("typeList", typeList);
		if(typeList.isEmpty()){
			model.addAttribute("msg", "搜索不到名称中有'"+condition+"'的产品");
		}else model.addAttribute("msg", "搜索名称中有'"+condition+"'的结果为：");
		return "type/search";
	}
	
}
