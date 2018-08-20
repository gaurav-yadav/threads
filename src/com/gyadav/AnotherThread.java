package com.gyadav;

import static com.gyadav.ThreadColor.ANSI_PURPLE;

public class AnotherThread  extends Thread{

    @Override
    public void run() {
      //  super.run();
        System.out.println(ANSI_PURPLE+"hello fromm "+ currentThread().getName());
        try{
            Thread.sleep(3000);
        }

        catch (InterruptedException e){
            System.out.println("Another thread woke me up");
            return;
        }
        System.out.println("3 secs done, i'm UP");
    }
}
