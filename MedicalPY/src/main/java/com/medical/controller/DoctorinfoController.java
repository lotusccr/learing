package com.medical.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.medical.dimain.DoctorinfoDomain;
import com.medical.service.DoctorinfoService;

@Controller
@RequestMapping(value="/doctor")
public class DoctorinfoController {
	/*@Resource
	private DoctorinfoService doctorinfoService;
	
	@RequestMapping(value="/index")
	public String index(){
		System.out.println("进入首页");
		return "index";
	}
	
	@RequestMapping(value="findDoctorAll")
	public String findDoctorAll(){
		ModelAndView mav=new ModelAndView();
		List<DoctorinfoDomain> list = doctorinfoService.findDoctorAll("123");
		System.out.println("查询所有医生完毕");
		for (DoctorinfoDomain doctorinfoDomain : list) {
			System.out.println(doctorinfoDomain);
		}
		return "index";
	}
*/
}
