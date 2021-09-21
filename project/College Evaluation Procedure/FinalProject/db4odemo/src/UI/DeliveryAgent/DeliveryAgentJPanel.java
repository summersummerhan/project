/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgent;

import Business.Business.EcoSystem;

import Business.DB4OUtil.DB4OUtil;
import Business.Employee.Employee;

import Business.Enterprise.DeliveryAgent;
import Business.Enterprise.Enterprise;

import Business.Organization.DeliveryManOrganization;
import Business.Organization.DistributionCentersOrganization;
import Business.Organization.DriverOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Enterprise.Store;
import Business.WorkQueue.Commodity;
import Business.WorkQueue.ShippingOrder;

/**
 *
 * @author 加藤鹰
 */
public class DeliveryAgentJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    private JFrame frame;
    private Organization organization;
    private Store store;
    private Role role;
    private Enterprise enterprise;
    private DeliveryAgent deliveryAgent;

    /**
     * Creates new form DeliveryAgentJPanel
     */
    public DeliveryAgentJPanel() {
        initComponents();
    }

    public DeliveryAgentJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount account, JFrame frame, Organization organization, Enterprise enterprise) {
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.account = account;
        this.frame = frame;
        this.organization = organization;
        this.enterprise = enterprise;
        deliveryAgent = (DeliveryAgent) enterprise;
        initComponents();
        this.setSize(900, 640);

        populateDeliveryCenterTable();
        populateDeliveryMan();
        populateDriver();
        populateReviewTable();
        editButton.setEnabled(true);
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        setOverviewFieldsEditable(false);
        setOverviewInfo();
    }

    public void populateDeliveryCenterTable() {
        DefaultTableModel dtm = (DefaultTableModel) DeliveryCenterTable.getModel();
        dtm.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DistributionCentersOrganization) {
                DistributionCentersOrganization dco = (DistributionCentersOrganization) org;
                Object[] row = new Object[3];
                row[0] = org;
                row[1] = dco.getAddress();
                row[2] = dco.getPhoneNumber();
                dtm.addRow(row);

            }

        }

    }

    public void populateDeliveryMan() {
        DefaultTableModel dtm = (DefaultTableModel) ManageDeliveryManTable1.getModel();
        dtm.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DeliveryManOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    Employee e = (Employee) ua.getPerson();
                    Object[] row = new Object[3];
                    row[0] = ua;
                    row[1] = e;
                    row[2] = e.getPhone();
                    dtm.addRow(row);
                }
                break;
            }

        }
    }

    public void populateDriver() {
        DefaultTableModel dtm = (DefaultTableModel) ManageDriverTable.getModel();
        dtm.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DriverOrganization) {
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    Employee e = (Employee) ua.getPerson();
                    Object[] row = new Object[3];
                    row[0] = ua;
                    row[1] = e;
                    row[2] = e.getPhone();
                    dtm.addRow(row);
                }
                break;
            }

        }
    }

    private void populateReviewTable() {
        populateDeliveryCenter();
        populateCustomerDistributionjTable();
    }

    public void populateDeliveryCenter() {
        DefaultTableModel dtm = (DefaultTableModel) DistributionCenterjTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof ShippingOrder) {
                Object[] row = new Object[6];
                row[0] = ((ShippingOrder) wr).getStoreEnterprise().getName();
                row[1] = ((ShippingOrder) wr).getStoreAddress();
                row[2] = ((ShippingOrder) wr).getStorePhone();
                row[3] = wr;
                row[4] = wr.dataFormat(wr.getRequestDate());
                if (wr.getResolveDate() != null) {
                    row[5] = wr.dataFormat(wr.getResolveDate());
                }
                dtm.addRow(row);
            }
        }

    }

    public void populateCustomerDistributionjTable() {
        DefaultTableModel dtm = (DefaultTableModel) CustomerDistributionjTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr2 : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr2 instanceof Commodity) {
                Object[] row = new Object[6];
                row[0] = ((Commodity) wr2).getOrder().getSender().getUsername();
                row[1] = ((Commodity) wr2).getCustomerAddress();
                row[2] = ((Commodity) wr2).getCustomerPhone();
                row[3] = wr2;
                if (wr2.getRequestDate() != null) {
                    row[4] = wr2.dataFormat(wr2.getRequestDate());
                }
                if (wr2.getResolveDate() != null) {
                    row[5] = wr2.dataFormat(wr2.getResolveDate());
                }
                dtm.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DistributionCenterjTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CustomerDistributionjTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ManageDeliveryCenterjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryCenterTable = new javax.swing.JTable();
        createPanel = new javax.swing.JPanel();
        CreatejButton1 = new javax.swing.JButton();
        RemovejButton2 = new javax.swing.JButton();
        ManageDriverjPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ManageDriverTable = new javax.swing.JTable();
        workPanel = new javax.swing.JPanel();
        createButton1 = new javax.swing.JButton();
        RemoveDriverjButton3 = new javax.swing.JButton();
        ManageDelivertManJPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ManageDeliveryManTable1 = new javax.swing.JTable();
        workPanel1 = new javax.swing.JPanel();
        createButton2 = new javax.swing.JButton();
        RemoveDeliverymanjButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();
        cancelButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        submitButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 640));

        DistributionCenterjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "StoreName", "StoreAddress", "StorePhoneNumber", "Status", "RequestDate", "ReceivedDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(DistributionCenterjTable);

        jLabel6.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel6.setText("ShippingOrder From Store To DistributionCenter");

        CustomerDistributionjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CustomerName", "CustomerAddress", "CustomerPhoneNumer", "Status", "RequestDate", "DeliveryDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(CustomerDistributionjTable);

        jLabel8.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jLabel8.setText("ShippingOrder from DistributionCenter To Customer ");

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel3.setText("Distribution Overview");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        jTabbedPane1.addTab("Overview", jPanel5);

        DeliveryCenterTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Address", "PhoneNumber"
            }
        ));
        DeliveryCenterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryCenterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DeliveryCenterTable);

        createPanel.setLayout(new java.awt.CardLayout());

        CreatejButton1.setText("Create DeliveryCenter");
        CreatejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatejButton1ActionPerformed(evt);
            }
        });

        RemovejButton2.setText("Remove DeliveryCenter");
        RemovejButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovejButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDeliveryCenterjPanelLayout = new javax.swing.GroupLayout(ManageDeliveryCenterjPanel);
        ManageDeliveryCenterjPanel.setLayout(ManageDeliveryCenterjPanelLayout);
        ManageDeliveryCenterjPanelLayout.setHorizontalGroup(
            ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreatejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RemovejButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );
        ManageDeliveryCenterjPanelLayout.setVerticalGroup(
            ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(ManageDeliveryCenterjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManageDeliveryCenterjPanelLayout.createSequentialGroup()
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CreatejButton1)
                        .addGap(18, 18, 18)
                        .addComponent(RemovejButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDeliveryCenter", ManageDeliveryCenterjPanel);

        ManageDriverjPanel.setPreferredSize(new java.awt.Dimension(900, 640));

        ManageDriverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageDriverTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ManageDriverTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageDriverTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(ManageDriverTable);

        workPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workPanel.setLayout(new java.awt.CardLayout());

        createButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createButton1.setText("Create Driver");
        createButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton1ActionPerformed(evt);
            }
        });

        RemoveDriverjButton3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        RemoveDriverjButton3.setText("Remove Driver");
        RemoveDriverjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDriverjButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDriverjPanelLayout = new javax.swing.GroupLayout(ManageDriverjPanel);
        ManageDriverjPanel.setLayout(ManageDriverjPanelLayout);
        ManageDriverjPanelLayout.setHorizontalGroup(
            ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                        .addComponent(createButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(RemoveDriverjButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        ManageDriverjPanelLayout.setVerticalGroup(
            ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManageDriverjPanelLayout.createSequentialGroup()
                        .addGroup(ManageDriverjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton1)
                            .addComponent(RemoveDriverjButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDriver", ManageDriverjPanel);

        ManageDelivertManJPanel.setPreferredSize(new java.awt.Dimension(900, 640));

        ManageDeliveryManTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManageDeliveryManTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        ManageDeliveryManTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageDeliveryManTable1MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ManageDeliveryManTable1);

        workPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workPanel1.setLayout(new java.awt.CardLayout());

        createButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        createButton2.setText("Create DeliveryMan");
        createButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButton2ActionPerformed(evt);
            }
        });

        RemoveDeliverymanjButton4.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        RemoveDeliverymanjButton4.setText("Remove DeliveryMan");
        RemoveDeliverymanjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveDeliverymanjButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ManageDelivertManJPanelLayout = new javax.swing.GroupLayout(ManageDelivertManJPanel);
        ManageDelivertManJPanel.setLayout(ManageDelivertManJPanelLayout);
        ManageDelivertManJPanelLayout.setHorizontalGroup(
            ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                        .addComponent(createButton2)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveDeliverymanjButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(workPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        ManageDelivertManJPanelLayout.setVerticalGroup(
            ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ManageDelivertManJPanelLayout.createSequentialGroup()
                        .addGroup(ManageDelivertManJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton2)
                            .addComponent(RemoveDeliverymanjButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(workPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ManageDeliveryMan", ManageDelivertManJPanel);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("DeliveryAgentName:");

        nameTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Address: ");

        addressTextArea.setColumns(20);
        jScrollPane4.setViewportView(addressTextArea);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Phone:");

        phoneTextField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        editButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(phoneTextField))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(284, 284, 284))
        );

        jTabbedPane1.addTab("ManageDeliveryAgentInformation", jPanel1);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Old Password:");

        cancelButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton1.setText("Cancel");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setText("Confirm Password:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("New Password:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(cancelButton1))
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", jPanel6);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DeliveryCenterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryCenterTableMouseClicked
        /* int index = DeliveryCenterTable.getSelectedRow();

        if (index >= 0) {
            DistributionCenter item = (DistributionCenter) DeliveryCenterTable.getValueAt(index, 0);

            RemovejButton2.setEnabled(true);
        }*/
    }//GEN-LAST:event_DeliveryCenterTableMouseClicked

    private void CreatejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatejButton1ActionPerformed
        CreateDeliveryCenterJPanel p = new CreateDeliveryCenterJPanel(system, this, createPanel, enterprise);
        this.createPanel.add(p);
        CardLayout layout = (CardLayout) createPanel.getLayout();
        layout.next(createPanel);
    }//GEN-LAST:event_CreatejButton1ActionPerformed

    private void RemovejButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovejButton2ActionPerformed

        int selectedRow = DeliveryCenterTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Organization org = (Organization) DeliveryCenterTable.getValueAt(selectedRow, 0);
        enterprise.getOrganizationDirectory().getOrganizationList().remove(org);
        DB4OUtil.getInstance().storeSystem(system);
        populateDeliveryCenterTable();
    }//GEN-LAST:event_RemovejButton2ActionPerformed

    private void ManageDriverTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageDriverTableMouseClicked

    }//GEN-LAST:event_ManageDriverTableMouseClicked

    private void createButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton1ActionPerformed
        this.workPanel.removeAll();
        CreateDriverJPanel ep = new CreateDriverJPanel(this.system, this, this.workPanel, this.enterprise);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) this.workPanel.getLayout();
        layout.next(this.workPanel);
    }//GEN-LAST:event_createButton1ActionPerformed

    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton1ActionPerformed
        passwordField.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
    }//GEN-LAST:event_cancelButton1ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        char[] passwordCharArray = passwordField2.getPassword();
        String password = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = passwordField.getPassword();
        String new1 = String.valueOf(passwordCharArray1);
        char[] passwordCharArray2 = passwordField1.getPassword();
        String new2 = String.valueOf(passwordCharArray2);

        if (password.equals(account.getPassword())) {
            if (!new1.equals("")) {
                if (new1.equals(new2)) {
                    account.setPassword(new1);
                    JOptionPane.showMessageDialog(null, "Password updated successfully!");
                    DB4OUtil.getInstance().storeSystem(system);
                    passwordField.setText("");
                    passwordField1.setText("");
                    passwordField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords don't match!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password can't be empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correct!");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        editButton.setEnabled(false);

        setOverviewFieldsEditable(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (!phoneTextField.getText().equals("") && !addressTextArea.getText().equals("")
                && !nameTextField.getText().equals("")) {
            try {
                long l = Long.parseLong(phoneTextField.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect phone number input format!");
                return;
            }
            deliveryAgent.setName(nameTextField.getText());
            deliveryAgent.setAddress(addressTextArea.getText());
            deliveryAgent.setPhoneNumber(phoneTextField.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setOverviewFieldsEditable(false);
        setOverviewInfo();
        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setOverviewFieldsEditable(false);
        setOverviewInfo();

        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void ManageDeliveryManTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageDeliveryManTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageDeliveryManTable1MouseClicked

    private void createButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButton2ActionPerformed
        // TODO add your handling code here:
        this.workPanel1.removeAll();
        CreateDeliveryManJPanel ep = new CreateDeliveryManJPanel(this.system, this, this.workPanel1, this.enterprise);
        this.workPanel1.add(ep);
        CardLayout layout = (CardLayout) this.workPanel1.getLayout();
        layout.next(this.workPanel1);
    }//GEN-LAST:event_createButton2ActionPerformed

    private void RemoveDriverjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDriverjButton3ActionPerformed
        int selectedRow = ManageDriverTable.getSelectedRow();

        UserAccount ua = (UserAccount) ManageDriverTable.getValueAt(selectedRow, 0);
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DriverOrganization drorg = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DriverOrganization) {
                drorg = (DriverOrganization) org;
                break;
            }

        }
        drorg.getUserAccountDirectory().removeUserAccount(ua);

        DB4OUtil.getInstance().storeSystem(system);
        populateDriver();

    }//GEN-LAST:event_RemoveDriverjButton3ActionPerformed

    private void RemoveDeliverymanjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveDeliverymanjButton4ActionPerformed
        int selectedRow = ManageDeliveryManTable1.getSelectedRow();

        UserAccount ua = (UserAccount) ManageDeliveryManTable1.getValueAt(selectedRow, 0);
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DeliveryManOrganization drorg = null;
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (org instanceof DeliveryManOrganization) {
                drorg = (DeliveryManOrganization) org;
                break;
            }

        }
        drorg.getUserAccountDirectory().removeUserAccount(ua);

        DB4OUtil.getInstance().storeSystem(system);
        populateDeliveryMan();

    }//GEN-LAST:event_RemoveDeliverymanjButton4ActionPerformed
    private void setOverviewFieldsEditable(boolean b) {
        nameTextField.setEnabled(b);
        phoneTextField.setEnabled(b);
        addressTextArea.setEnabled(b);
    }

    private void setOverviewInfo() {
        nameTextField.setText(deliveryAgent.getName());
        phoneTextField.setText(deliveryAgent.getPhoneNumber());
        addressTextArea.setText(deliveryAgent.getAddress());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreatejButton1;
    private javax.swing.JTable CustomerDistributionjTable;
    private javax.swing.JTable DeliveryCenterTable;
    private javax.swing.JTable DistributionCenterjTable;
    private javax.swing.JPanel ManageDelivertManJPanel;
    private javax.swing.JPanel ManageDeliveryCenterjPanel;
    private javax.swing.JTable ManageDeliveryManTable1;
    private javax.swing.JTable ManageDriverTable;
    private javax.swing.JPanel ManageDriverjPanel;
    private javax.swing.JButton RemoveDeliverymanjButton4;
    private javax.swing.JButton RemoveDriverjButton3;
    private javax.swing.JButton RemovejButton2;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton createButton1;
    private javax.swing.JButton createButton2;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JPanel workPanel;
    private javax.swing.JPanel workPanel1;
    // End of variables declaration//GEN-END:variables
}
