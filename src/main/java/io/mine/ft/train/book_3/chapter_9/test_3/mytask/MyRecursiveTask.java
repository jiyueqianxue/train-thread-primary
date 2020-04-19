package io.mine.ft.train.book_3.chapter_9.test_3.mytask;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected Integer compute() {
		System.out.println("compute time=" + System.currentTimeMillis());
		return 100;
	}
}
