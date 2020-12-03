package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos_Rest implements Runnable {

    private boolean exit = false;
    private boolean pausa = false;

    @Override
    public void run() {
        int i = 1;
        int limite = 5;
        int aux = Integer.parseInt(InterfaceTimer.txtSec.getText());
        while (!exit) {
            InterfaceTimer.txtSec.setText(aux + "");
            aux--;
            if (aux < 0) {
                if (i == limite) {
                    stop();
                    this.pausa = false;
                    play("AudioStart");
                } else {
                    i++;
                    aux = 59;
                }
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

    public void play(String nomeAudio) {
        URL url = InterfaceTimer.class.getResource(nomeAudio + ".m4a");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
}
