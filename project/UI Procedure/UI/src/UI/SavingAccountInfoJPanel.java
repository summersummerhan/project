/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import MODEL.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author 加藤鹰
 */
public class SavingAccountInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SavingAccountInfoJPanel
     */
    Person person;
    public SavingAccountInfoJPanel(Person person) {
        initComponents();
         this.person=person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        savinginformationjLabel = new javax.swing.JLabel();
        banknamejLabel2 = new javax.swing.JLabel();
        bankroutingnumberjLabel3 = new javax.swing.JLabel();
        bankaccountnumberjLabel4 = new javax.swing.JLabel();
        accountbalancejLabel5 = new javax.swing.JLabel();
        accounttypejLabel6 = new javax.swing.JLabel();
        banknamejTextField4 = new javax.swing.JTextField();
        BankRoutingNumberjTextField3 = new javax.swing.JTextField();
        BankAccountNumberjTextField4 = new javax.swing.JTextField();
        AccountBalancejTextField7 = new javax.swing.JTextField();
        AccountTypejTextField6 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        savinginformationjLabel.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        savinginformationjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savinginformationjLabel.setText("Saving account information");
        savinginformationjLabel.setToolTipText("");

        banknamejLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        banknamejLabel2.setText("BankName");

        bankroutingnumberjLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankroutingnumberjLabel3.setText("BankRoutingNumber");

        bankaccountnumberjLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankaccountnumberjLabel4.setText("BankAccountNumber");

        accountbalancejLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        accountbalancejLabel5.setText("AccountBalance");

        accounttypejLabel6.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        accounttypejLabel6.setText("AccountType");

        AccountBalancejTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountBalancejTextField7ActionPerformed(evt);
            }
        });

        btnSave.setText("create");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savinginformationjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bankroutingnumberjLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(banknamejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankaccountnumberjLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accountbalancejLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accounttypejLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BankAccountNumberjTextField4)
                            .addComponent(BankRoutingNumberjTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(banknamejTextField4))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AccountBalancejTextField7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AccountTypejTextField6)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(savinginformationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banknamejLabel2)
                    .addComponent(banknamejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankroutingnumberjLabel3)
                    .addComponent(BankRoutingNumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankaccountnumberjLabel4)
                    .addComponent(BankAccountNumberjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountbalancejLabel5)
                    .addComponent(AccountBalancejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accounttypejLabel6)
                    .addComponent(AccountTypejTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSave)
                .addGap(0, 49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        person.setSavingAccountBankName(banknamejTextField4.getText());
        person.setSavingAccountBankRoutingNumber(BankRoutingNumberjTextField3.getText());
        person.setSavingAccountbankAccountNumber(BankAccountNumberjTextField4.getText());
        person.setSavingAccountAccountBalance(AccountBalancejTextField7.getText());
        person.setAccountType(AccountTypejTextField6.getText());
        JOptionPane.showMessageDialog(this, "person information saved");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void AccountBalancejTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountBalancejTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountBalancejTextField7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountBalancejTextField7;
    private javax.swing.JTextField AccountTypejTextField6;
    private javax.swing.JTextField BankAccountNumberjTextField4;
    private javax.swing.JTextField BankRoutingNumberjTextField3;
    private javax.swing.JLabel accountbalancejLabel5;
    private javax.swing.JLabel accounttypejLabel6;
    private javax.swing.JLabel bankaccountnumberjLabel4;
    private javax.swing.JLabel banknamejLabel2;
    private javax.swing.JTextField banknamejTextField4;
    private javax.swing.JLabel bankroutingnumberjLabel3;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel savinginformationjLabel;
    // End of variables declaration//GEN-END:variables
}