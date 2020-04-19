package io.mine.ft.train.book_2.chapter_3;

class MonitorExample {
    int a = 0;

    public synchronized void writer() { //1
        a++; //2
    } //3

    public synchronized void reader() { //4
        int i = a; //5
    } //6
}
