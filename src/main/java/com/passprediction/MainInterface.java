/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.passprediction;

import static com.passprediction.MainInterface.PopulateData;
import static com.passprediction.MainInterface.SplitDataSet;
import static com.passprediction.MainInterface.PopulateData;
import static com.passprediction.MainInterface.SplitDataSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Arrays;


public class MainInterface extends javax.swing.JFrame {

    private static Perceptron perceptron;
    private static List<Row> trainSet;
    private static List<Row> testSet;

    public MainInterface() {
        initComponents();
        initializeData();
    }
    
          private static void initializeData() {
        int numberOfSubjects = 3;
        perceptron = new Perceptron(numberOfSubjects + 1);
        ArrayList<Row> rows = new ArrayList<>();
        int sampleSize = 20000;
        int passGrade = 60;
        float trainTestSplit = 0.8f;
        
        PopulateData(rows, sampleSize, numberOfSubjects);
        Collections.shuffle(rows);
        
        List<List<Row>> sets = SplitDataSet(rows, trainTestSplit);
        trainSet = sets.get(0);
        testSet = sets.get(1);
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
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lrlabel = new javax.swing.JLabel();
        lrtext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        noelabel1 = new javax.swing.JLabel();
        noelabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        noetext = new javax.swing.JTextField();
        jpanel3 = new javax.swing.JPanel();
        fmlabel = new javax.swing.JLabel();
        smlabel = new javax.swing.JLabel();
        tmlabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        fmtext = new javax.swing.JTextField();
        smtext = new javax.swing.JTextField();
        tmtext = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        learn = new javax.swing.JButton();
        test = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        result = new javax.swing.JLabel();
        passfail = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(204, 255, 255));
        title.setText("Pass/Fail Prediction");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 70));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lrlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lrlabel.setForeground(new java.awt.Color(204, 255, 255));
        lrlabel.setText("Learning Rate");
        jPanel2.add(lrlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 110, 50));

        lrtext.setBackground(new java.awt.Color(0, 51, 51));
        lrtext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lrtext.setForeground(new java.awt.Color(255, 255, 255));
        lrtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lrtext.setBorder(null);
        lrtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lrtextActionPerformed(evt);
            }
        });
        jPanel2.add(lrtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 10));

        noelabel1.setBackground(new java.awt.Color(0, 51, 51));
        noelabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        noelabel1.setForeground(new java.awt.Color(204, 255, 255));
        noelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noelabel1.setText("Number Of");
        jPanel2.add(noelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 130, 40));

        noelabel2.setBackground(new java.awt.Color(0, 51, 51));
        noelabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        noelabel2.setForeground(new java.awt.Color(204, 255, 255));
        noelabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noelabel2.setText("Epoches");
        jPanel2.add(noelabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 170, 30));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 20));

        noetext.setBackground(new java.awt.Color(0, 51, 51));
        noetext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        noetext.setForeground(new java.awt.Color(255, 255, 255));
        noetext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        noetext.setBorder(null);
        noetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noetextActionPerformed(evt);
            }
        });
        jPanel2.add(noetext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 170, 270));

        jpanel3.setBackground(new java.awt.Color(0, 51, 51));
        jpanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 3, true));
        jpanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fmlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        fmlabel.setForeground(new java.awt.Color(204, 255, 255));
        fmlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fmlabel.setText("First Mark");
        jpanel3.add(fmlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 20));

        smlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        smlabel.setForeground(new java.awt.Color(204, 255, 255));
        smlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        smlabel.setText("Second Mark");
        jpanel3.add(smlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, 20));

        tmlabel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tmlabel.setForeground(new java.awt.Color(204, 255, 255));
        tmlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tmlabel.setText("Third Mark");
        jpanel3.add(tmlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 170, 20));
        jpanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 150, 10));
        jpanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 20));
        jpanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 10));

        fmtext.setBackground(new java.awt.Color(0, 51, 51));
        fmtext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        fmtext.setForeground(new java.awt.Color(255, 255, 255));
        fmtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fmtext.setBorder(null);
        fmtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmtextActionPerformed(evt);
            }
        });
        jpanel3.add(fmtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 30));

        smtext.setBackground(new java.awt.Color(0, 51, 51));
        smtext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        smtext.setForeground(new java.awt.Color(255, 255, 255));
        smtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        smtext.setBorder(null);
        smtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smtextActionPerformed(evt);
            }
        });
        jpanel3.add(smtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        tmtext.setBackground(new java.awt.Color(0, 51, 51));
        tmtext.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        tmtext.setForeground(new java.awt.Color(255, 255, 255));
        tmtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tmtext.setBorder(null);
        tmtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmtextActionPerformed(evt);
            }
        });
        jpanel3.add(tmtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 30));

        jPanel1.add(jpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, 300));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 3, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        learn.setBackground(new java.awt.Color(204, 255, 255));
        learn.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        learn.setForeground(new java.awt.Color(0, 102, 102));
        learn.setText("Learn");
        learn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnActionPerformed(evt);
            }
        });
        jPanel3.add(learn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 40));

        test.setBackground(new java.awt.Color(204, 255, 255));
        test.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        test.setForeground(new java.awt.Color(0, 102, 102));
        test.setText("Test");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        jPanel3.add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 40));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 10));

        result.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        result.setForeground(new java.awt.Color(204, 255, 255));
        result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result.setText("Prediction:");
        jPanel3.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 50));

        passfail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        passfail.setForeground(new java.awt.Color(255, 255, 255));
        passfail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(passfail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 170, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lrtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lrtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lrtextActionPerformed

    private void noetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noetextActionPerformed

    private void fmtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmtextActionPerformed

    private void smtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_smtextActionPerformed

    private void tmtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmtextActionPerformed

    private void learnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnActionPerformed
        try {
            double learningRate = Double.parseDouble(lrtext.getText());
            int numberOfEpochs = Integer.parseInt(noetext.getText());
            int passGrade = 60;

            for (int i = 0; i < numberOfEpochs; i++) {
                double error = 0;
                for (Row row : trainSet) {
                    float[] marks = row.normalizeMarks(passGrade);
                    perceptron.calculateOutput(marks);
                    perceptron.calculateError(row.pass ? 1 : 0);
                    error += perceptron.error * perceptron.error;
                    perceptron.weightCorrection(learningRate, marks);
                }
            }

            passfail.setText("Learning Done.");
        } catch (NumberFormatException ex) {
            passfail.setText("Invalid input.");
        }

    }//GEN-LAST:event_learnActionPerformed

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
        try {
            int passGrade = 60;
            float mark1 = Float.parseFloat(fmtext.getText());
            float mark2 = Float.parseFloat(smtext.getText());
            float mark3 = Float.parseFloat(tmtext.getText());

            Row input = new Row();
            input.marks = new float[]{mark1, mark2, mark3, (mark1 + mark2 + mark3) / 3.0f};

            Arrays.sort(input.marks);

            float[] normalized = input.normalizeMarks(passGrade);
            perceptron.calculateOutput(normalized);

            passfail.setText(" " + (perceptron.output > 0.5 ? "Pass" : "Fail"));
        } catch (NumberFormatException ex) {
            passfail.setText("Invalid input.");
        }

    }//GEN-LAST:event_testActionPerformed

    
     public static List<List<Row>> SplitDataSet(ArrayList<Row> dataSet, float trainTestSplitSize) {
        int skipSize = (int)(dataSet.size() * trainTestSplitSize);
        
        List<Row> testSet = dataSet.stream().skip(skipSize).toList();
        List<Row> trainSet = dataSet.stream().limit(skipSize).toList();
        
        List<List<Row>> lists = new ArrayList<>();
        lists.add(trainSet);
        lists.add(testSet);
        
        return lists;
    }
     
    public static void PopulateData(ArrayList<Row> array, int size, int numberOfSubjects) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            Row row = new Row();
            row.marks = new float[numberOfSubjects + 1];
            row.pass = false;
            float avg = 0;
            boolean pass = true;
            for (int j = 0; j < numberOfSubjects; j++) {
                int num;
                if (pass) {
                    if (random.nextBoolean()) {
                        num = 59;
                    } else {
                        num = random.nextInt(60);
                    }
                } else {
                    num = random.nextInt(101);
                }
                    
                pass = false;
                row.marks[j] = num;
                avg += num;
            }
            row.marks[numberOfSubjects] = avg / numberOfSubjects;
            array.add(row);
        }
        for (int i = 0; i < size; i++) {
            Row row = new Row();
            row.marks = new float[numberOfSubjects + 1];
            row.pass = true;
            float avg = 0;
            for (int j = 0; j < numberOfSubjects; j++) {
                int num = random.nextInt(41) + 60;
                row.marks[j] = num;
                avg += num;
            }
            
            row.marks[numberOfSubjects] = avg / numberOfSubjects;
            array.add(row);
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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fmlabel;
    private javax.swing.JTextField fmtext;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel jpanel3;
    private javax.swing.JButton learn;
    private javax.swing.JLabel lrlabel;
    private javax.swing.JTextField lrtext;
    private javax.swing.JLabel noelabel1;
    private javax.swing.JLabel noelabel2;
    private javax.swing.JTextField noetext;
    private javax.swing.JLabel passfail;
    private javax.swing.JLabel result;
    private javax.swing.JLabel smlabel;
    private javax.swing.JTextField smtext;
    private javax.swing.JButton test;
    private javax.swing.JLabel title;
    private javax.swing.JLabel tmlabel;
    private javax.swing.JTextField tmtext;
    // End of variables declaration//GEN-END:variables
}
