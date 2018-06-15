package site.wangxin520.study.thread.test;

import site.wangxin520.study.thread.domain.Student;

/**
 * 多线程学习，测试一
 * 
 * @author wangXgnaw
 *
 */
public class ThreadTest2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {

		// 获取当前线程id
		String id = Thread.currentThread().getId()+"";

		System.out.println("main线程，没赋值前：" + Student.threadMap.get(id));
		Student.threadMap.put(id + "", "小王");
		System.out.println("main线程，赋值：" + Student.threadMap.get(id));

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				// 获取当前线程id
				String id = Thread.currentThread().getId()+"";

				System.out.println("新线程，没赋值前：" + Student.threadMap.get(id));
				Student.threadMap.put(id + "", "小丽");
				System.out.println("新线程，赋值：" + Student.threadMap.get(id));

			}
		});

		t1.start();

		t1.join();

		System.out.println("main线程，最后的值为：" + Student.threadMap.get(id));

	}

}
