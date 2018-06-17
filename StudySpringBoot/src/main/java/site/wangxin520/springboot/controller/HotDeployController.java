package site.wangxin520.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 使用spring loaded方式进行热部署 -javaagent:E:\workspace\Study\StudySpringBoot\lib\springloaded-1.2.8.RELEASE.jar -noverify
 * 
 * 测试热部署的web层
 * @author wangXgnaw
 *
 */
@Controller
public class HotDeployController {

	@RequestMapping(value="HotDeployTest1")
	@ResponseBody
	public String test1(){
		return "测试2";
	}
	
	@RequestMapping(value="HotDeployTest2")
	@ResponseBody
	public String test2(){
		return "测试3";
	}
	
	
}
