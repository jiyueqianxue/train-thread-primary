package io.mine.ft.train.book_3.chapter_9.test_2.test;

import java.util.concurrent.ForkJoinPool;

import io.mine.ft.train.book_3.chapter_9.test_2.action.MyRecursiveAction;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new MyRecursiveAction(1, 10));
		Thread.sleep(5000);
	}

}
