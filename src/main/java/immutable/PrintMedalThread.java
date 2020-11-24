package immutable;

import entity.Medal;

/**
 * description: 打印线程类
 * date: 11/24/20 02:05 AM
 * author: cjsmt
 */
public class PrintMedalThread extends Thread{
    private Medal medal;
    public PrintMedalThread(Medal medal) {
        this.medal = medal;
    }
    public void run() {
        int i = 0;
        while (i < 50){
            System.out.println(Thread.currentThread().getName() + " prints " + medal);
            i++;
        }
    }
}
