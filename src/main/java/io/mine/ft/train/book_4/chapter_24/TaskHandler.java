package io.mine.ft.train.book_4.chapter_24;

import java.util.concurrent.TimeUnit;

public class TaskHandler implements Runnable {
	
	
	private final Request request;

	
	
	public TaskHandler(Request request) {
		this.request = request;
	}



	@Override
	public void run() {
		System.out.println("Begin handle " + request);
		slowly();
		System.out.println("End handle " + request);
	}
	
	private void slowly() {
		try {
			TimeUnit.SECONDS.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
