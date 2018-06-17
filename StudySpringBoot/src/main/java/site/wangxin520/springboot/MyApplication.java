package site.wangxin520.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 这是spring mvc 的标准访问类的注解
@SpringBootApplication // 标注了这是一个spring boot的项目，这个是spring boot 的核心注解
@Configuration // @Configuration注解表明这是一个spring的配置类
public class MyApplication extends SpringBootServletInitializer{

	/**
	 * 标准的spring mvc的访问方法
	 * 
	 * @return
	 */
	@RequestMapping("helloworld")
	@ResponseBody
	public String helloWorld() {
		System.out.println("hello world");
		return "hello world";
	}

	/**
	 * Spring boot的启动入口方法
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// SpringApplication.run(MyApplication.class, args);

		//取消banner
		SpringApplication app = new SpringApplication(MyApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(args);
	}

	/**
	 * tomcat 启动方式
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		builder.bannerMode(Mode.OFF);
		return builder.sources(MyApplication.class);
		
	}

}
