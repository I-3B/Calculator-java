/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISlam
 */
import java.io.File;
import java.net.*;
import java.awt.Desktop;
public class calculator extends javax.swing.JFrame {

    double firstNum,secondNum,result;
    String operations;
    boolean isThereFullNum=false,isThereNumber,isThereprevious,isThereOperation,isThereLeftZero,isTherePoint=false,afterEquation=false/*for pressing zero after equation*/;
    public calculator() {
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

        txtDisplay = new javax.swing.JTextField();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        erase = new javax.swing.JButton();
        point = new javax.swing.JButton();
        eraseAll = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        about = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(51, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 51, 51));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("icon.png")).getImage());
        setName("main"); // NOI18N
        setResizable(false);

        txtDisplay.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtDisplay.setFocusable(false);
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(255, 255, 255));
        seven.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(51, 51, 51));
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(255, 255, 255));
        eight.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(51, 51, 51));
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(255, 255, 255));
        nine.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(51, 51, 51));
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        minus.setBackground(new java.awt.Color(255, 255, 255));
        minus.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(51, 51, 51));
        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(255, 255, 255));
        multiply.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        multiply.setForeground(new java.awt.Color(51, 51, 51));
        multiply.setText("×");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(255, 255, 255));
        four.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        four.setForeground(new java.awt.Color(51, 51, 51));
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(255, 255, 255));
        five.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        five.setForeground(new java.awt.Color(51, 51, 51));
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(255, 255, 255));
        six.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        six.setForeground(new java.awt.Color(51, 51, 51));
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(255, 255, 255));
        one.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        one.setForeground(new java.awt.Color(51, 51, 51));
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(255, 255, 255));
        two.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        two.setForeground(new java.awt.Color(51, 51, 51));
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(255, 255, 255));
        three.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        three.setForeground(new java.awt.Color(51, 51, 51));
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 255, 255));
        divide.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(51, 51, 51));
        divide.setText("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(255, 255, 255));
        plus.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(51, 51, 51));
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        zero.setBackground(new java.awt.Color(255, 255, 255));
        zero.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(51, 51, 51));
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(255, 255, 255));
        equal.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(51, 51, 51));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        erase.setBackground(new java.awt.Color(255, 255, 255));
        erase.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        erase.setForeground(new java.awt.Color(51, 51, 51));
        erase.setText("CE");
        erase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseActionPerformed(evt);
            }
        });

        point.setBackground(new java.awt.Color(255, 255, 255));
        point.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        point.setForeground(new java.awt.Color(51, 51, 51));
        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        eraseAll.setBackground(new java.awt.Color(255, 255, 255));
        eraseAll.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        eraseAll.setForeground(new java.awt.Color(51, 51, 51));
        eraseAll.setText("C");
        eraseAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseAllActionPerformed(evt);
            }
        });

        about.setText("Menu");

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        about.add(Exit);

        menuBar.add(about);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eraseAll, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {divide, minus, multiply, plus});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eight, eraseAll, nine, seven});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {erase, six});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus)
                    .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(erase, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eraseAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {divide, minus, multiply, plus});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eight, eraseAll, nine, seven});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {erase, six});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+seven.getText();
        txtDisplay.setText(enterNumber);
        isThereprevious=false;
        isThereNumber=true;
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+eight.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
         if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+nine.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereFullNum=true;
    }//GEN-LAST:event_nineActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(!isThereOperation)
        {firstNum=Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="-";
        isThereFullNum=true;}
        isThereOperation=true;
        isTherePoint=false;
        
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        if(!isThereOperation)
        {firstNum=Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="*";
       isThereFullNum=true;}
        isThereOperation=true;
        isTherePoint=false;
    }//GEN-LAST:event_multiplyActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+four.getText();
        txtDisplay.setText(enterNumber);
        isThereprevious=false;
        isThereNumber=true;
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+five.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+six.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_sixActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+one.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
          if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText(""); 
        String enterNumber=txtDisplay.getText()+two.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(isThereLeftZero&&!isTherePoint)
        {
            txtDisplay.setText("");
            isThereLeftZero=false;
        }
        if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+three.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false;
         isThereNumber=true;
    }//GEN-LAST:event_threeActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if(!isThereOperation)
        {firstNum=Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="/";
       isThereFullNum=true;}
        isThereOperation=true;
        isTherePoint=false;
    }//GEN-LAST:event_divideActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        if(!isThereOperation)
        {firstNum=Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="+";
        isThereFullNum=true;}
        isThereOperation=true;
        isTherePoint=false;
        
    }//GEN-LAST:event_plusActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(afterEquation||txtDisplay.getText().isEmpty()||Double.parseDouble(txtDisplay.getText())>0||isTherePoint)
        {   
            if(txtDisplay.getText().isEmpty())
                isThereLeftZero=true;
            if (isThereprevious)
            txtDisplay.setText("");
        String enterNumber=txtDisplay.getText()+zero.getText();
        txtDisplay.setText(enterNumber);
         isThereprevious=false; 
         afterEquation=false;
         
        }
        
    }//GEN-LAST:event_zeroActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
       if(isThereFullNum==true)
       {secondNum=Double.parseDouble(txtDisplay.getText());
        if (operations=="+")
            result=firstNum+secondNum;
        else if (operations=="-")
            result=firstNum-secondNum;
        else if (operations=="*")
            result=firstNum*secondNum;
        else if(operations=="/")
            result=firstNum/secondNum;
        if((int)result==result)
            txtDisplay.setText((int)result+" ");
        else
            txtDisplay.setText(result+" ");
        isThereNumber=false;
        isThereprevious=true;
        isThereOperation=false;
        isTherePoint=false;
        afterEquation=true;
        isThereFullNum=false;
        isThereLeftZero=false;
        firstNum=0;
        secondNum=0;
        operations="";
       }
    }//GEN-LAST:event_equalActionPerformed

    private void eraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseActionPerformed
      secondNum=0;
       txtDisplay.setText("");
       isTherePoint=false;
    }//GEN-LAST:event_eraseActionPerformed
    
     
    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        if(!txtDisplay.getText().isEmpty()&&!isTherePoint&&(isThereLeftZero||isThereNumber)){
        String enterNumber=txtDisplay.getText()+point.getText();
        txtDisplay.setText(enterNumber);
        isTherePoint=true;}
    }//GEN-LAST:event_pointActionPerformed

    private void eraseAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseAllActionPerformed
        firstNum=0;
        secondNum=0;
        operations="";
        txtDisplay.setText("");
        isTherePoint=false;
        
    }//GEN-LAST:event_eraseAllActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
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
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu about;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton erase;
    private javax.swing.JButton eraseAll;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
