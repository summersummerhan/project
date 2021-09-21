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
       
public class CheckingAccountInfoJPanel extends javax.swing.JPanel {
Person person;
    /**
     * Creates new form CheckingAccountInfoJPanel
     */
    public CheckingAccountInfoJPanel(Person person) {
        
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
        checkAccountBalancejTextField7 = new javax.swing.JTextField();
        checkBankAccountNumberjTextField4 = new javax.swing.JTextField();
        checkBankRoutingNumberjTextField3 = new javax.swing.JTextField();
        checkbanknamejTextField4 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(400, 345));
        setVerifyInputWhenFocusTarget(false);

        savinginformationjLabel.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        savinginformationjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        savinginformationjLabel.setText("Checking account information");
        savinginformationjLabel.setToolTipText("");

        banknamejLabel2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        banknamejLabel2.setText("BankName");

        bankroutingnumberjLabel3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankroutingnumberjLabel3.setText("BankRoutingNumber");

        bankaccountnumberjLabel4.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        bankaccountnumberjLabel4.setText("BankAccountNumber");

        accountbalancejLabel5.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        accountbalancejLabel5.setText("AccountBalance");

        checkAccountBalancejTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAccountBalancejTextField7ActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBankAccountNumberjTextField4)
                            .addComponent(checkBankRoutingNumberjTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(checkbanknamejTextField4))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(checkAccountBalancejTextField7)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(savinginformationjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banknamejLabel2)
                    .addComponent(checkbanknamejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankroutingnumberjLabel3)
                    .addComponent(checkBankRoutingNumberjTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankaccountnumberjLabel4)
                    .addComponent(checkBankAccountNumberjTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(accountbalancejLabel5)
                    .addComponent(checkAccountBalancejTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(btnSave)
                .addGap(0, 15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkAccountBalancejTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAccountBalancejTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAccountBalancejTextField7ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        person.setCheckingAccounBankName(checkbanknamejTextField4.getText());
        person.setCheckingAccounBankRoutingNumber(checkBankRoutingNumberjTextField3.getText());
        person.setCheckingAccounbankAccountNumber(checkBankAccountNumberjTextField4.getText());
        person.setCheckingAccounaccountBalance(checkAccountBalancejTextField7.getText());
        JOptionPane.showMessageDialog(this, "person information saved");

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountbalancejLabel5;
    private javax.swing.JLabel bankaccountnumberjLabel4;
    private javax.swing.JLabel banknamejLabel2;
    private javax.swing.JLabel bankroutingnumberjLabel3;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField checkAccountBalancejTextField7;
    private javax.swing.JTextField checkBankAccountNumberjTextField4;
    private javax.swing.JTextField checkBankRoutingNumberjTextField3;
    private javax.swing.JTextField checkbanknamejTextField4;
    private javax.swing.JLabel savinginformationjLabel;
    // End of variables declaration//GEN-END:variables
}