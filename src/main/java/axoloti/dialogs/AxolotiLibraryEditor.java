/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package axoloti.dialogs;

import axoloti.utils.AxoGitLibrary;
import axoloti.utils.AxolotiLibrary;

/**
 *
 * @author kodiak
 */
public class AxolotiLibraryEditor extends javax.swing.JDialog {

    private AxolotiLibrary library;

    /**
     * Creates new form AxolotiLibrary
     *
     * @param parent
     * @param modal
     */
    public AxolotiLibraryEditor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        library = new AxolotiLibrary();
        populate();
        setVisible(true);
    }

    public AxolotiLibraryEditor(java.awt.Frame parent, boolean modal, AxolotiLibrary lib) {
        super(parent, modal);
        initComponents();
        library = lib;
        populate();
        setVisible(true);
    }

    final void populate() {
        jId.setText(library.getId());
        jEnabled.setSelected(library.getEnabled());
        jLocalDir.setText(library.getLocalLocation());
        jRemotePath.setText(library.getRemoteLocation());
        jUserId.setText(library.getUserId());
        jPassword.setText(library.getPassword());
        jAutoSync.setSelected(library.isAutoSync());

        String[] types = {"local", "git"};
        jTypeCombo.removeAllItems();
        for (String t : types) {
            jTypeCombo.addItem(t);
        }
        jTypeCombo.setSelectedItem(library.getType());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTypeCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jLocalDir = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRemotePath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jUserId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jEnabled = new javax.swing.JCheckBox();
        jPassword = new javax.swing.JPasswordField();
        jOK = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jInitRepo = new javax.swing.JButton();
        jAutoSync = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTypeCombo.setPreferredSize(new java.awt.Dimension(100, 28));
        jTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTypeComboActionPerformed(evt);
            }
        });

        jLabel1.setText("Type");

        jId.setMinimumSize(new java.awt.Dimension(100, 28));
        jId.setPreferredSize(new java.awt.Dimension(100, 28));

        jLocalDir.setPreferredSize(new java.awt.Dimension(400, 28));

        jLabel2.setText("Id");

        jLabel3.setText("Directory");

        jRemotePath.setPreferredSize(new java.awt.Dimension(400, 28));

        jLabel4.setText("Remote Path");

        jLabel5.setText("Remote Library Details:");

        jUserId.setMinimumSize(new java.awt.Dimension(14, 50));
        jUserId.setPreferredSize(new java.awt.Dimension(150, 28));

        jLabel6.setText("User Id");

        jLabel7.setText("Password");

        jEnabled.setText("Enabled");

        jPassword.setText("jPasswordField1");
        jPassword.setPreferredSize(new java.awt.Dimension(150, 28));

        jOK.setText("OK");
        jOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOKActionPerformed(evt);
            }
        });

        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jInitRepo.setText("Init");
        jInitRepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInitRepoActionPerformed(evt);
            }
        });

        jAutoSync.setText("Auto Sync");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTypeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEnabled))
                            .addComponent(jLocalDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRemotePath, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jInitRepo))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(138, 138, 138)
                                    .addComponent(jAutoSync))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCancel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jEnabled))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLocalDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRemotePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jAutoSync))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInitRepo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOK)
                    .addComponent(jCancel))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTypeComboActionPerformed
    }//GEN-LAST:event_jTypeComboActionPerformed

    private void jOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOKActionPerformed
        library.setId(jId.getText().trim());
        library.setLocalLocation(jLocalDir.getText().trim());
        library.setRemoteLocation(jRemotePath.getText().trim());
        library.setUserId(jUserId.getText().trim());
        library.setPassword(new String(jPassword.getPassword()));
        library.setEnabled(jEnabled.isSelected());
        library.setType((String) jTypeCombo.getSelectedItem());
        library.setAutoSync(jAutoSync.isSelected());
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jOKActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jCancelActionPerformed

    private void jInitRepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInitRepoActionPerformed
        AxoGitLibrary gitlib = new AxoGitLibrary(jId.getText().trim(), (String) jTypeCombo.getSelectedItem(), jLocalDir.getText().trim(), jEnabled.isSelected(), jRemotePath.getText().trim(), jAutoSync.isSelected());
        gitlib.setUserId(jUserId.getText().trim());
        gitlib.setPassword(new String(jPassword.getPassword()));
        gitlib.init();
    }//GEN-LAST:event_jInitRepoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jAutoSync;
    private javax.swing.JButton jCancel;
    private javax.swing.JCheckBox jEnabled;
    private javax.swing.JTextField jId;
    private javax.swing.JButton jInitRepo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jLocalDir;
    private javax.swing.JButton jOK;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jRemotePath;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jTypeCombo;
    private javax.swing.JTextField jUserId;
    // End of variables declaration//GEN-END:variables

    public AxolotiLibrary getLibrary() {
        return library;
    }

    public void setLibrary(AxolotiLibrary library) {
        this.library = library;
    }
}
