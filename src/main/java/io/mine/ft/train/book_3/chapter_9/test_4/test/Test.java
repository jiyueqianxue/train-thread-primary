package io.mine.ft.train.book_3.chapter_9.test_4.test;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import io.mine.ft.train.book_3.chapter_9.test_4.task.MyRecursiveTaskA;
import io.mine.ft.train.book_3.chapter_9.test_4.task.MyRecursiveTaskB;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		ForkJoinPool pool = new ForkJoinPool();
		ForkJoinTask<Integer> runTaskA = pool.submit(new MyRecursiveTaskA());
		ForkJoinTask<Integer> runTaskB = pool.submit(new MyRecursiveTaskB());
		System.out.println("准备打印：" + System.currentTimeMillis());
		System.out
				.println(runTaskA.join() + " A:" + System.currentTimeMillis());
		System.out
				.println(runTaskB.join() + " B:" + System.currentTimeMillis());
		Thread.sleep(5000);
	}
}
