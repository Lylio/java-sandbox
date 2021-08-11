package Scratchpad;

import java.time.Instant;

public class ScratchPad {

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Instant.now());

        Instant justNow = Instant.now();

        Thread.sleep(5000);

        System.out.println(justNow);
    }
}

