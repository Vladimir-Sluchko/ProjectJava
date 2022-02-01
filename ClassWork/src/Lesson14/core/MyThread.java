package Lesson14.core;

import Lesson14.ThreadUtils;

public class MyThread extends Thread{
    @Override
    public void run() {
        ThreadUtils.printThreadInfo();
    }
}
