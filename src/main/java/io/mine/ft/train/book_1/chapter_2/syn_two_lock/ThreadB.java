package io.mine.ft.train.book_1.chapter_2.syn_two_lock;

/**
 * className ThreadB
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/15 下午4:51
 */
public class ThreadB  extends Thread {
    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printB();
    }
}