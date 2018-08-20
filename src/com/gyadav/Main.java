package com.gyadav;

import static com.gyadav.ThreadColor.ANSI_RED;
import static com.gyadav.ThreadColor.ANSI_GREEN;
public class Main {

    public static void main(String[] args){
        //System.out.println("hi");
        Thread anotherThread= new AnotherThread();
        anotherThread.setName("another_thread_name");
        //anotherThread.run(); - use start
        anotherThread.start();  //jvm enables the run method

        //Thread.State x = anotherThread.getState();
      //  System.out.println(x);



        //anon class
        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_RED+"hello from anon");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"hello from annon runnable class impliemntation of run");
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println("hello again from main");
    }
}
