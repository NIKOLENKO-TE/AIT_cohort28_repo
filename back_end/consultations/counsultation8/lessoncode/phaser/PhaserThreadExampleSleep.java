package phaser;

import java.util.concurrent.Phaser;

public class PhaserThreadExampleSleep {

        public static void main(String[] args) {

            Phaser phaser = new Phaser(1);
            new Thread(new PhaseThreadSleep(phaser, "PhaseThread 1")).start();
            new Thread(new PhaseThreadSleep(phaser, "PhaseThread 2")).start();

            // ждем завершения фазы 0
            int phase = phaser.getPhase();
            phaser.arriveAndAwaitAdvance();
            System.out.println("Фаза " + phase + " завершена");
            // ждем завершения фазы 1
            phase = phaser.getPhase();
            phaser.arriveAndAwaitAdvance();
            System.out.println("Фаза " + phase + " завершена");

            // ждем завершения фазы 2
            phase = phaser.getPhase();
            phaser.arriveAndAwaitAdvance();
            System.out.println("Фаза " + phase + " завершена");

            phaser.arriveAndDeregister();
        }
    }

