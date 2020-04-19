package io.mine.ft.train.book_2.chapter_3;

class SynchronizedExample {
    int     a    = 0;
    boolean flag = false;

    public synchronized void writer() { //获取锁
        a = 1;
        flag = true;
    } //释放锁

    public synchronized void reader() { //获取锁
        if (flag) {
            int i = a;
            //……
        } //释放锁
    }
}