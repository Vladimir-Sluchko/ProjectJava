package Lesson14.core;

import Lesson14.ThreadUtils;

import java.util.concurrent.TimeUnit;

public class InfinityWork implements Runnable{
    @Override
    public void run() {
        ThreadUtils.printThreadInfo();
        Thread curr = Thread.currentThread();
        while (true){
            System.err.println("Привет, я поток " + curr.getId());
            try{
                TimeUnit.MICROSECONDS.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.err.println("Ошибка !!!!");
            }

        }

    }
}
