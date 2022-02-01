package Lesson15.threads;

import Lesson15.threads.job.PrintInfoRunnable;
import Lesson15.threads.utils.ThreadUtils;

public class ThreadMain4 {
    public static void main(String[] args) {
        ThreadUtils.print();

        Thread thread = new ThreadExtend();
        thread.start();

        ThreadUtils.print();

    }
}
