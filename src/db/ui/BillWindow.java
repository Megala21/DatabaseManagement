/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db.ui;

/**
 *
 * @author DELL
 */
public class BillWindow extends javax.swing.JFrame {

    /**
     * Creates new form BillWindow
     */
    public BillWindow() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        billsTab = new javax.swing.JTabbedPane();
        addBillsTab = new javax.swing.JPanel();
        tourCodeLabel = new javax.swing.JLabel();
        referenceNoLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        townIDTextField = new javax.swing.JTextField();
        numberOfIndvidualsTextField = new javax.swing.JTextField();
        amountTextField = new javax.swing.JTextField();
        hotelIDLabel = new javax.swing.JLabel();
        billDateLabel = new javax.swing.JLabel();
        numberOfIndvidualsLabel = new javax.swing.JLabel();
        tourCodeTextField = new javax.swing.JTextField();
        hotelIDtextField = new javax.swing.JTextField();
        townIDLabel = new javax.swing.JLabel();
        billDateTextField = new javax.swing.JTextField();
        referenceNoTextField = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        editBillsTab = new javax.swing.JPanel();
        deleteBillsTab = new javax.swing.JPanel();
        deleteReferenceLabel = new javax.swing.JLabel();
        deleteReferenceTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        viewBillsTab = new javax.swing.JPanel();
        viewReferenceLabel = new javax.swing.JLabel();
        editReferenceTextField = new javax.swing.JTextField();
        viewButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addBillsTab.setLayout(null);

        tourCodeLabel.setText("Tour Code");
        addBillsTab.add(tourCodeLabel);
        tourCodeLabel.setBounds(360, 30, 101, 30);

        referenceNoLabel.setText("Reference No");
        addBillsTab.add(referenceNoLabel);
        referenceNoLabel.setBounds(30, 30, 101, 25);

        amountLabel.setText("Amount");
        addBillsTab.add(amountLabel);
        amountLabel.setBounds(30, 180, 101, 38);

        townIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                townIDTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(townIDTextField);
        townIDTextField.setBounds(190, 80, 124, 28);

        numberOfIndvidualsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfIndvidualsTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(numberOfIndvidualsTextField);
        numberOfIndvidualsTextField.setBounds(490, 130, 124, 33);

        amountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(amountTextField);
        amountTextField.setBounds(190, 180, 124, 33);

        hotelIDLabel.setText("Hotel ID");
        addBillsTab.add(hotelIDLabel);
        hotelIDLabel.setBounds(360, 80, 101, 30);

        billDateLabel.setText("Bill date");
        addBillsTab.add(billDateLabel);
        billDateLabel.setBounds(30, 130, 101, 30);

        numberOfIndvidualsLabel.setText("Number of Individuals");
        addBillsTab.add(numberOfIndvidualsLabel);
        numberOfIndvidualsLabel.setBounds(360, 140, 110, 14);

        tourCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tourCodeTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(tourCodeTextField);
        tourCodeTextField.setBounds(490, 30, 124, 28);

        hotelIDtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotelIDtextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(hotelIDtextField);
        hotelIDtextField.setBounds(490, 80, 124, 28);

        townIDLabel.setText("Town ID");
        addBillsTab.add(townIDLabel);
        townIDLabel.setBounds(30, 80, 101, 25);

        billDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billDateTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(billDateTextField);
        billDateTextField.setBounds(190, 130, 124, 28);

        referenceNoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenceNoTextFieldActionPerformed(evt);
            }
        });
        addBillsTab.add(referenceNoTextField);
        referenceNoTextField.setBounds(190, 30, 124, 28);

        exitButton.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        exitButton.setText("EXIT");
        addBillsTab.add(exitButton);
        exitButton.setBounds(450, 260, 160, 70);

        addButton.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        addButton.setText("ADD");
        addBillsTab.add(addButton);
        addButton.setBounds(40, 260, 160, 70);

        clearButton.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        clearButton.setText("CLEAR");
        addBillsTab.add(clearButton);
        clearButton.setBounds(240, 260, 160, 70);

        billsTab.addTab("ADD", addBillsTab);

        javax.swing.GroupLayout editBillsTabLayout = new javax.swing.GroupLayout(editBillsTab);
        editBillsTab.setLayout(editBillsTabLayout);
        editBillsTabLayout.setHorizontalGroup(
            editBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 651, Short.MAX_VALUE)
        );
        editBillsTabLayout.setVerticalGroup(
            editBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        billsTab.addTab("EDIT", editBillsTab);

        deleteReferenceLabel.setText("Reference No");

        deleteReferenceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteReferenceTextFieldActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");

        javax.swing.GroupLayout deleteBillsTabLayout = new javax.swing.GroupLayout(deleteBillsTab);
        deleteBillsTab.setLayout(deleteBillsTabLayout);
        deleteBillsTabLayout.setHorizontalGroup(
            deleteBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBillsTabLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(deleteReferenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(deleteReferenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(59, 59, 59))
        );
        deleteBillsTabLayout.setVerticalGroup(
            deleteBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBillsTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(deleteBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteReferenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteReferenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        billsTab.addTab("DELETE", deleteBillsTab);

        viewReferenceLabel.setText("Reference No");

        viewButton.setText("View");

        javax.swing.GroupLayout viewBillsTabLayout = new javax.swing.GroupLayout(viewBillsTab);
        viewBillsTab.setLayout(viewBillsTabLayout);
        viewBillsTabLayout.setHorizontalGroup(
            viewBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBillsTabLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(viewReferenceLabel)
                .addGap(101, 101, 101)
                .addComponent(editReferenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(viewButton)
                .addGap(61, 61, 61))
        );
        viewBillsTabLayout.setVerticalGroup(
            viewBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBillsTabLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(viewBillsTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewReferenceLabel)
                    .addComponent(editReferenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton))
                .addContainerGap(341, Short.MAX_VALUE))
        );

        billsTab.addTab("VIEW", viewBillsTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billsTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billsTab)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldActionPerformed

    private void townIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_townIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_townIDTextFieldActionPerformed

    private void tourCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tourCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tourCodeTextFieldActionPerformed

    private void hotelIDtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotelIDtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hotelIDtextFieldActionPerformed

    private void numberOfIndvidualsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfIndvidualsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfIndvidualsTextFieldActionPerformed

    private void billDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billDateTextFieldActionPerformed

    private void referenceNoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenceNoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenceNoTextFieldActionPerformed

    private void deleteReferenceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReferenceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteReferenceTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(BillWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addBillsTab;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JLabel billDateLabel;
    private javax.swing.JTextField billDateTextField;
    private javax.swing.JTabbedPane billsTab;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel deleteBillsTab;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deleteReferenceLabel;
    private javax.swing.JTextField deleteReferenceTextField;
    private javax.swing.JPanel editBillsTab;
    private javax.swing.JTextField editReferenceTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel hotelIDLabel;
    private javax.swing.JTextField hotelIDtextField;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel numberOfIndvidualsLabel;
    private javax.swing.JTextField numberOfIndvidualsTextField;
    private javax.swing.JLabel referenceNoLabel;
    private javax.swing.JTextField referenceNoTextField;
    private javax.swing.JLabel tourCodeLabel;
    private javax.swing.JTextField tourCodeTextField;
    private javax.swing.JLabel townIDLabel;
    private javax.swing.JTextField townIDTextField;
    private javax.swing.JPanel viewBillsTab;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel viewReferenceLabel;
    // End of variables declaration//GEN-END:variables
}
