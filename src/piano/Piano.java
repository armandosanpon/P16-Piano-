/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piano;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author armandosanpon
 */
public class Piano extends javax.swing.JFrame {

    JButton jbt [];
    int counter;
    AudioClip audioClip2;
    String[] arrayNotes;
    String letters;
    
    public Piano() {
        initComponents();
        initConfig();
        keyboardlistener();
        song();
      }  
    
       //contructor
    private void initConfig() {
       
      this.getContentPane().setBackground(Color.black);
      setLocationRelativeTo(null);   
      this.setExtendedState(MAXIMIZED_BOTH);
        
      jbt = new JButton[]{Bt00,Bt01,Bt02,Bt03,Bt04,Bt05,Bt06,Bt07,
      Bt08,Bt09,Bt10,Bt11,Bt12,Bt13,Bb00,Bb01,Bb02,Bb03,Bb04,Bb05,
      Bb06,Bb07,Bb08,Bb09};
      
      arrayNotes = new String[]{"Do",  "Re", "Mi", "Fa", "Sol", "La", 
      "Si", "Do2", "Re", "Mi", "Fa", "Sol", "La", "Si", "DoSharp", 
      "ReSharp", "FaSharp", "SolSharp", "LaSharp", "DoSharp2", 
      "ReSharp2", "FaSharp2", "SolSharp2", "LaSharp2" };
      
     letters = "ASDFGHJKLÑZXCVQWERTYUIOP";
     
     for(int i=0; i<jbt.length; i++){
          jbt[i].setName(i + "");
        }
    } 
    private void keyboardlistener() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(final KeyEvent e) {
               synchronized (Piano.class) {
                   try {
                       readKeyBoard(e);
                   } catch (MalformedURLException ex) {
                       Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
                   }
                return false;
                }
            }
        });
    } //fin de listener
    
    private void readKeyBoard(KeyEvent event) throws MalformedURLException{                            
        
        char letter = event.getKeyChar();
        counter++;
        if(counter==3){
             counter=0;
            int num= letters.indexOf(String.valueOf(letter).toUpperCase());
            sound(arrayNotes[num]);       
        }              
    }  
     private void sound1(String nota) {
        String sNota = "/notas/" + nota + ".wÑav";
        AudioClip audioClip;
        audioClip = java.applet.Applet.newAudioClip(getClass().getResource(sNota));
        audioClip.play();
        //System.out.println(sNota);
    }
    private void sound(String nota) throws MalformedURLException{
       //this.getClass().getResource("\\notas\\"+"Do.wav");
       String path = System.getProperty("user.dir");
       path += "\\src\\notas\\" + nota + ".wav";
       
       File file = new File(path); //adecuar la ruta
       URL url = file.toURL();
       AudioClip audioClip = java.applet.Applet.newAudioClip(url);     
       audioClip.play();      
    }
    private void song(){
       String song = "sonido.wav";
       audioClip2 = java.applet.Applet.newAudioClip(getClass().getResource(song));
       
    }  
    private void pause(){
        audioClip2.stop();
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Bb01 = new javax.swing.JButton();
        Bb00 = new javax.swing.JButton();
        Bt02 = new javax.swing.JButton();
        Bt01 = new javax.swing.JButton();
        Bb03 = new javax.swing.JButton();
        Bb04 = new javax.swing.JButton();
        Bt06 = new javax.swing.JButton();
        Bt05 = new javax.swing.JButton();
        Bb02 = new javax.swing.JButton();
        Bt04 = new javax.swing.JButton();
        Bt03 = new javax.swing.JButton();
        Bt00 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        Bb06 = new javax.swing.JButton();
        Bb05 = new javax.swing.JButton();
        Bt07 = new javax.swing.JButton();
        Bt08 = new javax.swing.JButton();
        Bt09 = new javax.swing.JButton();
        Bb08 = new javax.swing.JButton();
        Bb09 = new javax.swing.JButton();
        Bt13 = new javax.swing.JButton();
        Bt12 = new javax.swing.JButton();
        Bb07 = new javax.swing.JButton();
        Bt10 = new javax.swing.JButton();
        Bt11 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButtonMute = new javax.swing.JButton();
        jButtonUp = new javax.swing.JButton();
        jButtonDown = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonRecord = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonResume = new javax.swing.JButton();
        jButtonLeft = new javax.swing.JButton();
        jButtonPause = new javax.swing.JButton();
        jComboBoxList = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1310, 20, 39, 23);

        Bb01.setBackground(new java.awt.Color(0, 0, 0));
        Bb01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb01);
        Bb01.setBounds(270, 340, 40, 150);

        Bb00.setBackground(new java.awt.Color(0, 0, 0));
        Bb00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb00);
        Bb00.setBounds(190, 340, 40, 150);

        Bt02.setBackground(new java.awt.Color(255, 255, 255));
        Bt02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt02);
        Bt02.setBounds(280, 340, 90, 260);

        Bt01.setBackground(new java.awt.Color(255, 255, 255));
        Bt01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt01);
        Bt01.setBounds(200, 340, 90, 260);

        Bb03.setBackground(new java.awt.Color(0, 0, 0));
        Bb03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb03);
        Bb03.setBounds(500, 340, 40, 150);

        Bb04.setBackground(new java.awt.Color(0, 0, 0));
        Bb04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb04);
        Bb04.setBounds(580, 340, 40, 150);

        Bt06.setBackground(new java.awt.Color(255, 255, 255));
        Bt06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt06);
        Bt06.setBounds(600, 340, 90, 260);

        Bt05.setBackground(new java.awt.Color(255, 255, 255));
        Bt05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt05);
        Bt05.setBounds(520, 340, 90, 260);

        Bb02.setBackground(new java.awt.Color(0, 0, 0));
        Bb02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb02);
        Bb02.setBounds(430, 340, 40, 150);

        Bt04.setBackground(new java.awt.Color(255, 255, 255));
        Bt04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt04);
        Bt04.setBounds(440, 340, 90, 260);

        Bt03.setBackground(new java.awt.Color(255, 255, 255));
        Bt03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt03);
        Bt03.setBounds(360, 340, 90, 260);

        Bt00.setBackground(new java.awt.Color(255, 255, 255));
        Bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt00);
        Bt00.setBounds(120, 340, 90, 260);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton10);
        jButton10.setBounds(430, 340, 40, 150);

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton12);
        jButton12.setBounds(510, 340, 40, 150);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton11);
        jButton11.setBounds(430, 340, 40, 150);

        Bb06.setBackground(new java.awt.Color(0, 0, 0));
        Bb06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb06);
        Bb06.setBounds(820, 340, 40, 150);

        Bb05.setBackground(new java.awt.Color(0, 0, 0));
        Bb05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb05);
        Bb05.setBounds(740, 340, 40, 150);

        Bt07.setBackground(new java.awt.Color(255, 255, 255));
        Bt07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt07);
        Bt07.setBounds(670, 340, 90, 260);

        Bt08.setBackground(new java.awt.Color(255, 255, 255));
        Bt08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt08);
        Bt08.setBounds(750, 340, 90, 260);

        Bt09.setBackground(new java.awt.Color(255, 255, 255));
        Bt09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt09);
        Bt09.setBounds(830, 340, 90, 260);

        Bb08.setBackground(new java.awt.Color(0, 0, 0));
        Bb08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb08);
        Bb08.setBounds(1050, 340, 40, 150);

        Bb09.setBackground(new java.awt.Color(0, 0, 0));
        Bb09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb09);
        Bb09.setBounds(1130, 340, 40, 150);

        Bt13.setBackground(new java.awt.Color(255, 255, 255));
        Bt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt13);
        Bt13.setBounds(1150, 340, 90, 260);

        Bt12.setBackground(new java.awt.Color(255, 255, 255));
        Bt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt12);
        Bt12.setBounds(1070, 340, 90, 260);

        Bb07.setBackground(new java.awt.Color(0, 0, 0));
        Bb07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bb07);
        Bb07.setBounds(980, 340, 40, 150);

        Bt10.setBackground(new java.awt.Color(255, 255, 255));
        Bt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt10);
        Bt10.setBounds(910, 340, 90, 260);

        Bt11.setBackground(new java.awt.Color(255, 255, 255));
        Bt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt00ActionPerformed(evt);
            }
        });
        getContentPane().add(Bt11);
        Bt11.setBounds(990, 340, 90, 260);

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton30);
        jButton30.setBounds(980, 340, 40, 150);

        jButton31.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton31);
        jButton31.setBounds(1060, 340, 40, 150);

        jLabel1.setText("do");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 560, 12, 14);

        jButton32.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jButton32);
        jButton32.setBounds(980, 340, 40, 150);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1090, 90, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/Sin título.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 70, 500, 270);

        jLabel7.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel7.setText("RE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(230, 610, 34, 20);

        jLabel3.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel3.setText("DO");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 610, 34, 22);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/Monlau-EstudiosPro-Castellano-ok.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 210, 60);

        jLabel9.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel9.setText("FA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(400, 610, 20, 20);

        jLabel10.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel10.setText("RE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 610, 34, 20);

        jLabel11.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel11.setText("MI");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 610, 30, 20);

        jLabel13.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel13.setText("FA");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(400, 610, 20, 20);

        jLabel14.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel14.setText("SOL");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(470, 610, 40, 20);

        jLabel15.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel15.setText("LA");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 610, 20, 22);

        jLabel16.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel16.setText("SI");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(630, 610, 40, 20);

        jLabel17.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel17.setText("DO");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(710, 610, 40, 20);

        jLabel18.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel18.setText("RE");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(780, 610, 30, 20);

        jLabel19.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel19.setText("MI");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(860, 610, 30, 20);

        jLabel20.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel20.setText("FA");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(940, 610, 30, 30);

        jLabel21.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel21.setText("SOL");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(1020, 610, 30, 30);

        jLabel22.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel22.setText("LA");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(1100, 610, 30, 30);

        jLabel23.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel23.setText("SI");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(1180, 610, 40, 30);

        jButton33.setBackground(new java.awt.Color(255, 255, 255));
        jButton33.setText("About me");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton33);
        jButton33.setBounds(1110, 110, 80, 30);

        jButtonMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/mute.PNG"))); // NOI18N
        getContentPane().add(jButtonMute);
        jButtonMute.setBounds(520, 650, 50, 40);

        jButtonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/up.PNG"))); // NOI18N
        getContentPane().add(jButtonUp);
        jButtonUp.setBounds(610, 650, 50, 40);

        jButtonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/DOssWN.PNG"))); // NOI18N
        getContentPane().add(jButtonDown);
        jButtonDown.setBounds(710, 650, 50, 40);

        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/reset.png"))); // NOI18N
        getContentPane().add(jButtonReset);
        jButtonReset.setBounds(410, 650, 50, 40);

        jButtonRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/record.png"))); // NOI18N
        getContentPane().add(jButtonRecord);
        jButtonRecord.setBounds(320, 650, 50, 40);

        jButtonRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/alante.png"))); // NOI18N
        getContentPane().add(jButtonRight);
        jButtonRight.setBounds(1180, 650, 50, 40);

        jButtonResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/sigue.png"))); // NOI18N
        jButtonResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResumeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonResume);
        jButtonResume.setBounds(1090, 650, 50, 40);

        jButtonLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/atras.png"))); // NOI18N
        getContentPane().add(jButtonLeft);
        jButtonLeft.setBounds(920, 650, 50, 40);

        jButtonPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/pause.png"))); // NOI18N
        jButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPause);
        jButtonPause.setBounds(1010, 650, 50, 40);

        jComboBoxList.setBackground(new java.awt.Color(153, 153, 153));
        jComboBoxList.setEditable(true);
        jComboBoxList.setForeground(new java.awt.Color(204, 255, 255));
        jComboBoxList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Song 1", "Song 2", "Song 3", "Song 4" }));
        getContentPane().add(jComboBoxList);
        jComboBoxList.setBounds(90, 660, 80, 30);

        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/saveeee.png"))); // NOI18N
        getContentPane().add(jButtonSave);
        jButtonSave.setBounds(190, 650, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piano/simple_1440-1024x640.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-170, -30, 1540, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
      About fra=new About();
      fra.setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void Bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt00ActionPerformed
       //codigo de los buttons
       JButton jbt= (JButton)evt.getSource();
       System.out.println(jbt.getName());
      //JOptionPane.showMessageDialog ( null,jbt.getName(), "Numeros", JOptionPane.INFORMATION_MESSAGE);
       
       //detectar la nota
      
       int numberKey = Integer.parseInt(jbt.getName());
       
       
        try {
            sound(arrayNotes[numberKey]);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt00ActionPerformed

    private void jButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPauseActionPerformed
        pause();
    }//GEN-LAST:event_jButtonPauseActionPerformed

    private void jButtonResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResumeActionPerformed
       
       audioClip2.play();
    }//GEN-LAST:event_jButtonResumeActionPerformed

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
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bb00;
    private javax.swing.JButton Bb01;
    private javax.swing.JButton Bb02;
    private javax.swing.JButton Bb03;
    private javax.swing.JButton Bb04;
    private javax.swing.JButton Bb05;
    private javax.swing.JButton Bb06;
    private javax.swing.JButton Bb07;
    private javax.swing.JButton Bb08;
    private javax.swing.JButton Bb09;
    private javax.swing.JButton Bt00;
    private javax.swing.JButton Bt01;
    private javax.swing.JButton Bt02;
    private javax.swing.JButton Bt03;
    private javax.swing.JButton Bt04;
    private javax.swing.JButton Bt05;
    private javax.swing.JButton Bt06;
    private javax.swing.JButton Bt07;
    private javax.swing.JButton Bt08;
    private javax.swing.JButton Bt09;
    private javax.swing.JButton Bt10;
    private javax.swing.JButton Bt11;
    private javax.swing.JButton Bt12;
    private javax.swing.JButton Bt13;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButtonDown;
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonMute;
    private javax.swing.JButton jButtonPause;
    private javax.swing.JButton jButtonRecord;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonResume;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JComboBox<String> jComboBoxList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    
}
