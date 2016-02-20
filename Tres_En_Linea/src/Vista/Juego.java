/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Controlador.Control.f0;
import static Controlador.Control.f1;
import static Controlador.Control.f2;
import static Controlador.Control.f3;
import static Controlador.Control.f4;
import static Controlador.Control.f5;
import static Controlador.Control.f6;
import static Controlador.Control.f7;
import static Controlador.Control.f8;
import Modelo.JuegoLogico;
import java.awt.Color;
import static Controlador.Control.p0;
import static Controlador.Control.p1;
import static Controlador.Control.p2;
import static Controlador.Control.p3;
import static Controlador.Control.p4;
import static Controlador.Control.p5;
import static Controlador.Control.p6;
import static Controlador.Control.p7;
import static Controlador.Control.p8;
import static Controlador.Control.pc;
import Modelo.cliente;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Marvin
 */
public class Juego extends javax.swing.JFrame implements Observer {

    /**
     * @return the individual
     */
    public static boolean isIndividual() {
        return individual;
    }
    public int puntosj1 = 0;
    public int puntosj2 = 0;
    private Object Controlador;

    /**
     * Creates new form Juego
     */
    static cliente client;
    private static boolean individual;

    public Juego(cliente cliente, boolean indiviual) {
        this.individual = indiviual;
        client = cliente;
        initComponents();
        this.setSize(690, 750);
//        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tres en Raya");
        this.getContentPane().setBackground(Color.BLACK);
        puntajeInicial();
        JuegoLogico.inicializarAtributos(this.client);
    }

    public Juego(boolean indiviual) {
        this.individual = indiviual;
        initComponents();
        this.setSize(690, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Tres en Raya");
        this.getContentPane().setBackground(Color.BLACK);
        puntajeInicial();
        JuegoLogico.inicializarAtributos(this);
    }

    public final void puntajeInicial() {
        String ptj1 = String.valueOf(puntosj1);
        String ptj2 = String.valueOf(puntosj2);
        jt_Pj1.setText(ptj1);
        jt_Pj2.setText(ptj2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jl_Jugador1 = new javax.swing.JLabel();
        jl_Jugador2 = new javax.swing.JLabel();
        jl_PuntosJ1 = new javax.swing.JLabel();
        jl_PuntosJ2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jt_J1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jt_J2 = new javax.swing.JTextField();
        jt_Pj1 = new javax.swing.JTextField();
        jt_Pj2 = new javax.swing.JTextField();
        jb_W = new javax.swing.JButton();
        jb_E = new javax.swing.JButton();
        jb_S = new javax.swing.JButton();
        jb_D = new javax.swing.JButton();
        jb_A = new javax.swing.JButton();
        jb_Z = new javax.swing.JButton();
        jb_X = new javax.swing.JButton();
        jb_C = new javax.swing.JButton();
        jb_Q = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        j_Cerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jl_Jugador1.setBackground(new java.awt.Color(0, 0, 0));
        jl_Jugador1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jl_Jugador1.setForeground(new java.awt.Color(255, 255, 255));
        jl_Jugador1.setText("Jugador 1");
        getContentPane().add(jl_Jugador1);
        jl_Jugador1.setBounds(63, 18, 90, 22);

        jl_Jugador2.setBackground(new java.awt.Color(0, 0, 0));
        jl_Jugador2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jl_Jugador2.setForeground(new java.awt.Color(255, 255, 255));
        jl_Jugador2.setText("Jugador 2");
        getContentPane().add(jl_Jugador2);
        jl_Jugador2.setBounds(437, 18, 90, 22);

        jl_PuntosJ1.setBackground(new java.awt.Color(0, 0, 0));
        jl_PuntosJ1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jl_PuntosJ1.setForeground(new java.awt.Color(255, 255, 255));
        jl_PuntosJ1.setText("Puntos");
        getContentPane().add(jl_PuntosJ1);
        jl_PuntosJ1.setBounds(209, 18, 120, 22);

        jl_PuntosJ2.setBackground(new java.awt.Color(0, 0, 0));
        jl_PuntosJ2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jl_PuntosJ2.setForeground(new java.awt.Color(255, 255, 255));
        jl_PuntosJ2.setText("Puntos");
        getContentPane().add(jl_PuntosJ2);
        jl_PuntosJ2.setBounds(568, 18, 60, 22);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(12, 107, 649, 10);

        jt_J1.setEditable(false);
        jt_J1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(jt_J1);
        jt_J1.setBounds(12, 58, 190, 40);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(320, 10, 10, 90);

        jt_J2.setEditable(false);
        jt_J2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(jt_J2);
        jt_J2.setBounds(375, 58, 186, 40);

        jt_Pj1.setEditable(false);
        jt_Pj1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(jt_Pj1);
        jt_Pj1.setBounds(209, 58, 60, 40);

        jt_Pj2.setEditable(false);
        jt_Pj2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        getContentPane().add(jt_Pj2);
        jt_Pj2.setBounds(568, 58, 60, 40);

        jb_W.setBackground(new java.awt.Color(0, 0, 0));
        jb_W.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_W.setForeground(new java.awt.Color(255, 255, 255));
        jb_W.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_WActionPerformed(evt);
            }
        });
        getContentPane().add(jb_W);
        jb_W.setBounds(260, 170, 140, 130);

