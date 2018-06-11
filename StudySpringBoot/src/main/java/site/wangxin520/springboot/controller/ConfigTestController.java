package site.wangxin520.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import site.wangxin520.springboot.domain.Student;

/**
 * 访问web类，用于页面访问，并且测试java文件配置与自动注入的功能
 * @author wangXgnaw
 *
 */
@Controller
public class ConfigTestController {

	@Autowired
	public String myName;
	//这里使用的是Spring的名称注入，即Java配置文件中的方法名

	@Autowired
	public Student student;

	@Autowired
	public String sexy;
	
	@RequestMapping(value = "/")
	@ResponseBody
	public String testIndex() {

		System.out.println("name is " + student.getName());
		System.out.println("age is " + student.getAge());
		System.out.println("sex is " + sexy);

		return myName;
	}

}
