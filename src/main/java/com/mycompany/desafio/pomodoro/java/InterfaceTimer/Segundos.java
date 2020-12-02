package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos implements Runnable {

    private static boolean exit = false;
    private boolean pausa = false;

    @Override
    public void run() {
        int i = 1;
        int limite = Integer.parseInt(InterfaceTimer.txtMin.getText());
        int aux = Integer.parseInt(InterfaceTimer.txtSec.getText());
        while (!exit) {
            InterfaceTimer.txtSec.setText(aux + "");
            aux--;
            if (aux < 0) {
                try {
                    if (i > limite) {
                        this.stop();
                    }
                    i++;
                } catch (Exception e) {
                }
                aux = 59;
            }
            try {
                Thread.sleep(1000);
                synchronized (this) {
                    while (this.pausa) {
                        wait();
                    }
                }
            } catch (Exception ex) {

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
