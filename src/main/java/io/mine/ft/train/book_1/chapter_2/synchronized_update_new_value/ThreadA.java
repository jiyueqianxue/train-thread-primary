package io.mine.ft.train.book_1.chapter_2.synchronized_update_new_value;

/**
 * className ThreadA
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:08
 */
public class ThreadA extends Thread{
    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
