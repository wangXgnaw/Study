package site.wangxin520.study.thread.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 学生的domain类，用于测试存放与读取全局参数（静态）
 * @author wangXgnaw
 *
 */
public class Student {

	public static String name;
	
	/**
	 * 静态的map集合，用于存放线程id-参数，方便远程调用。
	 */
	public static Map<String, String> threadMap=new HashMap<>();
	
	/**
	 * 本地线程的参数
	 */
	public static ThreadLocal<String> newName=new ThreadLocal<>();
	
}
