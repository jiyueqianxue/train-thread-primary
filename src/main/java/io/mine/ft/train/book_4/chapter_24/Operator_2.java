package io.mine.ft.train.book_4.chapter_24;

public class Operator_2 {
	
	//private final ThreadPool threadPool = new BasicThreadPool
	
	public void call(String business) {
		
		TaskHandler taskHandler = new TaskHandler(new Request(business));
		new Thread(taskHandler).start();
	}
}
