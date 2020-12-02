package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

/**
 *
 * @author Vinícius Ivan
 */
public class Minutos implements Runnable {

    private static boolean exit = false;
    private boolean pausa = false;

    @Override
    public void run() {
        int aux = Integer.parseInt(InterfaceTimer.txtMin.getText());
        aux--;
        while (!exit) {
            InterfaceTimer.txtMin.setText(aux + "");
            aux--;
            if (aux < 0) {
                exit = true;
            }
            try {
                Thread.sleep(60000);
                synchronized (this) {
                    while (this.pausa) {
                        wait();
                    }
                }
            } catch (Exception e) {

            }
        }
    }

    static void stop() {
        exit = true;
    }

    void suspend() {
        this.pausa = true;
    }

    synchronized void resume() {
        this.pausa = false;
        notify();
    }
}
