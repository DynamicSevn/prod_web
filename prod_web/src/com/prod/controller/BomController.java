package com.prod.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prod.bean.Prod;
import com.prod.bean.Type;
import com.prod.service.CompoService;
import com.prod.service.ProdService;
import com.prod.service.TypeService;
import com.prod.utils.Node;


/**
 * bom表查询controller
 * @author sevn
 *
 */
@Controller
@RequestMapping("bom")
public class BomController {
	
	@Autowired
	private TypeService typeService;
	@Autowired
	private ProdService prodService;
	@Autowired
	private CompoService compoService;
	
	
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index(Model model){
		return "bom/index";
	}



	@RequestMapping(value = "/get_bom",method = RequestMethod.GET)
	@ResponseBody
	public List getBom() {    
		List<Type> typeList= typeService.getAll();
		List<Node<Type>> rootNodeList = new ArrayList<Node<Type>>(typeList.size()); 
		
		
		for(Type type:typeList ){
			//ArrayList默认构造为10的列表，可能会导致有null对象使前台报500错误
			Node<Type> root = new Node<Type>(type,1);
			rootNodeList.add(root);
			
			List<Prod> prodList = prodService.getByType(type.getId());
			List<Node<Prod>> childList = new ArrayList<Node<Prod>>(prodList.size());
			
			
			for(Prod prod:prodList){
				Node<Prod> prodNode = new Node<Prod>(prod,0);
				childList.add(prodNode);
				
			}
			
			root.setChildNode(childList);
			root.setChildCount(childList.size());
		}
		
	 	ObjectMapper mapper=new ObjectMapper();

		try {
			//用这个检测包装的json对象是否有问题
			String jsonString=mapper.writeValueAsString(rootNodeList);
			System.out.print(jsonString);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return rootNodeList;
	}
}
