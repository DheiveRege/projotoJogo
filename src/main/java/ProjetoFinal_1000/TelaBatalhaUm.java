/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjetoFinal_1000;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaBatalhaUm extends javax.swing.JFrame {

    private Personagem personagem;
    int etapa = 0;
    private Inimigo inimigo = new Inimigo("Esquelto", 8, 3, 2, 2);

    int numeroDado;

    public TelaBatalhaUm() {
        initComponents();

    }

    public TelaBatalhaUm(Personagem personagem) {
        initComponents();
        setLocationRelativeTo(null);
        this.personagem = personagem;
        buttonAvanca.setVisible(false);
        buttonReset.setVisible(false);
        progressMana.setMaximum(personagem.getMana());
        progressVida.setMaximum(personagem.getLife());
        progressInimigo.setMaximum(inimigo.getLife());
        progressBars();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelMana = new javax.swing.JLabel();
        labelVida = new javax.swing.JLabel();
        buttonBater = new javax.swing.JButton();
        buttonRandomDice = new javax.swing.JButton();
        buttonAvanca = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonEscapar = new javax.swing.JButton();
        progressMana = new javax.swing.JProgressBar();
        progressVida = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        progressInimigo = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        labelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de tela 2025-11-18 195427.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        labelMana.setBackground(new java.awt.Color(255, 255, 255));
        labelMana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelMana.setForeground(new java.awt.Color(255, 255, 255));
        labelMana.setText("Mana:");

        labelVida.setBackground(new java.awt.Color(255, 255, 255));
        labelVida.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelVida.setForeground(new java.awt.Color(255, 255, 255));
        labelVida.setText("Vida:");

        buttonBater.setBackground(new java.awt.Color(0, 0, 0));
        buttonBater.setForeground(new java.awt.Color(255, 255, 255));
        buttonBater.setText("Atacar");
        buttonBater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonBater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBaterActionPerformed(evt);
            }
        });

        buttonRandomDice.setBackground(new java.awt.Color(0, 0, 0));
        buttonRandomDice.setForeground(new java.awt.Color(255, 255, 255));
        buttonRandomDice.setText("Girar dados");
        buttonRandomDice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonRandomDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRandomDiceActionPerformed(evt);
            }
        });

        buttonAvanca.setBackground(new java.awt.Color(0, 0, 0));
        buttonAvanca.setForeground(new java.awt.Color(255, 255, 255));
        buttonAvanca.setText("Avançar");
        buttonAvanca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonAvanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAvancaActionPerformed(evt);
            }
        });

        buttonReset.setBackground(new java.awt.Color(0, 0, 0));
        buttonReset.setForeground(new java.awt.Color(255, 255, 255));
        buttonReset.setText("Reiniciar");
        buttonReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonEscapar.setBackground(new java.awt.Color(0, 0, 0));
        buttonEscapar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEscapar.setText("Escapar");
        buttonEscapar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonEscapar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEscaparActionPerformed(evt);
            }
        });

        progressMana.setBackground(new java.awt.Color(0, 51, 204));
        progressMana.setForeground(new java.awt.Color(0, 204, 255));

        progressVida.setBackground(new java.awt.Color(0, 153, 51));
        progressVida.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de tela 2025-11-19 213645.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelMana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(labelVida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(progressMana, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(progressVida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonBater, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRandomDice, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonEscapar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonAvanca, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressVida, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVida))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progressMana, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMana))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonRandomDice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonBater)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEscapar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonAvanca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        progressInimigo.setBackground(new java.awt.Color(255, 0, 51));
        progressInimigo.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guardiões Esqueletos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(progressInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFoto)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBaterActionPerformed
        progressBars();
        if (etapa > 0) {
            attack();
        } else {
            JOptionPane.showMessageDialog(this, "voce tem que girar o dado primeiro!");
        }
        if (personagem.estaMorto()) {
            viewButton1();
        }
        if (inimigo.estaMorto()) {
            JOptionPane.showMessageDialog(this, "Voce derrotou " + inimigo.getName());
            viewButton2();
        }

        etapa = 0;
    }//GEN-LAST:event_buttonBaterActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        new TelaJogar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonAvancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAvancaActionPerformed
        new TelaSegunda(personagem).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonAvancaActionPerformed

    private void buttonEscaparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEscaparActionPerformed
        if (!Jogo.escape(personagem, inimigo)) {
            if (inimigo.attack(personagem, inimigo)) {
                JOptionPane.showMessageDialog(this, "Voce foi lento demais \n nao conseguiu escapar \n Dano recebido: " + inimigo.getStrength());
            } else {
                JOptionPane.showMessageDialog(this, "O inimigo e incompetente \n Inimigo errou o ataque");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Voce conseguiu escapar!!!");
            new TelaSegunda(personagem).setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_buttonEscaparActionPerformed

    private void buttonRandomDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRandomDiceActionPerformed
        if (etapa > 0) {
            JOptionPane.showMessageDialog(this, "ta tentando ne filho nois ta pesseia");
        }
        numeroDado = Dados.useDice();
        JOptionPane.showMessageDialog(this, "Voce girou o dado! \n Resultado: " + numeroDado);
        etapa = 1;

    }//GEN-LAST:event_buttonRandomDiceActionPerformed

    public void progressBars() {
        // vida
        progressVida.setValue(personagem.getLife());
        progressVida.setStringPainted(true);
        progressVida.setString(personagem.getLife() + "/" + progressVida.getMaximum());
        // mana
        progressMana.setValue(personagem.getMana());
        progressMana.setStringPainted(true);
        progressMana.setString(personagem.getMana() + "/" + progressMana.getMaximum());
        //inimigo 
        progressInimigo.setValue(inimigo.getLife());
        progressInimigo.setStringPainted(true);
        progressInimigo.setString(inimigo.getLife() + "/" + progressInimigo.getMaximum());
    }

    //mostra os botao se o personagem morrer
    public void viewButton1() {
        //nao visivel
        buttonBater.setVisible(false);
        buttonEscapar.setVisible(false);
        buttonRandomDice.setVisible(false);
        //visivel
        buttonReset.setVisible(true);
    }

    public void viewButton2() {
        //nao visivel
        buttonBater.setVisible(false);
        buttonRandomDice.setVisible(false);
        buttonEscapar.setVisible(false);
        //visivel
        buttonAvanca.setVisible(true);
    }

    public void attack() {
        //aumentando forca do personagem baseado no numero do dado
        int forca1 = personagem.getStrength();
        System.out.println(forca1);
        personagem.setStrength(forca1 + numeroDado);
        System.out.println(personagem.getStrength());
        //combate
        inimigo.attack(personagem, inimigo);
        if (personagem.attack(personagem, inimigo)) {
            JOptionPane.showMessageDialog(this, "voce acertou e causo" + personagem.getStrength());
        } else {
            JOptionPane.showMessageDialog(this, "Errou!!!!");
        }

        //forca volta ao normal
        personagem.setStrength(forca1);
        System.out.println(personagem.getStrength());

        //mostar barra de vida atualizado apos attack do personagem
        progressVida.setValue(personagem.getLife());
        progressVida.setString(personagem.getLife() + "/" + progressVida.getMaximum());
        //mostar barra de vida atualizado apos attack do Inimigo
        progressInimigo.setValue(inimigo.getLife());
        progressInimigo.setString(inimigo.getLife() + "/" + progressInimigo.getMaximum());
    }

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
            java.util.logging.Logger.getLogger(TelaBatalhaUm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBatalhaUm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBatalhaUm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBatalhaUm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaBatalhaUm batalha = new TelaBatalhaUm();
                batalha.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAvanca;
    private javax.swing.JButton buttonBater;
    private javax.swing.JButton buttonEscapar;
    private javax.swing.JButton buttonRandomDice;
    private javax.swing.JButton buttonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelMana;
    private javax.swing.JLabel labelVida;
    private javax.swing.JProgressBar progressInimigo;
    private javax.swing.JProgressBar progressMana;
    private javax.swing.JProgressBar progressVida;
    // End of variables declaration//GEN-END:variables
}
