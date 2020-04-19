package io.mine.ft.train.book_3.chapter_9.test_2.action;

import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int beginValue;
	private int endValue;

	public MyRecursiveAction(int beginValue, int endValue) {
		super();
		this.beginValue = beginValue;
		this.endValue = endValue;
	}

	@Override
	protected void compute() {
		System.out.println(Thread.currentThread().getName() + " -------");
		if (endValue - beginValue > 2) {
			int middelNum = (beginValue + endValue) / 2;
			MyRecursiveAction leftAction = new MyRecursiveAction(beginValue,
					middelNum);
			MyRecursiveAction rightAction = new MyRecursiveAction(
					middelNum + 1, endValue);
			invokeAll(leftAction, rightAction);
		} else {
			System.out.println("打印组合为：" + beginValue + "-" + endValue);
		}

	}
}
