package io.mine.ft.train.book_3.chapter_9.test_1.action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void compute() {
		System.out.println("compute run!");
	}

}
