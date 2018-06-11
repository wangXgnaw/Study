package site.wangxin520.springboot.domain;

/**
 * 实例domain类，用于测试java配置
 * @author wangXgnaw
 *
 */
public class Student {

	private String name;

	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
