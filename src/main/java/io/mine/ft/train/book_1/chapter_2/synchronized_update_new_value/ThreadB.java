package io.mine.ft.train.book_1.chapter_2.synchronized_update_new_value;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午10:09
 */
public class ThreadB extends Thread {
    Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.runMethod();
    }
}
