package Lesson15.threads;

import Lesson15.threads.job.PrintInfoRunnable;
import Lesson15.threads.utils.ThreadUtils;

public class ThreadMain3 {
    public static void main(String[] args) {
        ThreadUtils.print();
        PrintInfoRunnable job = new PrintInfoRunnable();
        for (int i = 0; i < 10_000; i++) {
            System.out.println("Привет");
            job.run();
            System.out.println("Пока");
        }

    }
}
