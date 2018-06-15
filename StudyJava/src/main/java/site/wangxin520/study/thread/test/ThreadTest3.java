package site.wangxin520.study.thread.test;

import site.wangxin520.study.thread.domain.Student;

/**
 * 
 * @author wangXgnaw
 *
 */
public class ThreadTest3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {

		System.out.println("main线程，没有赋值前："+Student.newName.get());
		Student.newName.set("小王");
		System.out.println("main线程 ,赋值后："+Student.newName.get());

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("新线程 ,最后："+Student.newName.get());
				Student.newName.set("小丽");
				System.out.println("新线程 ,最后："+Student.newName.get());

			}
		});

		t1.start();

		t1.join();

		System.out.println("main线程 ,最后："+Student.newName.get());
	}

}
