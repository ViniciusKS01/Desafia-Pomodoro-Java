package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos implements Runnable {

    private boolean exit = false;
    private boolean pausa = false;

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
                    stop();
                    this.pausa = false;
                    JOptionPane.showMessageDialog(null, "Hora de Descansar");
                } else {
                    i++;
                    aux = 59;
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

    /*public void playSound() {
        URL url = getClass().getResource("/com.mycompany.desafio.pomodoro.java.InterfaceTimer/AudioRest (online-audio-converter.com).wav");
        AudioClip sound = Applet.newAudioClip(url);
        sound.play();
    }*/
 /*public static void playSound(String sound) {
        try {
            File file = new File(sound);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
        }
    }*/
}
