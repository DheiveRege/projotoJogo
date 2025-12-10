/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjetoFinal_1000;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author BRUNNAPAGANINIBERTOL
 */
public class TelaJogar extends javax.swing.JFrame {

    String classeSelecionada = "";
    String nome;

    int vida, forca, velocidade, mana;

    int etapa = 1;

    public TelaJogar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        laFoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boxPersonagem = new javax.swing.JComboBox<>();
        textNome = new javax.swing.JTextField();
        buttonDado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelVida = new javax.swing.JLabel();
        labelForca = new javax.swing.JLabel();
        labelAgilidade = new javax.swing.JLabel();
        labelMana = new javax.swing.JLabel();
        buttonIniciar = new javax.swing.JButton();
        labelTituloDois = new javax.swing.JLabel();
        labelTituloUm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        laFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Captura de tela 2025-11-17 193132.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        boxPersonagem.setBackground(new java.awt.Color(0, 0, 0));
        boxPersonagem.setForeground(new java.awt.Color(255, 255, 255));
        boxPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barbaro", "Mago", "Ladino", "Arqueiro" }));
        boxPersonagem.setSelectedIndex(-1);
        boxPersonagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        boxPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPersonagemActionPerformed(evt);
            }
        });

        textNome.setBackground(new java.awt.Color(0, 0, 0));
        textNome.setForeground(new java.awt.Color(255, 255, 255));
        textNome.setText("Insira seu nome:");
        textNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        textNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textNomeFocusLost(evt);
            }
        });
        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        buttonDado.setBackground(new java.awt.Color(0, 0, 0));
        buttonDado.setForeground(new java.awt.Color(255, 255, 255));
        buttonDado.setText("Girar Dado");
        buttonDado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDadoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escolha sua classe");

        jPanel3.setBackground(new java.awt.Color(26, 22, 22));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        labelVida.setBackground(new java.awt.Color(255, 255, 255));
        labelVida.setForeground(new java.awt.Color(255, 255, 255));
        labelVida.setText("Vida:");

        labelForca.setBackground(new java.awt.Color(255, 255, 255));
        labelForca.setForeground(new java.awt.Color(255, 255, 255));
        labelForca.setText("Força:");

        labelAgilidade.setBackground(new java.awt.Color(255, 255, 255));
        labelAgilidade.setForeground(new java.awt.Color(255, 255, 255));
        labelAgilidade.setText("Agilidade:");

        labelMana.setBackground(new java.awt.Color(255, 255, 255));
        labelMana.setForeground(new java.awt.Color(255, 255, 255));
        labelMana.setText("Mana:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVida)
                    .addComponent(labelForca)
                    .addComponent(labelAgilidade)
                    .addComponent(labelMana))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelForca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAgilidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMana, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        buttonIniciar.setBackground(new java.awt.Color(0, 0, 0));
        buttonIniciar.setForeground(new java.awt.Color(255, 255, 255));
        buttonIniciar.setText("Iniciar");
        buttonIniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        buttonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boxPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonDado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(buttonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        labelTituloDois.setBackground(new java.awt.Color(255, 255, 255));
        labelTituloDois.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelTituloDois.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloDois.setText("Lost");

        labelTituloUm.setBackground(new java.awt.Color(255, 255, 255));
        labelTituloUm.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelTituloUm.setForeground(new java.awt.Color(255, 255, 255));
        labelTituloUm.setText("The");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(labelTituloUm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelTituloDois))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(laFoto)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTituloDois, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTituloUm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIniciarActionPerformed
        createCharacter();
    }//GEN-LAST:event_buttonIniciarActionPerformed

    private void buttonDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDadoActionPerformed
        setRandomStatus();
    }//GEN-LAST:event_buttonDadoActionPerformed

    private void textNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusGained
        if ("Insira seu nome:".equals(textNome.getText())) {
            textNome.setText("");
        }
    }//GEN-LAST:event_textNomeFocusGained

    private void boxPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPersonagemActionPerformed
        String selecionado = boxPersonagem.getSelectedItem().toString();
        if (selecionado.equals("Mago")) {
            classeSelecionada = "Mago";

        } else if (selecionado.equals("Barbaro")) {
            classeSelecionada = "Barbaro";

        } else if (selecionado.equals("Ladino")) {
            classeSelecionada = "Ladino";

        } else if (selecionado.equals("Arqueiro")) {
            classeSelecionada = "Arqueiro";
        }

    }//GEN-LAST:event_boxPersonagemActionPerformed

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void textNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textNomeFocusLost
        if ("".equals(textNome.getText())) {
            textNome.setText("Insira seu nome:");
        }
    }//GEN-LAST:event_textNomeFocusLost

    public int dados() {
        int resultadoDado = Dados.useDice();

        return resultadoDado;
    }

    public void visable() {
        laFoto.setVisible(true);
    }

    public void noVisible() {
        laFoto.setVisible(false);
    }

    public void setRandomStatus() {
        if (classeSelecionada.equals("")) {
            JOptionPane.showMessageDialog(this, "Escolha uma classe primeiro!");
            return;
        }
        int resultado = dados();
        int resultado2 = dados();
        int resultado3 = dados();
        switch (etapa) {
            case 1:
                int vida1 = resultado;
                JOptionPane.showMessageDialog(this, "Giro de dado: " + vida1);
                int vida2 = resultado2;
                JOptionPane.showMessageDialog(this, "segundo giro de dado: " + vida2);
                int vida3 = resultado3;
                JOptionPane.showMessageDialog(this, "tereiro giro de dado: " + vida3);
                vida = vida1 + vida2 + vida3;
                JOptionPane.showMessageDialog(this, "Vida foi definida como: " + vida + "HP");
                labelVida.setText("vida: " + vida);
                etapa++;
                break;
            case 2:
                forca = resultado;
                JOptionPane.showMessageDialog(this, "Força definida: " + forca);
                if (classeSelecionada.equals("Barbaro")) {
                    forca = resultado + 2;
                    JOptionPane.showMessageDialog(this, "porem voce e um Barbaro entao \n Forca: " + forca);
                } else if (classeSelecionada.equals("Arqueiro")) {
                    forca = resultado + 1;
                    JOptionPane.showMessageDialog(this, "porem voce e um Arqueiro entao \n Forca: " + forca);
                }
                labelForca.setText("Força: " + forca);
                etapa++;
                break;
            case 3:
                velocidade = resultado;
                JOptionPane.showMessageDialog(this, "\n Velocidade: " + velocidade);
                if (classeSelecionada.equals("Arqueiro")) {
                    velocidade = resultado + 1;
                    JOptionPane.showMessageDialog(this, "Porem voce e Arqueiro entao \n Velocidade: " + velocidade);
                } else if (classeSelecionada.equals("Ladino")) {
                    velocidade = resultado + 2;
                    JOptionPane.showMessageDialog(this, "Porem voce e Ladino entao \n Mana: " + velocidade);
                }
                labelAgilidade.setText("Agilidade: " + velocidade);
                etapa++;
                break;
            case 4:
                mana = resultado;
                JOptionPane.showMessageDialog(this, "Mana definida: " + mana);
                if (classeSelecionada.equals("Mago")) {
                    mana = resultado + 2;
                    JOptionPane.showMessageDialog(this, "Porem voce e mago entao: " + mana);
                }
                labelMana.setText("Mana: " + mana);
                etapa++;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Todos os atributos já foram definidos! Clique em 'Criar Personagem'.");
        }
    }

    public void createCharacter() {
        nome = textNome.getText();
        if (etapa < 5) {
            JOptionPane.showMessageDialog(this, "Você ainda não definiu todos os atributos!");
            return;
        }
        Personagem personagem = null;
        switch (classeSelecionada) {
            case "Mago":
                personagem = new Mago(nome, vida, mana, forca, velocidade);
                break;
            case "Barbaro":
                personagem = new Barbaro(nome, vida, mana, forca, velocidade);
                break;
            case "Arqueiro":
                personagem = new Arqueiro(nome, vida, mana, forca, velocidade);
                break;
            case "Ladino":
                personagem = new Ladino(nome, vida, mana, forca, velocidade);
                break;
        }
        JOptionPane.showMessageDialog(this,
                classeSelecionada + " criado com sucesso!\n\n"
                + "Nome: " + nome
                + "\nVida: " + vida
                + "\nForça: " + forca
                + "\nVelocidade: " + velocidade
                + "\nMana: " + mana);
        new TelaInicio(personagem).setVisible(true);
        this.dispose();
    }

    public void setScreen() {
        String selecionado = boxPersonagem.getSelectedItem().toString();
        if (selecionado.equals("Mago")) {
            

        } else if (selecionado.equals("Barbaro")) {
            classeSelecionada = "Barbaro";

        } else if (selecionado.equals("Ladino")) {
            classeSelecionada = "Ladino";

        } else if (selecionado.equals("Arqueiro")) {
            classeSelecionada = "Arqueiro";
        }

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
            java.util.logging.Logger.getLogger(TelaJogar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPersonagem;
    private javax.swing.JButton buttonDado;
    private javax.swing.JButton buttonIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel laFoto;
    private javax.swing.JLabel labelAgilidade;
    private javax.swing.JLabel labelForca;
    private javax.swing.JLabel labelMana;
    private javax.swing.JLabel labelTituloDois;
    private javax.swing.JLabel labelTituloUm;
    private javax.swing.JLabel labelVida;
    private javax.swing.JTextField textNome;
    // End of variables declaration//GEN-END:variables
}
