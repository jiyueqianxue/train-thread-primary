package io.mine.ft.train.book_3.chapter_9.join_get.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName() + " 执行compute方法()");
		String nullString = null;
		nullString.toString();
		return 100;
	}
}
