package site.wangxin520.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import site.wangxin520.springboot.domain.Student;

@Configuration			//@Configuration 这个注解表名本java类是一个配置类，相当于以前配置Spring的一个XML类
@PropertySource(value = { "classpath:testconfig.properties" })    
//properties文件读取的注解，如果配置多个文件的话，直接使用value = { "classpath:testconfig.properties"，"classpath:testconfig.properties" }这种方式
public class TestConfig {

	@Value("${sex}")
	//读取配置文件中的key为sex的值
	private String sex;

	@Bean
	//Bean注解表名这个是一个配置，相当于以前的配置Bean，用于注入的
	public String myName() {
		
		System.out.println("进入配置，获取myName");
		
		return "测试配置，名字";
	}

	@Bean
	@ConditionalOnMissingBean
	//@ConditionalOnMissingBean这个注解表明了，当Spring管理的Bean里面没有这个Bean的时候，开始配置，如果有的 话就不配置，一般用于防止与Spring boot自动注入的配置冲突
	public Student student() {
		
		System.out.println("进入配置，获取student");
		
		return new Student("小王", 23);
	}

	@Bean(name="sexy")
	//name的属性与之前的配置文件中的name属性相同
	public String studentSex() {
		
		System.out.println("进入配置，从文件中获取sex值，并且重新赋值给sexy");
		
		return sex;
	}

}
