package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinícius Ivan
 */
public class Segundos_Rest implements Runnable {

    private boolean exit = false;
    private boolean pausa = false;
    private int limit_rest = 3;
    private int limit = 5;
    private int i_aux = 1;

    @Override
    public void run() {
        int i = 1;
        if (this.i_aux == this.limit_rest) {
            limit = 10;
            this.i_aux = 1;
        } else {
            this.i_aux++;
        }
        int aux = Integer.parseInt(InterfaceTimer.txtSec.getText());
        while (!exit) {
            InterfaceTimer.txtSec.setText(aux + "");
            aux--;
            if (aux < 0) {
                if (i == limit) {
                    stop();
                    this.pausa = false;
                    JOptionPane.showMessageDialog(null, "Hora de Trabalhar");
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
        URL url = getClass().getResource("/com.mycompany.desafio.pomodoro.java.InterfaceTimer/AudioStart.wav");
        AudioClip sound = Applet.newAudioClip(url);
        sound.play();
    }*/
 /*public void playSound() {
        try {
            Clip sound = AudioSystem.getClip();
            AudioInputStream url = AudioSystem.getAudioInputStream(getClass().getResource("/com.mycompany.desafio.pomodoro.java.InterfaceTimer/AudioStart.wav"));
            sound.open(url);
            sound.start();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Segundos_Rest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Segundos_Rest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Segundos_Rest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
 /*public void playSound(String sound) {
        try {
            File file = new File(sound);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
        }
    }*/
}
