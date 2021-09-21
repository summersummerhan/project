/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Status;
import Business.WorkQueue.StoreRegisterRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tzm
 */
public class RgtSJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RgtSJPanel
     */
    private EcoSystem system;
    private JPanel loginJPanel;

 

    /**
     * Creates new form LoginJPanel
     */
    public RgtSJPanel(EcoSystem system, JPanel loginJPanel) {
        initComponents();
        this.system = system;
        this.loginJPanel = loginJPanel;
       
        this.setSize(300, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        storePhoneTextField = new javax.swing.JTextField();
        storeNamejLabel = new javax.swing.JLabel();
        storeNameTextField = new javax.swing.JTextField();
        addressjLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();

        registerJButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        registerJButton.setText("Register");
        registerJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("StorePhoneNumber:");

        storePhoneTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        storeNamejLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        storeNamejLabel.setText("StoreName:");

        storeNameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        addressjLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        addressjLabel.setText("Address: ");

        addressTextArea.setColumns(20);
        jScrollPane4.setViewportView(addressTextArea);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("AdminUserName:");

        userNameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Password:");

        backJButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backJButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        passwordJPasswordField.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storePhoneTextField)
                            .addComponent(addressjLabel)
                            .addComponent(jLabel2)
                            .addComponent(storeNamejLabel)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(storeNameTextField)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(userNameTextField)
                            .addComponent(passwordJPasswordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(registerJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storePhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerJButton)
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerJButtonActionPerformed
        String storeName = storeNameTextField.getText();
        String address = addressTextArea.getText();
        String phone = storePhoneTextField.getText();
        String userName = userNameTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());

        if (storeName.trim().equals("") || address.trim().equals("") || phone.trim().equals("") || userName.trim().equals("") || password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Input cannot be empty!");
            return;
        }
         try{
          long l= Long.parseLong(phone);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Incorrect phone number input format!");
            return;
        }
        Boolean used = false;

        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (userName.equals(ua.getUsername())) {

                used = true;
                break;
            }

        }

        if (used == false) {
            Label1:
            for (Enterprise en : system.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization org : en.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                        if (userName.equals(ua.getUsername())) {

                            used = true;
                            break Label1;

                        }

                    }
                }

            }
        }
        if (used == true) {

            JOptionPane.showMessageDialog(this, "UserName has been used", "Warning", JOptionPane.WARNING_MESSAGE);
            return;

        }
        StoreRegisterRequest srr = new StoreRegisterRequest();
        srr.setStoreName(storeName);
        srr.setAddress(address);
        srr.setPhoneNumber(phone);
        srr.setUserName(userName);
        srr.setPassword(password);
        srr.setRequestDate(new Date());
        srr.setStatus(Status.Waiting);

        system.getWorkQueue().getWorkRequestList().add(srr);
        JOptionPane.showMessageDialog(this, "Your registation has been sent, please wait for approval!", "Information", JOptionPane.DEFAULT_OPTION);
        storeNameTextField.setText("");
        addressTextArea.setText("");
        storePhoneTextField.setText("");
        userNameTextField.setText("");
        passwordJPasswordField.setText("");
        DB4OUtil.getInstance().storeSystem(system);

    }//GEN-LAST:event_registerJButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        loginJPanel.remove(this);
        CardLayout layout = (CardLayout) loginJPanel.getLayout();
        layout.previous(loginJPanel);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JLabel addressjLabel;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton registerJButton;
    private javax.swing.JTextField storeNameTextField;
    private javax.swing.JLabel storeNamejLabel;
    private javax.swing.JTextField storePhoneTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
