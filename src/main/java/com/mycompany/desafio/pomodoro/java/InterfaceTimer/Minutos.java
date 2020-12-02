package com.mycompany.desafio.pomodoro.java.InterfaceTimer;

/**
 *
 * @author Vinícius Ivan
 */
public class Minutos implements Runnable {

    private static boolean exit = false;

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
            } catch (Exception e) {

            }
        }
    }
    static void stop() {
        exit = true;
    }
}
