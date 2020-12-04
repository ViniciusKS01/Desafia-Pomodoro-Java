package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos_Rest implements Runnable {

    private boolean exit = false;
    private boolean pausa = false;
    private int limit_rest = 4;
    private int limit = 5;
    //private int i_aux = 1;

    @Override
    public void run() {
        int i = 1;
        int i_rest = Integer.parseInt(InterfaceTimer.qtdP.getText());
        if (i_rest == this.limit_rest) {
            limit = 10;
            this.limit_rest = this.limit_rest + 4;
            //this.i_aux = 1;
        } else {
            limit = 5;
            //this.i_aux++;
        }
        int aux = Integer.parseInt(InterfaceTimer.txtSec.getText());
        while (!exit) {
            InterfaceTimer.txtSec.setText(aux + "");
            aux--;
            if (aux < 0) {
                if (i == limit) {
                    stop();
                    this.pausa = false;
                    InterfaceTimer.txtMin.setText("25");
                    InterfaceTimer.txtSec.setText("60");
                    JOptionPane.showMessageDialog(null, "Hora de Trabalhar");
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
