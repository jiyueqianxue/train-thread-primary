package io.mine.ft.train.book_3.chapter_9.test_3.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

import io.mine.ft.train.book_3.chapter_9.test_3.mytask.MyRecursiveTask;

public class Test1 {

	public static void main(String[] args) {
		try {
			MyRecursiveTask task1 = new MyRecursiveTask();
			System.out.println(task1.hashCode());
			
			ForkJoinPool pool = new ForkJoinPool();
			ForkJoinTask<?> task2 = pool.submit(task1);
			
			System.out.println(task2.hashCode() + " " + task2.get());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
