package io.mine.ft.train.book_4.chapter_22;

public class AutoSaveThread extends Thread {

	private final Document document;

	public AutoSaveThread(Document document) {
		super("DocumentAutoSaveThread");
		this.document = document;
	}

	@Override
	public void run() {
		while (true) {
			
		}
	}
}
