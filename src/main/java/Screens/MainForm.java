package Screens;

import POJOs.Adventurer;
import Utils.ErrorsHandler;
import Utils.FileManagementTools;
import java.util.ArrayList;

public class MainForm extends javax.swing.JFrame {

    private ArrayList<Adventurer> adventurersList = new ArrayList<>();
    private final FileManagementTools fileManagementTools = new FileManagementTools();
    private final ErrorsHandler errorsHandler = new ErrorsHandler();

    public MainForm() {
        initComponents();
        fileManagementTools.CheckFileExist();
        this.setLocationRelativeTo(null);
        fileManagementTools.ReadFile(adventurersList);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblRaces = new javax.swing.JLabel();
        cmbRaces = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cmbGender = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JLabel();
        btnList = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Character Creator");

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTitle.setText("Character creator");

        lblName.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblName.setText("Name of the character");

        lblAge.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblAge.setText("Age");

        lblRaces.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRaces.setText("Playable races");

        cmbRaces.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbRaces.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a race", "Human", "Undead", "Void Born", "Orc" }));

        btnCreate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCancel.setText("Reset");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cmbGender.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a gender", "Male", "Female", "Other" }));

        lblGender.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblGender.setText("Gender");

        btnList.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnList.setText("List of characters");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbRaces, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRaces, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnCreate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnList)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbGender, 0, 202, Short.MAX_VALUE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRaces, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnCancel)
                    .addComponent(btnList))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        try {

            errorsHandler.CheckErrors(txtName.getText(), txtAge.getText(), cmbGender.getSelectedItem().toString(), cmbRaces.getSelectedItem().toString(), lblError);

            if (lblError.getText().equals("")) {
                
                Adventurer adventurer = new Adventurer(
                        txtName.getText(),
                        Integer.parseInt(txtAge.getText()),
                        cmbRaces.getSelectedItem().toString(),
                        cmbGender.getSelectedItem().toString()
                );
                adventurersList.add(adventurer);
                lblError.setText("");
                fileManagementTools.WriteFile(adventurersList);
            }
        } catch (Exception e) {
            lblError.setText("The age can not be anything but integer numbers");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed

        txtName.setText("");
        txtAge.setText("");
        cmbRaces.setSelectedIndex(0);
        cmbGender.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed

        CharactersListForm characterListForm = new CharactersListForm(this, false);
        characterListForm.setVisible(true);
    }//GEN-LAST:event_btnListActionPerformed

    public ArrayList<Adventurer> getList() {
        return adventurersList;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnList;
    private javax.swing.JComboBox<String> cmbGender;
    private javax.swing.JComboBox<String> cmbRaces;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRaces;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
