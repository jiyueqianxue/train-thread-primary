package io.mine.ft.train.book_4.chapter_8;

public interface DenyPolicy {
	
	void reject(Runnable runnable, ThreadPool threadPool);
	
	class DiscardDenyPolicy implements DenyPolicy {

		@Override
		public void reject(Runnable runnable, ThreadPool threadPool) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
