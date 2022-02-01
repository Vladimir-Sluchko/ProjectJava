package Lesson14.core;

import Lesson14.ThreadUtils;

public class MyWork implements  Runnable{
    @Override
    public void run() {
        ThreadUtils.printThreadInfo();
    }
}
