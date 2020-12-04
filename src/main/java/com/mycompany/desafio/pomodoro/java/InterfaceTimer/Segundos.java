package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos implements Runnable {

    private boolean exit = false;
    private boolean pausa = false;
    private int aux_min = 0;

    @Override
    public void run() {
        int i = 1;
        int limit = 25;
        int aux = Integer.parseInt(InterfaceTimer.txtSec.getText());
        while (!exit) {
            InterfaceTimer.txtSec.setText(aux + "");
            aux--;
            if (aux < 0) {
                if (i == limit) {
                    aux_min++;
                    InterfaceTimer.qtdP.setText(aux_min + "");
                    stop();
                    this.pausa = false;
                    InterfaceTimer.txtMin.setText("25");
                    InterfaceTimer.txtSec.setText("60");
                    JOptionPane.showMessageDialog(null, "Hora de Descansar");
                } else {
                    i++;
                    aux = 60;
                    InterfaceTimer.txtSec.setText(aux + "");
                    aux--;
                }
            }
            try {
                Thread.sleep(1000);
                synchronized (this) {
                    while (this.pausa) {
                        wait();
                    }
                }
            } catch (InterruptedException ex) {

            }
        }
    }

    void stop() {
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
