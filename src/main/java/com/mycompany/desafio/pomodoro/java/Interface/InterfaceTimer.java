/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desafio.pomodoro.java.Interface;

/**
 *
 * @author Vinícius Ivan
 */
public class InterfaceTimer extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceTimer
     */
    public InterfaceTimer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonStart = new javax.swing.JButton();
        buttonStop = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonRest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timer1 = new javax.swing.JLabel();
        timer2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonStart.setText("Start");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStartActionPerformed(evt);
            }
        });

        buttonStop.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonStop.setText("Stop");
        buttonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStopActionPerformed(evt);
            }
        });

        buttonReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonRest.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buttonRest.setText("Rest");
        buttonRest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cronômetro Pomodoro");

        timer1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timer1.setText("25");
        timer1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                timer1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        timer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timer2.setText("00");

        jLabel3.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(timer1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(timer2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonStart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonStop)
                    .addComponent(buttonRest))
                .addGap(73, 73, 73)
                .addComponent(buttonReset)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timer1)
                    .addComponent(timer2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonStart)
                    .addComponent(buttonStop)
                    .addComponent(buttonReset))
                .addGap(28, 28, 28)
                .addComponent(buttonRest)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStartActionPerformed
        setStart_minuts(25);
        //conversor_minuts = Integer.valueOf(timer1.getText());
        //timer1.getText();
        setStart_seconds(00);
        while (getStart_minuts() > 0 && getStart_seconds() > 0) {
            setStart_minuts(getStart_minuts() - 1);
            timer1.setText(String.valueOf(getStart_minuts()));
            timer1.getText();
            setStart_seconds(59);
            timer2.setText(String.valueOf(getStart_seconds()));
           // timer2.getText();
            while (getStart_seconds() > 0) {
                setStart_seconds(getStart_seconds() - 1);
                timer();
                timer2.setText(String.valueOf(getStart_seconds()));
                //timer2.getText();
            }
            setStart_seconds(59);
        }

    }//GEN-LAST:event_buttonStartActionPerformed

    private void buttonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStopActionPerformed
        setStart_minuts(0);
        setStart_seconds(0);
    }//GEN-LAST:event_buttonStopActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        setStart_minuts(25);
        setStart_seconds(00);
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonRestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestActionPerformed
        setRest_minuts(5);
        setRest_seconds(00);
        while (getRest_minuts() > 0 && getRest_seconds() > 0) {
            setRest_minuts(getRest_minuts() - 1);
            setRest_seconds(59);
            while (getRest_seconds() > 0) {
                setRest_seconds(getRest_seconds() - 1);
                timer();
            }
            setRest_seconds(59);
        }
    }//GEN-LAST:event_buttonRestActionPerformed

    private void timer1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_timer1AncestorAdded

    }//GEN-LAST:event_timer1AncestorAdded

    public void timer() {
        for (int i = 0; i < 1000; i++) {
            i--;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonRest;
    private javax.swing.JButton buttonStart;
    private javax.swing.JButton buttonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timer1;
    private javax.swing.JLabel timer2;
    // End of variables declaration//GEN-END:variables
    private int start_minuts;
    private int start_seconds;
    private int rest_minuts;
    private int rest_seconds;
    private int conversor_minuts;
    private int conversor_seconds;
    private int aux;

    public int getStart_minuts() {
        return start_minuts;
    }

    public void setStart_minuts(int start_minuts) {
        this.start_minuts = start_minuts;
    }

    public int getStart_seconds() {
        return start_seconds;
    }

    public void setStart_seconds(int start_seconds) {
        this.start_seconds = start_seconds;
    }

    public int getRest_minuts() {
        return rest_minuts;
    }

    public void setRest_minuts(int rest_minuts) {
        this.rest_minuts = rest_minuts;
    }

    public int getRest_seconds() {
        return rest_seconds;
    }

    public void setRest_seconds(int rest_seconds) {
        this.rest_seconds = rest_seconds;
    }
}
