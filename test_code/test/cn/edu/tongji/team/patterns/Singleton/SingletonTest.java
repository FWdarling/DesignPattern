package cn.edu.tongji.team.test;

import cn.edu.tongji.team.model.player.GlobalStats;
import jdk.nashorn.internal.objects.Global;

import java.util.ArrayList;
import java.util.concurrent.*;

public class SingletonTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(6);
        ArrayList<Object> arr = new ArrayList<>();
        for(int i = 0; i < 6; i ++) {
            Future result = executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    return GlobalStats.getInstance();
                }
            });
            arr.add(result);
        }
        executorService.shutdown();
        for(int i = 0; i < arr.size(); i ++) {
            Future<Object> obj = (Future<Object>)arr.get(i);
            GlobalStats globalStats = (GlobalStats) obj.get();
            System.out.println(globalStats);
        }
    }
}
