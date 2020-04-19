package io.mine.ft.train.book_4.chapter_8;

@FunctionalInterface
public interface ThreadFactory {
	
	Thread createThread(Runnable runnable);
	

}
