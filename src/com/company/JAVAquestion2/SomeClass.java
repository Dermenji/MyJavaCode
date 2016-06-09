package com.company.JAVAquestion2;

import java.util.concurrent.TimeUnit;

/**
 * Created by fns02 on 5/23/2016.
 * Double checked locking!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 */
public class SomeClass implements Runnable {
    SomeData someData = new SomeData();

    public static void main(String[] args) {
        new SomeClass().threadsGenerator();
    }

    private void threadsGenerator() {
        for (int i = 0; i < 10; i++) {
            new Thread(this).start();
        }
    }

    @Override
    public void run() {
        try {
            someData.isCorrect();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public class SomeData {
        private volatile boolean  correct;//!!!!!!!!!!
        private boolean computed;

        public SomeData() {
            correct = false;
            computed = false;
        }

        /*public boolean isCorrect() throws InterruptedException {
            if (!correct) {
                computeCorrectess();
            }
            return correct;
        }*/

        public boolean isCorrect() throws InterruptedException {
            if (!correct) {
                synchronized (this) {
                    if (!correct) {
                        computeCorrectess();
                    }
                }
            } return correct;
        }

        private void computeCorrectess() throws InterruptedException {
            System.out.println(correct);
            TimeUnit.SECONDS.sleep(1);
            correct = true;
        }
    }
}
