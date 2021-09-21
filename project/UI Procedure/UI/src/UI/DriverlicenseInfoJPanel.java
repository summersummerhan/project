/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import MODEL.Person;
import javax.swing.JOptionPane;
import java.awt.Image;

/**
 *
 * @author 加藤鹰
 */
public class DriverlicenseInfoJPanel extends javax.swing.JPanel {
 Person person;
    /**
     * Creates new form DriverlicenseInfoJPanel
     */
    public DriverlicenseInfoJPanel(Person person) {
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

        bankroutingnumberjLabel3 = new javax.swing.JLabel();
        savinginformationjLabel = new javax.swing.JLabel();
        banknamejLabel2 = new javax.swing.JLabel();
        bankaccountnumberjLabel4 = new javax.swing.JLabel();
        accountbalancejLabel5 = new javax.swing.JLabel();
        AccountBalancejTextField7 = new javax.swing.JTextField();
        BankAccountNumberjTextField4 = new javax.swing.JTextField();
        BankRoutingNumberjTextField3 = new javax.swing.JTextField();
        banknamejTextField4 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        bankroutingnumberjLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankroutingnumberjLabel3.setText("IssuedDate");

        savinginformationjLabel.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        savinginformationjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savinginformationjLabel.setText("Driver license information");
        savinginformationjLabel.setToolTipText("");

        banknamejLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        banknamejLabel2.setText("LicenseNumber");

        bankaccountnumberjLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankaccountnumberjLabel4.setText("DateOfExpiration");

        accountbalancejLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        accountbalancejLabel5.setText("BloodType");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/driver li.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(savinginformationjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bankaccountnumberjLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(accountbalancejLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(banknamejLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankroutingnumberjLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(0, 349, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BankAccountNumberjTextField4)
                            .addComponent(BankRoutingNumberjTextField3)
                            .addComponent(banknamejTextField4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AccountBalancejTextField7)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(202, 202, 202)
                .addComponent(btnSave)
                .addGap(0, 110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 
    
    
    
    private void AccountBalancejTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountBalancejTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountBalancejTextField7ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        person.setLicenseNumber(banknamejTextField4.getText());
        person.setIssuedDate(BankRoutingNumberjTextField3.getText());
        person.setDateOfExpiration(BankAccountNumberjTextField4.getText());
        person.setBloodType(AccountBalancejTextField7.getText());
        JOptionPane.showMessageDialog(this, "person information saved");

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountBalancejTextField7;
    private javax.swing.JTextField BankAccountNumberjTextField4;
    private javax.swing.JTextField BankRoutingNumberjTextField3;
    private javax.swing.JLabel accountbalancejLabel5;
    private javax.swing.JLabel bankaccountnumberjLabel4;
    private javax.swing.JLabel banknamejLabel2;
    private javax.swing.JTextField banknamejTextField4;
    private javax.swing.JLabel bankroutingnumberjLabel3;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel savinginformationjLabel;
    // End of variables declaration//GEN-END:variables
}