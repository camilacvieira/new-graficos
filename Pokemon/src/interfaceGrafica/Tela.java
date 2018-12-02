/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica;
import pokemon.*;
import classesPokemons.*;
import pokemon.Treinador;
/**
 *
 * @author Alorya
 */
public class Tela extends javax.swing.JFrame {
    public int i=0;
    public Pokemon p1 = new Pikachu();
    public Pokemon p2 = new Blastoise();
    public Pokemon p3 = new Bulbassauro();
    public Pokemon p4 = new Charizard();
    public Pokemon p5 = new Charmander();
    public Pokemon p6 = new Flareon();
    public Pokemon p7 = new Gyrados();
    public Pokemon p8 = new Jolteon();
    public Pokemon p9 = new Onix();
    public Pokemon p10 = new Venossauro();
    public Pokemon p11 = new Vaporeon();
    public Pokemon p12 = new Squirtle();
    public Time t1 = new Time(p5,p11,p10);
    public Time t2 = new Time(p12,p6,p7);
    public Time t3 = new Time(p3,p8,p2);
    public Time t4 = new Time(p1,p4,p9);
    public Time timeA;
    public Time timeB;
    public Treinador treinadorA;
    public Treinador treinadorB;

    
    /**
     * Creates new form Tela
     */
    public Tela() {
        
        initComponents();
        escolherTime.setVisible(false);
        batalha.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        batalha = new javax.swing.JPanel();
        iniciarBatalha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        escolherTime = new javax.swing.JPanel();
        time1 = new javax.swing.JButton();
        time2 = new javax.swing.JButton();
        time3 = new javax.swing.JButton();
        time4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        telaInicial = new javax.swing.JPanel();
        comecarJogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1290, 760));
        getContentPane().setLayout(null);

        batalha.setLayout(null);

        iniciarBatalha.setText("Iniciar Batalha!");
        iniciarBatalha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarBatalhaActionPerformed(evt);
            }
        });
        batalha.add(iniciarBatalha);
        iniciarBatalha.setBounds(570, 20, 150, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cgfd.png"))); // NOI18N
        batalha.add(jLabel3);
        jLabel3.setBounds(0, 0, 1280, 720);

        getContentPane().add(batalha);
        batalha.setBounds(0, 0, 1280, 720);

        escolherTime.setLayout(null);

        time1.setBorderPainted(false);
        time1.setContentAreaFilled(false);
        time1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1ActionPerformed(evt);
            }
        });
        escolherTime.add(time1);
        time1.setBounds(150, 240, 260, 50);

        time2.setBorderPainted(false);
        time2.setContentAreaFilled(false);
        time2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time2ActionPerformed(evt);
            }
        });
        escolherTime.add(time2);
        time2.setBounds(870, 240, 260, 50);

        time3.setBorderPainted(false);
        time3.setContentAreaFilled(false);
        time3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time3ActionPerformed(evt);
            }
        });
        escolherTime.add(time3);
        time3.setBounds(150, 620, 270, 50);

        time4.setBorderPainted(false);
        time4.setContentAreaFilled(false);
        time4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        time4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time4ActionPerformed(evt);
            }
        });
        escolherTime.add(time4);
        time4.setBounds(870, 620, 260, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaEscolhaPersonagem.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        escolherTime.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        getContentPane().add(escolherTime);
        escolherTime.setBounds(0, 0, 1280, 720);

        telaInicial.setLayout(null);

        comecarJogo.setBorderPainted(false);
        comecarJogo.setContentAreaFilled(false);
        comecarJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comecarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comecarJogoActionPerformed(evt);
            }
        });
        telaInicial.add(comecarJogo);
        comecarJogo.setBounds(425, 270, 470, 105);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TelaInicial.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        telaInicial.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        getContentPane().add(telaInicial);
        telaInicial.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comecarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comecarJogoActionPerformed
        telaInicial.setVisible(false);
        batalha.setVisible(false);
        escolherTime.setVisible(true);
    }//GEN-LAST:event_comecarJogoActionPerformed

    private void time3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time3ActionPerformed
        if(i==0){
            System.out.println("Jogador 1 escolheu time 3");
            timeA=t3;
            i=1;            
        }
        else{
            System.out.println("Jogador 2 escolheu time 3");
            i=0;
            timeB=t3;
            escolherTime.setVisible(false);
            batalha.setVisible(true);
            atribuiTimes();
        }     
    }//GEN-LAST:event_time3ActionPerformed

    private void time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time2ActionPerformed
        if(i==0){
            System.out.println("Jogador 1 escolheu time 2");
            i=1;
            timeA=t2;
        }
        else{
            System.out.println("Jogador 2 escolheu time 2");
            i=0;
            timeB=t2;
            escolherTime.setVisible(false);
            batalha.setVisible(true);
            atribuiTimes();
        }  
    }//GEN-LAST:event_time2ActionPerformed

    private void time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1ActionPerformed
        if(i==0){
            System.out.println("Jogador 1 escolheu time 1");
            i=1;
            timeA=t1;
        }
        else{
            System.out.println("Jogador 2 escolheu time 1");
            i=0;
            timeB=t1;
            escolherTime.setVisible(false);
            batalha.setVisible(true);
            atribuiTimes();
        }  
    }//GEN-LAST:event_time1ActionPerformed

    private void time4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time4ActionPerformed
        if(i==0){
            System.out.println("Jogador 1 escolheu time 4");
            i=1;
            timeA=t4;
        }
        else{
            System.out.println("Jogador 2 escolheu time 4");
            i=0;
            timeB=t4;
            escolherTime.setVisible(false);
            batalha.setVisible(true);
            atribuiTimes();
        }  
    }//GEN-LAST:event_time4ActionPerformed

    private void atribuiTimes(){
        treinadorA = new Treinador(timeA);
        treinadorB = new Treinador(timeB);
    }
   
    
    private void iniciarBatalhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarBatalhaActionPerformed
        iniciarBatalha.setVisible(false);
        if(timeA!=null&&timeB!=null){
            Batalha Bat = new Batalha(treinadorA, treinadorB);
            Bat.comecarBatalha();
        }
    }//GEN-LAST:event_iniciarBatalhaActionPerformed
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel batalha;
    private javax.swing.JButton comecarJogo;
    private javax.swing.JPanel escolherTime;
    private javax.swing.JButton iniciarBatalha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel telaInicial;
    private javax.swing.JButton time1;
    private javax.swing.JButton time2;
    private javax.swing.JButton time3;
    private javax.swing.JButton time4;
    // End of variables declaration//GEN-END:variables
}
