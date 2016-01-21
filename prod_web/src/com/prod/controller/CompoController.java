package com.prod.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prod.bean.Component;
import com.prod.service.CompoService;
import com.prod.service.TypeService;


@Controller
@RequestMapping("/compo")
public class CompoController {
	@Autowired
	private CompoService compoService;
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping(value = "index",method = RequestMethod.GET)
	public String index(Model model){
		List<Component> compoList = compoService.getAll();
		for(Component compo:compoList){
			compo.setType(typeService.getById(compo.getProdTypeid()));
		}
		model.addAttribute("compoList", compoList);
		model.addAttribute("typeList", typeService.getAll());
		return "compo/index";
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(Model model,Component compo){
		try{
			compoService.add(compo);
			model.addAttribute("msg", "添加成功");
		}catch(Exception e){
			System.out.println(e);
			model.addAttribute("msg", "添加失败");
		}
		return "redirect:index";
	}
	
	
	@ResponseBody
	@RequestMapping(value="get_by_id",method = RequestMethod.GET)	
	public Component getById(Model model,Integer compoId,HttpServletResponse response){
		return compoService.getById(compoId);
		
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String delete(Model model,Integer compoId){
		try{
			compoService.delete(compoId);
			model.addAttribute("msg", "删除成功");
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "删除失败");
		}
		return "redirect:index";
		
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(Model model,Component compo)
	{
		try{
			compoService.update(compo);
			model.addAttribute("msg", "更新成功");
			
		}catch(Exception e){
			e.printStackTrace();
			model.addAttribute("msg", "更新失败");
			
		}
		return "redirect:index";
	}
	
	@RequestMapping(value="search",method=RequestMethod.POST)
	public String search(Model model,String condition){
		List<Component> compoList = compoService.getByCondition(condition);
		model.addAttribute("compoList", compoList);
		if(compoList.isEmpty()){
			model.addAttribute("msg", "搜索不到名称中有'"+condition+"'的零件");
		}else model.addAttribute("msg", "搜索名称中有'"+condition+"'的结果为：");
		return "compo/search";
	}
}