        jb_E.setBackground(new java.awt.Color(0, 0, 0));
        jb_E.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_E.setForeground(new java.awt.Color(255, 255, 255));
        jb_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EActionPerformed(evt);
            }
        });
        getContentPane().add(jb_E);
        jb_E.setBounds(430, 170, 140, 130);

        jb_S.setBackground(new java.awt.Color(0, 0, 0));
        jb_S.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_S.setForeground(new java.awt.Color(255, 255, 255));
        jb_S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SActionPerformed(evt);
            }
        });
        getContentPane().add(jb_S);
        jb_S.setBounds(260, 330, 140, 130);

        jb_D.setBackground(new java.awt.Color(0, 0, 0));
        jb_D.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_D.setForeground(new java.awt.Color(255, 255, 255));
        jb_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DActionPerformed(evt);
            }
        });
        getContentPane().add(jb_D);
        jb_D.setBounds(430, 330, 140, 130);

        jb_A.setBackground(new java.awt.Color(0, 0, 0));
        jb_A.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_A.setForeground(new java.awt.Color(255, 255, 255));
        jb_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AActionPerformed(evt);
            }
        });
        getContentPane().add(jb_A);
        jb_A.setBounds(90, 330, 140, 130);

        jb_Z.setBackground(new java.awt.Color(0, 0, 0));
        jb_Z.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_Z.setForeground(new java.awt.Color(255, 255, 255));
        jb_Z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ZActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Z);
        jb_Z.setBounds(90, 480, 140, 130);

        jb_X.setBackground(new java.awt.Color(0, 0, 0));
        jb_X.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_X.setForeground(new java.awt.Color(255, 255, 255));
        jb_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_XActionPerformed(evt);
            }
        });
        getContentPane().add(jb_X);
        jb_X.setBounds(260, 480, 140, 130);

        jb_C.setBackground(new java.awt.Color(0, 0, 0));
        jb_C.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_C.setForeground(new java.awt.Color(255, 255, 255));
        jb_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CActionPerformed(evt);
            }
        });
        getContentPane().add(jb_C);
        jb_C.setBounds(430, 480, 140, 130);

        jb_Q.setBackground(new java.awt.Color(0, 0, 0));
        jb_Q.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jb_Q.setForeground(new java.awt.Color(255, 255, 255));
        jb_Q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jb_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_QActionPerformed(evt);
            }
        });
        getContentPane().add(jb_Q);
        jb_Q.setBounds(90, 170, 140, 130);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablero.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 150, 525, 478);

        jRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Habilitar teclado");
        jRadioButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jRadioButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(0, 620, 170, 25);

        jMenu1.setText("Juego");
        jMenu1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        j_Cerrar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        j_Cerrar.setText("Salir");
        j_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_CerrarActionPerformed(evt);
            }
        });
        jMenu1.add(j_Cerrar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jMenu2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenu2KeyPressed(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenuItem2.setText("Como Jugar!");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jMenuItem3.setText("Jugar con Teclado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Menu_Principal MP = null;
        try {
            MP = new Menu_Principal();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
        MP.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void j_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_CerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_j_CerrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Reglas rg = new Reglas();
        rg.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Teclado tc = new Teclado();
        tc.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed

    private void jb_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_QActionPerformed
        if (isIndividual()) {
            p0();
            pc();
        } else {
            f0();
        }
    }//GEN-LAST:event_jb_QActionPerformed

    private void jb_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_WActionPerformed
        if (isIndividual()) {
            p1();
            pc();
        } else {
            f1();
        }
    }//GEN-LAST:event_jb_WActionPerformed

    private void jb_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EActionPerformed
        if (isIndividual()) {
            p2();
            pc();
        } else {
            f2();
        }
    }//GEN-LAST:event_jb_EActionPerformed

    private void jb_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AActionPerformed
        if (isIndividual()) {
            p3();
            pc();
        } else {
            f3();
        }
    }//GEN-LAST:event_jb_AActionPerformed

    private void jb_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SActionPerformed
        if (isIndividual()) {
            p4();
            pc();
        } else {
            f4();
        }
    }//GEN-LAST:event_jb_SActionPerformed

    private void jb_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DActionPerformed
        if (isIndividual()) {
            p5();
            pc();
        } else {
            f5();
        }
    }//GEN-LAST:event_jb_DActionPerformed

    private void jb_ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ZActionPerformed
        if (isIndividual()) {
            p6();
            pc();
        } else {
            f6();
        }
    }//GEN-LAST:event_jb_ZActionPerformed

    private void jb_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_XActionPerformed
        if (isIndividual()) {
            p7();
            pc();
        } else {
            f7();
        }
    }//GEN-LAST:event_jb_XActionPerformed

    private void jb_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CActionPerformed
        if (isIndividual()) {
            p8();
            pc();
        } else {
            f8();
        }
    }//GEN-LAST:event_jb_CActionPerformed

    private void jMenu2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenu2KeyPressed

    }//GEN-LAST:event_jMenu2KeyPressed

    private void jRadioButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jRadioButton1KeyPressed
        switch (evt.getExtendedKeyCode()) {
            case java.awt.event.KeyEvent.VK_Q: {
                if (isIndividual()) {
                    p0();
                    pc();
                } else {
                    f0();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_W: {
                if (isIndividual()) {
                    p1();
                    pc();
                } else {
                    f1();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_E: {
                if (isIndividual()) {
                    p2();
                    pc();
                } else {
                    f2();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_A: {
                if (isIndividual()) {
                    p3();
                    pc();
                } else {
                    f3();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_S: {
                if (isIndividual()) {
                    p4();
                    pc();
                } else {
                    f4();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_D: {
                if (isIndividual()) {
                    p5();
                    pc();
                } else {
                    f5();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_Z: {
                if (isIndividual()) {
                    p6();
                    pc();
                } else {
                    f6();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_X: {
                if (isIndividual()) {
                    p7();
                    pc();
                } else {
                    f7();
                }
                break;
            }
            case java.awt.event.KeyEvent.VK_C: {
                if (isIndividual()) {
                    p8();
                    pc();
                } else {
                    f8();
                }
                break;
            }
        }
    }//GEN-LAST:event_jRadioButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego(isIndividual()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem j_Cerrar;
    public static javax.swing.JButton jb_A;
    public static javax.swing.JButton jb_C;
    public static javax.swing.JButton jb_D;
    public static javax.swing.JButton jb_E;
    public static javax.swing.JButton jb_Q;
    public static javax.swing.JButton jb_S;
    public static javax.swing.JButton jb_W;
    public static javax.swing.JButton jb_X;
    public static javax.swing.JButton jb_Z;
    private javax.swing.JLabel jl_Jugador1;
    private javax.swing.JLabel jl_Jugador2;
    private javax.swing.JLabel jl_PuntosJ1;
    private javax.swing.JLabel jl_PuntosJ2;
    public static javax.swing.JTextField jt_J1;
    public static javax.swing.JTextField jt_J2;
    public static javax.swing.JTextField jt_Pj1;
    public static javax.swing.JTextField jt_Pj2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }
}
