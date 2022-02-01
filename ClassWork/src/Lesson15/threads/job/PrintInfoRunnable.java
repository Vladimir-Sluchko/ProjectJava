package Lesson15.threads.job;

import Lesson15.threads.utils.ThreadUtils;

public class PrintInfoRunnable implements Runnable{
    @Override
    public void run() {
        ThreadUtils.print();
    }
}
