package site.wangxin520.study.thread.test;

import site.wangxin520.study.thread.domain.Student;

/**
 * 多线程学习，测试一
 * 
 * @author wangXgnaw
 *
 */
public class ThreadTest1 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("main线程，没赋值前：" + Student.name);
		Student.name = "小王";
		System.out.println("main线程，赋值：" + Student.name);

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("新线程，没赋值前：" + Student.name);
				Student.name = "小丽";
				System.out.println("新线程，赋值：" + Student.name);

			}
		});

		t1.start();

		t1.join();
		
		System.out.println("main线程，最后的值为：" + Student.name);
		
	}

}
