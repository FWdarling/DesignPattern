package cn.edu.tongji.team.test;

import cn.edu.tongji.team.patterns.state.Constant;
import cn.edu.tongji.team.patterns.state.Context;
import cn.edu.tongji.team.patterns.state.MachineState;

import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StateTest {
    public static void main(String[] args) throws NoSuchFieldException {
        Context context = new Context();
        Context context2 = new Context();

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Class clazz = MachineState.class;
        Field field = clazz.getDeclaredField("cnt");
        field.setAccessible(true);

        //machine 01
        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < Constant.TOT_ROUND; i ++){
                    System.out.print("Current thread:" + Thread.currentThread().getName() + " ");
                    context.request();
                }

            }
        });
        //machine 02
        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.print("Current thread:" + Thread.currentThread().getName());
                for(int i = 0; i < Constant.TOT_ROUND; i ++){
                    System.out.print("Current thread:" + Thread.currentThread().getName() + " ");
                    context2.request();
                }

            }
        });
        threadPool.shutdown();
    }
}
