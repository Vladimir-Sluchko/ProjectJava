package Lesson15.threads.utils;

public class ThreadUtils {
    public static void print (){
        Thread current = Thread.currentThread();
       System.err.println("_________________________");
        System.err.println("id:" + current.getId());
        System.err.println("name:" + current.getName());
        System.err.println("state:" + current.getState());
        System.err.println("group:" + current.getThreadGroup());
        System.err.println("isDaemon:" + current.isDaemon());
        System.err.println("_________________________");
    }
}
