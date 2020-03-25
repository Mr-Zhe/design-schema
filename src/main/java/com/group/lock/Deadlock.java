package com.group.lock;

/**
 * @author ：ZHANGZHE
 * @description：TODO
 * @date ：Created in 2020/3/15 11:39
 * @version: 1.1.0
 */
public class Deadlock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();


    public void firstLock(){
        synchronized (lock1){
            System.out.println(Thread.currentThread().getName());
            System.out.println("获取lock1锁=====");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock2){
                System.out.println("获取lock2锁=====");
            }
        }
    }

    public void secondLock(){
        synchronized (lock2){
            System.out.println(Thread.currentThread().getName());
            System.out.println("获取lock2锁");
            synchronized (lock1){
                System.out.println("获取lock1锁");
            }
        }
    }


    public static void main(String[] args) {
        Deadlock deadlock = new Deadlock();

        for (int i = 0; i < 100; i++) {
            new Thread(deadlock::firstLock).start();
            new Thread(deadlock::secondLock).start();
        }
    }
}
