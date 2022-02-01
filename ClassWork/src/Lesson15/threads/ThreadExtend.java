package Lesson15.threads;

import Lesson15.threads.utils.ThreadUtils;

public class ThreadExtend extends Thread{
    @Override
    public void run() {
        ThreadUtils.print();
    }
}
