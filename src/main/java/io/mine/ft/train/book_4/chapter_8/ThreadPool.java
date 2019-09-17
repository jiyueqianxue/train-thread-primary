package io.mine.ft.train.book_4.chapter_8;

public interface ThreadPool {
	//提交任务到线程池
	void execute(Runnable runnable);
	//关闭线程池
	void shutdown();
	//获取线程池的初始化大小
	int getInitSize();
	//获取线程池最大的线程数
	int getMaxSize();
	//获取线程池的核心线程数
	int getCoreSize();
	//获取线程池中用于缓存任务队列的大小
	int getQueueSize();
	//获取线程池中活跃线程数量
	int getActiveSize();
	//查看线程池是否已经被shutdown
	int isShutdown();
}
